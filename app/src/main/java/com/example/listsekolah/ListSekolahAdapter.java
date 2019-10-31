package com.example.listsekolah;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListSekolahAdapter extends RecyclerView.Adapter<ListSekolahAdapter.ListViewHolder> {
    private ArrayList<Sekolah> listSekolah;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }
    public ListSekolahAdapter(ArrayList<Sekolah> list){
        this.listSekolah = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_sekolah, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListSekolahAdapter.ListViewHolder holder, int position) {
        Sekolah sekolah = listSekolah.get(position);
        holder.tvSekolah.setText(sekolah.getName());
        holder.tvDetail.setText(sekolah.getDetail());
        Glide.with(holder.itemView.getContext())
                .load(sekolah.getPhoto())
                .apply(new RequestOptions().override(60,55))
                .into(holder.Gambar);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listSekolah.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listSekolah.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvSekolah, tvDetail;
        ImageView Gambar;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSekolah = itemView.findViewById(R.id.tv_name);
            tvDetail = itemView.findViewById(R.id.tv_detail);
            Gambar = itemView.findViewById(R.id.img_sekolah);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Sekolah data);
    }
}
