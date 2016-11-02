package com.example.halla.craftology.activities;

import android.animation.Animator;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.halla.craftology.CustomAdapter;
import com.example.halla.craftology.Dialog;
import com.example.halla.craftology.R;
import com.example.halla.craftology.db.DatabaseHelper;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private Animator mCurrentAnimator;
    private int mShortAnimationDuration;

    CustomAdapter mCustomAdapter;
    GridView mGridView;


    ArrayList<String> itemsImg, itemsText;
    DatabaseHelper mDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.logo);
        getSupportActionBar().setTitle("كرفتولوجي");


        itemsText = new ArrayList<>();
        itemsImg = new ArrayList<>();

        itemsText.add("Brace Yourself");
        itemsText.add("#jewellery_organiser");
        itemsText.add("#harrypotter_font");
        itemsText.add("#craftology");
        itemsText.add("#كرفتولوجي");
        itemsText.add("#Craftology");
        itemsText.add("#كرفتولوجي");
        itemsText.add("#Craftology");
        itemsText.add("#كرفتولوجي");
        itemsText.add("#Craftology");
        itemsText.add("#كرفتولوجي");
        itemsText.add("#Craftology");
        itemsText.add("#كرفتولوجي");
        itemsText.add("#Craftology");
        itemsText.add("#كرفتولوجي");
        itemsText.add("#Craftology");
        itemsText.add("#كرفتولوجي");
        itemsText.add("#Craftology");
        itemsText.add("#كرفتولوجي");
        itemsText.add("#Craftology");
        itemsText.add("#كرفتولوجي");
        itemsText.add("#Craftology");
        itemsText.add("#كرفتولوجي");
        itemsText.add("#Craftology");
        itemsText.add("#كرفتولوجي");
        itemsText.add("#Craftology");
        itemsText.add("#كرفتولوجي");
        itemsText.add("#Craftology");


        mDatabaseHelper = new DatabaseHelper(HomeActivity.this);
        Cursor allData = mDatabaseHelper.fetchAllData();
        if(allData.getCount() != 0){
            int cursorLength = allData.getCount();
            for(int i=0;i<cursorLength;i++){
                itemsImg.add(allData.getString(0));
                allData.moveToNext();
            }
        }

        mGridView = (GridView) findViewById(R.id.grid_items);
        mCustomAdapter = new CustomAdapter(HomeActivity.this, itemsImg, itemsText);

        mGridView.setAdapter(mCustomAdapter);

        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog.newInstance(itemsImg.get(position),HomeActivity.this).show(getSupportFragmentManager(),"Yay!");
            }
        });
    }

}
