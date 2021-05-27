package com.example.project5_mikhsangumanof;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgrammingAdapter extends BaseAdapter {
    Context context;
    String progList[];
    int imageIcon[];
    LayoutInflater inflater;

    public ProgrammingAdapter(Context context,String[] progList, int[] imageIcon){
        this.context = context;
        this.progList = progList;
        this.imageIcon = imageIcon;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return progList.length;
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
        convertView = inflater.inflate(R.layout.list_image,null);
        TextView prog = convertView.findViewById(R.id.textView);
        ImageView icon = convertView.findViewById(R.id.icon);

        prog.setText(progList[position]);
        icon.setImageResource(imageIcon[position]);
        return convertView;
    }
}
