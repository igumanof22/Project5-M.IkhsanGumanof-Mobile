package com.example.project5_mikhsangumanof;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    Context context;
    int gridImage[];
    LayoutInflater inflater;

    public GridAdapter(Context context, int[] gridImage){
        this.context = context;
        this.gridImage = gridImage;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return gridImage.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.grid_image, null);
        ImageView image = convertView.findViewById(R.id.iconGrid);
        image.setImageResource(gridImage[position]);
        return convertView;
    }
}
