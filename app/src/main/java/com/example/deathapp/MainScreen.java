package com.example.deathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        ImageView img = findViewById(R.id.img1);
        ImageView img3 = findViewById(R.id.img3);
        ImageView img5 = findViewById(R.id.img5);
        ImageView img7 = findViewById(R.id.img7);
        ImageView img9 = findViewById(R.id.img9);
        ImageView img11 = findViewById(R.id.img11);
        ImageView img13 = findViewById(R.id.img13);

        img13.setOnClickListener(new View.OnClickListener() {
            boolean isImage13 = true;

            @Override
            public void onClick(View v) {
                if(isImage13){
                    img13.setImageResource(R.drawable.dot);
                    isImage13 = false;
                }else{
                    img13.setImageResource(R.drawable.cyrcle);
                    isImage13 = true;
                }
            }
        });

        img11.setOnClickListener(new View.OnClickListener() {
            boolean isImage11 = true;

            @Override
            public void onClick(View v) {
                if(isImage11){
                    img11.setImageResource(R.drawable.dot);
                    isImage11 = false;
                }else{
                    img11.setImageResource(R.drawable.cyrcle);
                    isImage11 = true;
                }
            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            boolean isImage9 = true;

            @Override
            public void onClick(View v) {
                if(isImage9){
                    img9.setImageResource(R.drawable.dot);
                    isImage9 = false;
                }else{
                    img9.setImageResource(R.drawable.cyrcle);
                    isImage9 = true;
                }
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            boolean isImage7 = true;

            @Override
            public void onClick(View v) {
                if(isImage7){
                    img7.setImageResource(R.drawable.dot);
                    isImage7 = false;
                }else{
                    img7.setImageResource(R.drawable.cyrcle);
                    isImage7 = true;
                }
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            boolean isImage5 = true;

            @Override
            public void onClick(View v) {
                if(isImage5){
                    img5.setImageResource(R.drawable.dot);
                    isImage5 = false;
                }else{
                    img5.setImageResource(R.drawable.cyrcle);
                    isImage5 = true;
                }
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            boolean isImage3 = true;

            @Override
            public void onClick(View v) {
                if(isImage3){
                    img3.setImageResource(R.drawable.dot);
                    isImage3 = false;
                }else{
                    img3.setImageResource(R.drawable.cyrcle);
                    isImage3 = true;
                }
            }
        });

        img.setOnClickListener(new View.OnClickListener() {
            boolean isImage1 = true;

            @Override
            public void onClick(View v) {
                if(isImage1){
                    img.setImageResource(R.drawable.dot);
                    isImage1 = false;
                }else{
                    img.setImageResource(R.drawable.cyrcle);
                    isImage1 = true;
                }
            }
        });

        ImageView img2 = findViewById(R.id.img4);
        ImageView img4 = findViewById(R.id.img6);
        ImageView img6 = findViewById(R.id.img8);




        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, Foots.class);
                startActivity(intent);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, Achievments.class);
                startActivity(intent);
            }
        });


        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, Profile.class);
                startActivity(intent);
            }
        });

    }
}