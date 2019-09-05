package com.example.sample19_adapterview_exam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.Customholder>{

    Context ctx;
    int layout;
    List<CustomDTO> list;
    LayoutInflater inf;

    public CustomAdapter(Context ctx, int layout, List<CustomDTO> list) {
        this.ctx = ctx;
        this.layout = layout;
        this.list = list;
        inf = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @NonNull
    @Override
    public Customholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =inf.inflate(layout,null);
        return new Customholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Customholder holder, int position) {
        CustomDTO dto = list.get(position);
        holder.setData(dto);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
//CustomHolder
    static class Customholder extends RecyclerView.ViewHolder{

        ImageView imgIcon;
        TextView textTitle;
        TextView textContent;


        public Customholder(@NonNull View itemView) {
            super(itemView);

            imgIcon = itemView.findViewById(R.id.imgIcon);
            textTitle = itemView.findViewById(R.id.textTitle);
            textContent = itemView.findViewById(R.id.textContent);
        }

        public void setData(CustomDTO dto){
            imgIcon.setImageResource(dto.getImgIcon());
            textTitle.setText(dto.getTextTitle());
            textTitle.setText(dto.getTextContent());
        }
    }
}
