package com.kaiogalvao.aula10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CriarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar);
    }

    public void loggedActivity2(View view){

        EditText editTextNome = findViewById(R.id.editTextText_nome);
        EditText editTextSobrenome = findViewById(R.id.editTextText_sobrenome);
        EditText editTextTelefone = findViewById(R.id.editTextPhone_telefone);
        EditText editTextEmail = findViewById(R.id.editTextTextEmailAddress2);
        EditText editTextSenha = findViewById(R.id.editTextTextPassword2);

        String nome = String.valueOf(editTextNome.getText());
        String sobrenome = String.valueOf(editTextSobrenome.getText());
        String telefone = String.valueOf(editTextTelefone.getText());
        String email = String.valueOf(editTextEmail.getText());
        String senha = String.valueOf(editTextSenha.getText());


        if (nome.isEmpty()||sobrenome.isEmpty()||telefone.isEmpty()||email.isEmpty() || senha.isEmpty()){


            Toast.makeText(this, "Preencha os campos", Toast.LENGTH_SHORT).show();

        }else{
            //Nessa parte é feita a verificação caso os campos estiverem preenchidos prossegue
            //Nesse local é colocado os códigos para abrir o banco de dados verificar se os dados ja existem e registra no banco e permite o acesso.
            Toast.makeText(this, "Conta criada com sucesso", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, LogadoActivity.class);
            startActivity(intent);

        }


    }
    public void voltarMain2Activity(View view){

        finish();

    }

}