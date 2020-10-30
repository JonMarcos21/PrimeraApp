package com.example.primeraapp.ui.primera;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.primeraapp.Primera;
import com.example.primeraapp.R;
import com.example.primeraapp.ui.Clasificacion;

public class ClasificacionAdapter extends RecyclerView.Adapter<ClasificacionAdapter.ViewHolder> {

    Clasificacion[] tabla;
    Context context;

    public ClasificacionAdapter(Clasificacion [] tabla ,  Primera activity) {
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
        final Clasificacion tabla =this.tabla [position];
        holder.textViewPosicion.setText(tabla.getPosicion());
        holder.textViewNombre.setText(tabla.getNombre());
        holder.textViewPuntos.setText(tabla.getPuntos());
        holder.equipoImage.setImageResource(tabla.getEquipoImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, tabla.getPosicion(), Toast.LENGTH_SHORT).show();
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
            textViewNombre = itemView.findViewById(R.id.textNombre);
            textViewPuntos = itemView.findViewById(R.id.textPuntos);
            textViewPosicion = itemView.findViewById(R.id.textPosicion);




        }
    }



}
