package com.example.recycle_view_doctor_ain_2_20_kushtarbekov_kubanychbek;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.ViewHolder>{

    private List<Doctor> doctors;
    private Context mContext;

    public DoctorAdapter(List<Doctor> doctors, Context context){
        this.doctors = doctors;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Doctor doctor = doctors.get(position);
        holder.setValues(doctor);
    }

    @Override
    public int getItemCount() {
        return doctors.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        TextView position;
        ImageView image;
        TextView room;
        ImageButton menu;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            position = itemView.findViewById(R.id.position);
            image = itemView.findViewById(R.id.image);
            room = itemView.findViewById(R.id.room);
            menu = itemView.findViewById(R.id.dropdown_menu);

            menu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    PopupMenu popupMenu = new PopupMenu(mContext, view);
                    popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            switch (menuItem.getItemId()){
                                case R.id.call:
                                    mContext.startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0778393607")));
                                    return true;
                                case R.id.appoint_to_doctor:
                                    return true;
                                case R.id.on_line_consult:
                                    return true;
                            }
                            return false;
                        }
                    });
                    popupMenu.show();
                }
            });
        }

        public void setValues(Doctor doctor){
            name.setText(doctor.getName());
            position.setText("Должность: " + doctor.getPosition());
            image.setImageDrawable(ContextCompat.getDrawable(mContext, doctor.getImage()));
            room.setText("Кабинет: " + doctor.getRoom());
        }
    }
}