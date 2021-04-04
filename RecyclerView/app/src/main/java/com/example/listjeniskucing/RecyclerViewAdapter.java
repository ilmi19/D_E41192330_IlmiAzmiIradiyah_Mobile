package com.example.listjeniskucing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private ArrayList<String> fotoKucing = new ArrayList<>();
    private ArrayList<String> namaKucing = new ArrayList<>();
    private ArrayList<String> infoKucing = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> fotoKucing, ArrayList<String> namaKucing, ArrayList<String> infoKucing, Context context) {
        this.fotoKucing = fotoKucing;
        this.namaKucing = namaKucing;
        this.infoKucing = infoKucing;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(context).asBitmap().load(fotoKucing.get(position)).into(holder.imageViewFotoKucing);

        holder.textViewNamaKucing.setText(namaKucing.get(position));
    }

    @Override
    public int getItemCount() { return namaKucing.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageViewFotoKucing;
        TextView textViewNamaKucing;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFotoKucing = itemView.findViewById(R.id.imageViewFotoKucing);
            textViewNamaKucing = itemView.findViewById(R.id.textViewNamaKucing);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}


