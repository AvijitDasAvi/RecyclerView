package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    Context context;
    String[] title,desc;
    int[] images;

    public Adapter(Context context, String[] title, String[] desc, int[] images) {
        this.context = context;
        this.title = title;
        this.desc = desc;
        this.images = images;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.sample_layout,viewGroup,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {

        myViewHolder.titleTextView.setText(title[position]);
        myViewHolder.descTextView.setText(desc[position]);
        myViewHolder.flageImageView.setImageResource(images[position]);


    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titleTextView,descTextView;
        ImageView flageImageView;

        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.titleTextViewId);
            descTextView = itemView.findViewById(R.id.discriptionViewId);
            flageImageView = itemView.findViewById(R.id.myImageViewID);
        }
    }
}
