package com.l3azh.androidlab;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Categories implements Serializable {
    String name;
    int id;
    ArrayList<Furniture> arrayList;
    Bitmap image;
    String image1;
    public Categories(String name, ArrayList<Furniture> arrayList) {
        this.name = name;
        this.arrayList = arrayList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Categories(String name, String img) {
        this.name = name;
        this.image1 = img;
    }

    public Categories(String name, String img, int id) {
        this.name = name;
        this.image1 = img;
        this.id = id;
    }
    public Categories(String name, ArrayList<Furniture> arrayList, Bitmap image) {
        this.name = name;
        this.arrayList = arrayList;
        this.image = image;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Furniture> getArrayList() {
        return arrayList;
    }
    public void setArrayList(ArrayList<Furniture> arrayList) {
        this.arrayList = arrayList;
    }
    public Bitmap getImage() {
        return image;
    }
    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public static Bitmap convertStringToBitmapFromAccess(Context context, String
            filename){
        AssetManager assetManager = context.getAssets();
        try {
            InputStream is = assetManager.open(filename);
            Bitmap bitmap = BitmapFactory.decodeStream(is);
            return bitmap;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
