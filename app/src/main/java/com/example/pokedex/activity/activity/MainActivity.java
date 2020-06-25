package com.example.pokedex.activity.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pokedex.R;

public class MainActivity extends AppCompatActivity {

    private Button botaoIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoIniciar = findViewById(R.id.buttonPlay);
        botaoIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PokedexActivity.class);
                startActivity( intent );
            }
        });
    }

}