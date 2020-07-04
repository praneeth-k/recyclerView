package com.example.prane.recyclerzviewproject;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MyAdaptor extends RecyclerView.Adapter<MyAdaptor.MyViewHolder> {
    private int[] mDataset;

    public MyAdaptor(int[] myDataset) {
        mDataset = myDataset;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ImageView v = (ImageView) LayoutInflater.from(viewGroup.getContext())
            .inflate(R.layout.text_view, viewGroup, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.imageView.setImageResource(mDataset[i]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    public static class MyViewHolder extends  RecyclerView.ViewHolder{
        public ImageView imageView;
        public MyViewHolder(ImageView v)
        {
            super(v);
            imageView = v;
        }
    }

}
