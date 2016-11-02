package com.example.halla.craftology;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Halla on 31/10/2016.
 */
public class CustomAdapter extends BaseAdapter {

    private ArrayList<String> mItemImg;
    private ArrayList<String> mItemText;
    private Context mContext;

    public CustomAdapter (Context context, ArrayList<String> itemImg, ArrayList<String> itemText){
        mItemImg = itemImg;
        mItemText = itemText;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mItemImg.size();
    }

    @Override
    public Object getItem(int position) {
        return mItemImg.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.grid_item,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.imgItem = (ImageView) convertView.findViewById(R.id.img_item);
            viewHolder.textItem = (TextView) convertView.findViewById(R.id.tv_item);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.textItem.setText(mItemText.get(position));
        Picasso.with(mContext).load(mItemImg.get(position)).resize(700,900).into(viewHolder.imgItem);

        return convertView;
    }

    public class ViewHolder{
        private ImageView imgItem;
        private TextView textItem;
    }
}
