package com.example.badmintonapi.domain;

public class Notice {
    private int id;

    private String title;

    private String content;

    private int top;

    private String time;

    private String promulgator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPromulgator() {
        return promulgator;
    }

    public void setPromulgator(String promulgator) {
        this.promulgator = promulgator;
    }
}
