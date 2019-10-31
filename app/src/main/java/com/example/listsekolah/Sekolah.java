package com.example.listsekolah;

public class Sekolah {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }



    public String getSejarah() {

        return sejarah;
    }

    public void setSejarah(String sejarah) {
        this.sejarah = sejarah;
    }

    public String getBerdiri() {
        return berdiri;
    }

    public void setBerdiri(String berdiri) {
        this.berdiri = berdiri;
    }

    private String name;
    private String berdiri;
    private String detail;
    private String sejarah;
    private int photo;
}
