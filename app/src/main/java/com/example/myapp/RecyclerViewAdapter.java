package com.example.myapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<DataClass> list;

    RecyclerViewAdapter(List<DataClass> myList) {
        list=myList;
    }

    @NonNull
    @Override

    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        return new ViewHolder((view));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
    DataClass data= list.get(position);
    holder.nameTV.setText(data.name);
    holder.infoTV.setText(data.info);
    holder.imageView.setBackgroundResource(data.img_name);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTV;
        TextView infoTV;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTV= itemView.findViewById(R.id.nameTV);
            infoTV= itemView.findViewById(R.id.infoTV);
            imageView= itemView.findViewById(R.id.imageView);
        }
    }
}
