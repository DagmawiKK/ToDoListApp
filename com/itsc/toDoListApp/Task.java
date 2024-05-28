package com.itsc.toDoListApp;
public class Task {
     String title;
     String description;
     boolean completed;

    public Task (String title, String description) {
        this.title = title;
        this.description = description;
        completed = false;
    }

    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    boolean isCompleted() {
        return completed == true;
    }
    void markCompleted() {
        completed = true;
    }
}
