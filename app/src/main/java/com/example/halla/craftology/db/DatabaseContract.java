package com.example.halla.craftology.db;

/**
 * Created by Halla on 31/10/2016.
 */
public class DatabaseContract {
     String DATABASE_NAME = "craftologyDB";
     String TABLE_PRODUCTS = "products";

     String PRODUCT_ID = "product_id";
     String PRODUCT_IMG_PATH = "product_img_path";

     String CREATE_PRODUCTS = "create table " + TABLE_PRODUCTS + "("
            + PRODUCT_ID + " integer primary key autoincrement, " + PRODUCT_IMG_PATH
            + " text not null)";


}
