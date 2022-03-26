package com.example.webview_hacaton;

public class State {
    private String name; // название
    private String description;  // описание
    private int flagResource; // ресурс флага

    public State(String name, String description ,int flag){

        this.name=name;
        this.description=description;
        this.flagResource=flag;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFlagResource() {
        return this.flagResource;
    }

    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }
}

