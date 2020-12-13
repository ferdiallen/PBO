package com.ngoding.android.kulinerindonesia;

public interface FoodIn {
    void setName(String name);
    void setDetail(String detail);
    void setBahan(String bahan);
    void setMemasak(String memasak);
    void setPhoto(int photo);

    String getName();
    String getDetail();
    String getBahan();
    String getMemasak();
    int getPhoto();
}
