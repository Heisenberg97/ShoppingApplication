package com.example.mydemoapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ViewHolder> {


    private String[] txt1;
    private String[] txt2;
    private String[] txt3;
    private String[] txt4;
    private Context context;
    private int image;

    public AdapterClass(String[] txt1, String[] txt2, String[] txt3, String[] txt4, int image, Context context) {
        this.txt1 = txt1;
        this.txt2 = txt2;
        this.txt3 = txt3;
        this.txt4 = txt4;
        this.image = image;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgView.setImageDrawable(context.getResources().getDrawable(image));
        String title = txt1[position];
        holder.txt1.setText(title);
        String desc = txt2[position];
        holder.txt2.setText(desc);
        String rating = txt3[position];
        holder.txt3.setText(rating);
        String price = txt4[position];
        holder.txt4.setText(price);
    }

    @Override
    public int getItemCount() {
        return txt1.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgView;
        TextView txt1, txt2, txt3, txt4;
        public ViewHolder(View view) {
            super(view);
            imgView = view.findViewById(R.id.imageView);
            txt1 = view.findViewById(R.id.textViewTitle);
            txt2 = view.findViewById(R.id.textViewShortDesc);
            txt3 = view.findViewById(R.id.textViewRating);
            txt4 = view.findViewById(R.id.textViewPrice);
        }
    }
}
