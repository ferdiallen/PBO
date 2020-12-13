package com.ngoding.android.kulinerindonesia;

public class ProfileData extends Profile {
    private String nama;
    private String email;
    private String nama1;
    private int tahun;

    @Override
    public String nama() {
        nama = "Edo Sugita Ibrahim";
        return nama;
    }

    @Override
    public String email() {
        email = "edosugita.es@gmail.com";
        return email;
    }

    @Override
    public String ubah(String x) {
        nama = x;
        return x;
    }

    @Override
    public int ubah(int y) {
        tahun = y;
        return tahun;
    }

}
