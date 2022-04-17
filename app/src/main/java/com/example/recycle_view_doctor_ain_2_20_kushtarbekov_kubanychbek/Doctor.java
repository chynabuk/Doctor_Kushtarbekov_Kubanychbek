package com.example.recycle_view_doctor_ain_2_20_kushtarbekov_kubanychbek;

public class Doctor {
    private String name;
    private String position;
    private int image;
    private String room;

    public Doctor(String name, String position, int image, String room){
        this.name = name;
        this.position = position;
        this.image = image;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}