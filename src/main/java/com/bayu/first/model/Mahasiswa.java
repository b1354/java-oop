package com.bayu.first.model;

public class Mahasiswa {
    String nim;
    String nama;
    String alamat;
    String photo;
    
    public Mahasiswa(String nim, String nama, String alamat, String photo) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.photo = photo;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getPhoto() {
        return photo;
    }

     
}
