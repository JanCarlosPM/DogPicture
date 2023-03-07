package com.example.dogpicture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView cargarImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarImagen = findViewById(R.id.imageView);
        Picasso.get()
                .load("https://images.dog.ceo/breeds/doberman/n02107142_7205.jpg")
                .into(cargarImagen);
    }
}