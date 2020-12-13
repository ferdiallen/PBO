package com.ngoding.android.kulinerindonesia;

public class Food implements FoodIn {
    private String name;
    private String detail;
    private String bahan;
    private String memasak;
    private int photo;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String getDetail() {
        return detail;
    }

    @Override
    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    @Override
    public String getBahan() {
        return bahan;
    }

    @Override
    public void setMemasak(String memasak) {
        this.memasak = memasak;
    }

    @Override
    public String getMemasak() {
        return memasak;
    }

    @Override
    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int getPhoto() {
        return photo;
    }
}