package com.example.halla.craftology.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Halla on 31/10/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    private static DatabaseContract mDatabaseContract = new DatabaseContract();
    private static int databaseVersion = 4;
    private SQLiteDatabase sqLiteDatabase;

    public DatabaseHelper(Context context) {
        super(context, mDatabaseContract.DATABASE_NAME, null, databaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(mDatabaseContract.CREATE_PRODUCTS);
        db.execSQL("insert into " + mDatabaseContract.TABLE_PRODUCTS + " (" + mDatabaseContract.PRODUCT_IMG_PATH
        + ") values ('https://fbcdn-photos-b-a.akamaihd.net/hphotos-ak-xpt1/v/t1.0-0/p480x480/14519665_1854754734761604_7672225235363890849_n.jpg?oh=a809326771038a589c18919008d27577&oe=58A3F902&__gda__=1486595086_f2fa2ff99cf56086bd88899cc9016fc1')");

        db.execSQL("insert into " + mDatabaseContract.TABLE_PRODUCTS + " (" +
                mDatabaseContract.PRODUCT_IMG_PATH
                + ") values ('https://scontent-bru2-1.xx.fbcdn.net/v/l/t1.0-9/13882691_1827530390817372_8479222276602927024_n.jpg?oh=5a84c1f316279fda877410b04cbe5bf1&oe=58A4F9E6')");

        db.execSQL("insert into " + mDatabaseContract.TABLE_PRODUCTS + " (" +
                mDatabaseContract.PRODUCT_IMG_PATH
                + ") values ('https://scontent-bru2-1.xx.fbcdn.net/v/t1.0-9/13669653_1822073721363039_4211656678246609895_n.jpg?oh=c357ebcca98eee51f131763e120b615c&oe=589B5FA9')");


        db.execSQL("insert into " + mDatabaseContract.TABLE_PRODUCTS + " (" +
                mDatabaseContract.PRODUCT_IMG_PATH
                + ") values ('https://scontent-bru2-1.xx.fbcdn.net/v/t1.0-9/13620077_1821692914734453_6771019214000614338_n.jpg?oh=5d0459a9785a5b582f857df29dfe8c6d&oe=5897744B')");


        db.execSQL("insert into " + mDatabaseContract.TABLE_PRODUCTS + " (" +
                mDatabaseContract.PRODUCT_IMG_PATH
                + ") values ('https://fb-s-c-a.akamaihd.net/h-ak-xtf1/v/t1.0-0/p480x480/10325156_1763948843842194_6112511754085489795_n.jpg?oh=7c30429ddfd55eec8dd9c3f24acf0282&oe=58CF1CBD&__gda__=1485909675_79b45010d889ac2fe915556ba68577b8')");

        db.execSQL("insert into " + mDatabaseContract.TABLE_PRODUCTS + " (" +
                mDatabaseContract.PRODUCT_IMG_PATH
                + ") values ('https://fbcdn-photos-c-a.akamaihd.net/hphotos-ak-xtf1/v/t1.0-0/s526x395/10271607_1763015327268879_1852753880145266279_n.jpg?oh=c4536f98b60b117fa2ff193fa2409ae1&oe=58D11899&__gda__=1490212488_54cbbc916964abe6595f9af01231b940')");

        db.execSQL("insert into " + mDatabaseContract.TABLE_PRODUCTS + " (" +
                mDatabaseContract.PRODUCT_IMG_PATH
                + ") values ('https://fbcdn-photos-c-a.akamaihd.net/hphotos-ak-xtf1/v/t1.0-0/s526x395/10271607_1763015327268879_1852753880145266279_n.jpg?oh=c4536f98b60b117fa2ff193fa2409ae1&oe=58D11899&__gda__=1490212488_54cbbc916964abe6595f9af01231b940')");

        db.execSQL("insert into " + mDatabaseContract.TABLE_PRODUCTS + " (" +
                mDatabaseContract.PRODUCT_IMG_PATH
                + ") values ('https://fbcdn-photos-c-a.akamaihd.net/hphotos-ak-xfp1/v/t1.0-0/p480x480/12814481_1759663004270778_2877850840805983629_n.jpg?oh=dc64ed147dfb114437457f893b40412c&oe=58D1E49E&__gda__=1486730063_1dd30453844f5b2d7f2efbfa2ea8f14c')");

        db.execSQL("insert into " + mDatabaseContract.TABLE_PRODUCTS + " (" +
                mDatabaseContract.PRODUCT_IMG_PATH
                + ") values ('https://scontent-lhr3-1.xx.fbcdn.net/v/t1.0-9/12745615_1752349955002083_1669538919247308774_n.jpg?oh=2aa21296c76c498831fb9bd4f59432df&oe=588F0289')");

        db.execSQL("insert into " + mDatabaseContract.TABLE_PRODUCTS + " (" +
                mDatabaseContract.PRODUCT_IMG_PATH
                + ") values ('https://fbcdn-photos-a-a.akamaihd.net/hphotos-ak-xfp1/v/t1.0-0/p480x480/12745928_1753358868234525_2737492443623893734_n.jpg?oh=8a8b7bb57e6f8b811d25ca4ee0e0d31e&oe=58A07F16&__gda__=1490162119_80438b0783d9f3de700dd3216bdecf8c')");


        db.execSQL("insert into " + mDatabaseContract.TABLE_PRODUCTS + " (" +
                mDatabaseContract.PRODUCT_IMG_PATH
                + ") values ('https://fbcdn-photos-a-a.akamaihd.net/hphotos-ak-xfp1/v/t1.0-0/p480x480/12742643_1752349745002104_7522620999946810853_n.jpg?oh=dee6c4180bf0760a8166f7e772bacf4b&oe=588F2891&__gda__=1486380608_ec56356ec7b08eca9082f6126f76a54c')");


        db.execSQL("insert into " + mDatabaseContract.TABLE_PRODUCTS + " (" +
                mDatabaseContract.PRODUCT_IMG_PATH
                + ") values ('https://scontent-lhr3-1.xx.fbcdn.net/v/t1.0-9/14469638_1854755498094861_6251989298014650659_n.jpg?oh=5cfe241da72703c2f909b7becfd3f193&oe=58CE006D')");


        db.execSQL("insert into " + mDatabaseContract.TABLE_PRODUCTS + " (" +
                mDatabaseContract.PRODUCT_IMG_PATH
                + ") values ('https://scontent-lhr3-1.xx.fbcdn.net/v/t1.0-9/12745679_1753848004852278_8228172067075125009_n.jpg?oh=c56746a387a7222072a20a8ef046a57f&oe=58A162CD')");

        db.execSQL("insert into " + mDatabaseContract.TABLE_PRODUCTS + " (" +
                mDatabaseContract.PRODUCT_IMG_PATH
                + ") values ('https://scontent-lhr3-1.xx.fbcdn.net/v/t1.0-9/12705523_1754272388143173_7781242341105884938_n.jpg?oh=f9cf9144fa798c8d4206cf449e06b759&oe=58D113FA')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + mDatabaseContract.TABLE_PRODUCTS);
        onCreate(db);
    }

    public Cursor fetchAllData(){
        String [] args = {mDatabaseContract.PRODUCT_IMG_PATH};
        sqLiteDatabase = getReadableDatabase();

        Cursor cursor = sqLiteDatabase.rawQuery("select " + mDatabaseContract.PRODUCT_IMG_PATH + " from " + mDatabaseContract.TABLE_PRODUCTS,null);

        if(cursor.getCount() != 0){
            cursor.moveToFirst();
            return cursor;
        }
        else
            return null;
    }
}
