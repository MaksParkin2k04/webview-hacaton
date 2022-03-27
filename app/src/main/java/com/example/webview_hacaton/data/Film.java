package com.example.webview_hacaton.data;

public class Film {
    public Film(String name, String description, String data ,int flag , float rating, String url){

        this.name=name;
        this.description=description;
        this.flagResource=flag;
        this.data=data;
        this.rating=rating;
        this.url = url;
    }

    private String name; // название
    private String description;  // описание
    private String data; // дата
    private int flagResource; // ресурс флага
    private float rating; //рейтинг
    private  String url; //ссылка на видео

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getData() {
        return data;
    }

    public int getFlagResource() {
        return flagResource;
    }

    public float getRating() {
        return rating;
    }

    public String getUrl() {
        return url;
    }
}
