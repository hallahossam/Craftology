package com.example.halla.craftology;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by Halla on 02/11/2016.
 */
public class Dialog extends DialogFragment {

    private static String temp;
    private static Context mContext;
    ImageView itemProduct;
    FloatingActionButton fabAddToCart;

    public Dialog(){

    }

    public static Dialog newInstance (String imagePath, Context context){
        Dialog frag = new Dialog();
        temp = imagePath;
        mContext = context;
        Bundle args = new Bundle();
        args.putString("imagePath", imagePath);
        frag.setArguments(args);
        return frag;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_item, container, false);
        return view;
    }
    @Override
    public void onViewCreated(View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        itemProduct = (ImageView) view.findViewById(R.id.img_selected_item);
        fabAddToCart = (FloatingActionButton) view.findViewById(R.id.fab_order);

        Picasso.with(mContext).load(temp).into(itemProduct);
        fabAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "0114 236 6005";
                Uri uri = Uri.parse("smsto:" + number);
                Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                i.setPackage("com.whatsapp");
                startActivity(Intent.createChooser(i, ""));
            }
        });

        getDialog().getWindow().setSoftInputMode(WindowManager.LayoutParams.
                SOFT_INPUT_STATE_HIDDEN);;

    }

    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
        android.app.Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        return dialog;
    }


}
