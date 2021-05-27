package com.example.project5_mikhsangumanof;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListMenuAdapter extends RecyclerView.Adapter<ListMenuAdapter.ViewHolder> {
    private ListDataMenu[] listData;

    public ListMenuAdapter(ListDataMenu[] listDataMenu) {
        this.listData = listDataMenu;
    }

    @NonNull
    @Override
    public ListMenuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_item, parent, false);

        return new ViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ListMenuAdapter.ViewHolder holder, int position) {
        final ListDataMenu listDataMenu = listData[position];
        holder.textView.setText(listData[position].getListMenu());
        holder.imageView.setImageResource(listData[position].getImageMenu());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Item Selected : "+listDataMenu.getListMenu(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        public RelativeLayout relativeLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageView);
            this.textView = itemView.findViewById(R.id.textView1);
            relativeLayout = itemView.findViewById(R.id.relativeLayout);
        }
    }
}
