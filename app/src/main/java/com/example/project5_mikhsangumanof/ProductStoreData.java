package com.example.project5_mikhsangumanof;

public class ProductStoreData {
    private int detailImage;
    private String textDesc;
    private String nama;

    public ProductStoreData(int detailImage, String nama, String textDesc){
        this.detailImage = detailImage;
        this.nama = nama;
        this.textDesc = textDesc;
    }

    public int getDetailImage() {
        return detailImage;
    }

    public String getNama() {
        return nama;
    }

    public String getTextDesc() {
        return textDesc;
    }
}