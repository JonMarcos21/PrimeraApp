package com.example.primeraapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ClasificacionAdapter extends RecyclerView.Adapter<ClasificacionAdapter.ViewHolder> {

    Clasificacion[] tabla;
    Context context;

    public ClasificacionAdapter(Clasificacion [] tabla ,  MainActivity3 activity) {
        this.tabla = tabla;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Clasificacion tablaList = tabla [position];
        holder.equipoImage.setImageResource(tablaList.getEquipoImage());
        holder.textViewPosicion.setText(tablaList.getPosicion());
        holder.textViewNombre.setText(tablaList.getNombre());
        holder.textViewPuntos.setText(tablaList.getPuntos());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, tablaList.getPosicion(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return tabla.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView equipoImage;
        TextView textViewNombre, textViewPuntos, textViewPosicion;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            equipoImage = itemView.findViewById(R.id.imageview);
            textViewPosicion = itemView.findViewById(R.id.textPosicion);
            textViewNombre = itemView.findViewById(R.id.textNombre);
            textViewPuntos = itemView.findViewById(R.id.textPuntos);

        }
    }



}