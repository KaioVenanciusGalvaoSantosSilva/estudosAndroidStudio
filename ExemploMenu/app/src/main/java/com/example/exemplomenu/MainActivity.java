package com.example.exemplomenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configura a Toolbar
        Toolbar toolbar = findViewById(R.id.menu);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.menu_list){
            Toast.makeText(this, "menu1", Toast.LENGTH_SHORT).show();
            //adicione uma intent para transitar para uma nova tela
        }else if(item.getItemId() == R.id.menu_list2){
            Toast.makeText(this, "menu2", Toast.LENGTH_SHORT).show();
            //adicione uma intent para transitar para uma nova tela
            //ou qualquer outro evento que queira aplicar ao menu
            //caso queira aplicar uma tela de sobreposição use POPUP boa sorte
        }

    return super.onOptionsItemSelected(item);

    }
}
