package com.example.mariajeanne.views;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mariajeanne.R;
import com.example.mariajeanne.model.MariaJeanne;

import java.util.List;

public class MariaJeanneAdapter extends RecyclerView.Adapter<MariaJeanneAdapter.MariaJeanneViewHolder> {
    private List<MariaJeanne> mariaJeanneList;
    public ItemClickListener itemClickListener;
    private TextView mJTextView;

    public void setMariaJeanneListList(List<MariaJeanne> weaponList) {
        this.mariaJeanneList = mariaJeanneList;
        notifyDataSetChanged();
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @NonNull @Override public MariaJeanneViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mariajeanne, viewGroup, false);
        return new MariaJeanneViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MariaJeanneAdapter.MariaJeanneViewHolder mariaJeanneViewHolder, int i) {
        MariaJeanne mariaJeanne = mariaJeanneList.get(i);
        MariaJeanneViewHolder.mariaJeanneNameTextView.setText(mariaJeanne.getName());
        MariaJeanneViewHolder.mariaJeanneRaceTextView.setText(mariaJeanne.getRace().toString());

        if(itemClickListener != null) {
            MariaJeanneViewHolder.mariaJeanneCell.setOnClickListener(view -> itemClickListener.onClick(mariaJeanne));
        }
    }

    @Override
    public int getItemCount()  {
        return mariaJeanneList != null ? mariaJeanneList.size() : 0;
    }

    static class MariaJeanneViewHolder extends RecyclerView.ViewHolder {

        public static TextView mariaJeanneRaceTextView;
        public static TextView mariaJeanneNameTextView;
        public static ConstraintLayout mariaJeanneCell;

        public MariaJeanneViewHolder(@NonNull View itemView) {
            super(itemView);
            mariaJeanneRaceTextView.findViewById(R.id.mariaJeanne_race_tv);
            mariaJeanneNameTextView.findViewById(R.id.mariajeanne_name_tv);
            mariaJeanneCell.findViewById(R.id.mariajeanne_cell);
        }
    }

    public interface ItemClickListener {
        void onClick(MariaJeanne mariaJeanne);
    }
}
