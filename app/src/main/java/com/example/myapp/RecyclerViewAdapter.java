package com.example.myapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTV;
        TextView mobTV;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTV= itemView.findViewById(R.id.nameTV);
            mobTV= itemView.findViewById(R.id.mobTV);
            imageView= itemView.findViewById(R.id.imageView);
        }
    }
}
