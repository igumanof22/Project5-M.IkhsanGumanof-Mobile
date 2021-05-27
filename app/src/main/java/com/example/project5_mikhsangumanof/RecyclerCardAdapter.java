package com.example.project5_mikhsangumanof;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RecyclerCardAdapter extends RecyclerView.Adapter<RecyclerCardAdapter.CardViewHolder>{
    private List<ProductStoreData> productStoreList;
    private Context context;

    RecyclerCardAdapter(Context context, List<ProductStoreData> productStoreList) {
        this.context = context;
        this.productStoreList = productStoreList;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data, parent, false);
        return new CardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, final int position) {
        holder.img.setImageResource(productStoreList.get(position).getDetailImage());
        holder.title.setText(productStoreList.get(position).getNama());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DescriptionDetailActivity.class);
                intent.putExtra("title",productStoreList.get(position).getNama());
                intent.putExtra("desc",productStoreList.get(position).getTextDesc());
                intent.putExtra("img",productStoreList.get(position).getDetailImage());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return productStoreList.size();
    }

    static class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView title;
        CardView cardView;
        CardViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.itemImage);
            title = itemView.findViewById(R.id.itemTitle);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}
