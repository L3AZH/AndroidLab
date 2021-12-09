package com.l3azh.androidlab;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

public class Furniture implements Serializable {
    String name;
    String description;
    Bitmap image;
    String image1;
    int intImage;
    String strImg;
    Categories categories;
    int id;
    public Furniture(String name, String description, Bitmap image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }
    public Furniture(String name, String description, String image, Categories categories, int id) {
        this.name = name;
        this.description = description;
        this.image1 = image;
        this.categories = categories;
        this.id = id;
    }

    public Furniture(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.intImage = image;
    }
    public Furniture(String name, String description, String image) {
        this.name = name;
        this.description = description;
        this.image1 = image;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Bitmap getImage() {
        return image;
    }
    public void setImage(Bitmap image) {
        this.image = image;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
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

