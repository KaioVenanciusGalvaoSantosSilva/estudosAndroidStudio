package com.kaiogalvao.aula10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginActivity(View view){

        Intent intent = new Intent(this, EntrarActivity.class);
        startActivity(intent);
    }
    public void createActivity(View view){

        Intent intent = new Intent(this, CriarActivity.class);
        startActivity(intent);
    }
}