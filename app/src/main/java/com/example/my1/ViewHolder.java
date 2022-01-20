package com.example.my1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder  extends RecyclerView.ViewHolder {
    private TextView textName;
    public ViewHolder(@NonNull View itemView){
        super(itemView);
        textName = itemView.findViewById(R.id.person);
    }
    public void bind(String person){
        textName.setText(person);
    }
}
