package com.example.webview_hacaton;

public class State {
    private String name; // название
    private String description;  // описание
    private String data; // дата
    private int flagResource; // ресурс флага
    private float rating; //рейтинг
    private  String url; //ссылка на видео



    public State(String name, String description, String data ,int flag , float rating, String url){

        this.name=name;
        this.description=description;
        this.flagResource=flag;
        this.data=data;
        this.rating=rating;
        this.url = url;
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
    public  String getData(){
        return this.data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public int getFlagResource() {
        return this.flagResource;
    }

    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }
    public float getRating() {
        return this.rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
    public String getUrl(){
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

