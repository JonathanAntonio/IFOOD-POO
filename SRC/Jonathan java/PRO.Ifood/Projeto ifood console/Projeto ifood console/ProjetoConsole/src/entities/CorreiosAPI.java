package entities;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.json.Json;
import javax.json.JsonObject;

public class CorreiosAPI {
	

	public static void consultarCep(String cep) throws Exception {
		try {
			Controller controller=new Controller();

			final String API_URL = "https://viacep.com.br/ws/";

			HttpClient client = HttpClient.newHttpClient();

			HttpRequest request = HttpRequest.newBuilder().uri(URI.create(API_URL + cep + "/json/")).build();

			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			if (response.statusCode() == 200) {
				ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(response.body().getBytes());
				InputStreamReader reader = new InputStreamReader(byteArrayInputStream);
				JsonObject jsonObject = Json.createReader(reader).readObject();
				String responseBody = response.body();

				String bairro = jsonObject.containsKey("bairro") ? jsonObject.getString("bairro") : "Não disponível";
				String cidade = jsonObject.containsKey("localidade") ? jsonObject.getString("localidade")
						: "Não disponível";
				String estado = jsonObject.containsKey("uf") ? jsonObject.getString("uf") : "Não disponível";

				System.out.println("Bairro: " + bairro);
				System.out.println("Cidade: " + cidade);
				System.out.println("Estado: " + estado);
				controller.pausar();
				

			} else {
				 throw new Exception("Erro ao consultar o cep");
				
			}

		} catch (Exception e) {
			 throw new Exception("Erro ao consultar o CEP: " + e.getMessage());
			
		}

	}
}
