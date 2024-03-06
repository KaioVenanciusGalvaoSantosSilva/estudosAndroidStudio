package com.kaiogalvao.aula09;

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

    public void abrirSegundaActivity(View view) {
        Intent intent = new Intent(this, SegundaActivity.class);
        startActivity(intent);
    }
    public void voltarActivity(View view){
        finish();

    }
}