package com.example.Entity;

import java.time.LocalDateTime;

public abstract class Base {

    public static final int DISABLED = 0;
    public static final int ENABLED = 1;
    public static final int REMOVED = 3;

    protected int id;
    protected int status = ENABLED;
    protected LocalDateTime dateCreated;

    protected String title;

    public Base() {
        this.dateCreated = LocalDateTime.now();
    }

    public boolean isActive() {
        return this.status == ENABLED;
    }

    public Base(LocalDateTime dateCreated, int id, int status, String title) {
        this.dateCreated = dateCreated;
        this.id = id;
        this.status = status;
        this.title = title;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
