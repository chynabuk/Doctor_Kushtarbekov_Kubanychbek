package com.example.recycle_view_doctor_ain_2_20_kushtarbekov_kubanychbek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DoctorAdapter doctorAdapter;
    private List<Doctor> doctors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        doctors = new ArrayList<>();
        doctors.add(new Doctor("Куштарбеков Кубанычбек", "Стоматолог", R.drawable.img, "A1"));
        doctors.add(new Doctor("Куштарбеков Кубанычбек", "Хирург", R.drawable.img, "A2"));
        doctors.add(new Doctor("Керимов Адис",  "Уролог", R.drawable.img_2, "A3"));
        doctors.add(new Doctor("Мелисов Санжар",  "Хирург", R.drawable.img_3, "A4"));
        doctors.add(new Doctor("Кубатбеков Алакен",  "Психотерапевт", R.drawable.img_4, "A5"));
        doctors.add(new Doctor("Жээнбеков Адильшер",  "Окулист", R.drawable.img_5, "A6"));
        doctors.add(new Doctor("Чандаев Бекжан",  "Нейрохирург", R.drawable.img_6, "A7"));
        doctors.add(new Doctor("Айбеков Айболот",  "Лор", R.drawable.img_7, "A8"));
        doctors.add(new Doctor("Ахметов Исмаил",  "Уролог", R.drawable.img_8, "A9"));
        doctors.add(new Doctor("Нуржанов Салмоор",  "Педиатор", R.drawable.img_9, "A10"));


        doctorAdapter = new DoctorAdapter(doctors, this);
        recyclerView.setAdapter(doctorAdapter);
    }
}