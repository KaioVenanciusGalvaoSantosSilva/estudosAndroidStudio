package com.kaiogalvao.aula17;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void botaoCalcular(View view){

        EditText editvalor1 = findViewById(R.id.editTextText_Valor1);
        EditText editvalor2 = findViewById(R.id.editTextText_Valor2);

        double soma = 0;
        double subtracao = 0;
        double multiplicacao = 0;
        double divisao = 0;
        double resto = 0;

        //Algumas exceções devem ser tratadas como divisão por 0
        //Verifica se um dos dois valores esta vazio
        if ((editvalor1.getText().toString().isEmpty()) || (editvalor2.getText().toString().isEmpty()) ){

            //Caso um dos dois esteja vazio exibe a mensagem
            Toast.makeText(this, "Insira os valores", Toast.LENGTH_SHORT).show();

        }else{
            //Caso os valores tenham sido preenchidos

            double valor1 = 0;
            valor1 = Double.parseDouble(editvalor1.getText().toString());
            double valor2 = 0;
            valor2 = Double.parseDouble(editvalor2.getText().toString());


            //Verifica se os valores são iguais a 0
            if(valor1 == 0 && valor2 == 0) {

            Toast.makeText(this, "Insira os valores", Toast.LENGTH_SHORT).show();

        }else{
            //Caso tenha preenchido os valores diferente de 0 segue
            //Atribui variaveis do tipo double
                 soma = sum(valor1,valor2);
                 subtracao = sub(valor1,valor2);
                 multiplicacao = multiply(valor1,valor2);
                 divisao = divide(valor1,valor2);
                 resto = rest(valor1,valor2);

                if(Double.isNaN(soma)||Double.isNaN(subtracao)||Double.isNaN(multiplicacao)||Double.isNaN(divisao)||Double.isNaN(resto)){
                     soma = 0;
                     subtracao = 0;
                     multiplicacao = 0;
                     resto = 0;
                }


            //Cria variaveis strings para receber o resultado das funções
            String resultadosoma = String.valueOf(soma);
            String resultadosubtracao = String.valueOf(subtracao);
            String resultadomultiplicacao = String.valueOf(multiplicacao);
            String resultadodivisao = String.valueOf(divisao);
            String resultadoresto = String.valueOf(resto);

            //Atribui o objeto da view ao código
            TextView txtsoma = findViewById(R.id.textView_Soma);
            TextView txtsubtracao = findViewById(R.id.textView_Subtracao);
            TextView txtmultiplicacao = findViewById(R.id.textView_Multiplicacao);
            TextView txtdivisao = findViewById(R.id.textView_Divisao);
            TextView txtresto = findViewById(R.id.textView_Resto);



            //Define os valores de cada objeto como o resultado obtido nas funções
            txtsoma.setText(resultadosoma);
            txtsubtracao.setText(resultadosubtracao);
            txtmultiplicacao.setText(resultadomultiplicacao);
            txtdivisao.setText(resultadodivisao);
            txtresto.setText(resultadoresto);

        }}
    }

    //Todas as funções recebem 2 parametros (valores) para fazer os calculos
    //Função de soma
    public double sum(double x,double y){
            double resultado = x + y;
        return resultado;
    }
    //Função de subtração
    public double sub(double x,double y){
            double resultado = x - y;
        return resultado;
    }

    //Função de multiplicação
    public double multiply(double x,double y){
            double resultado = x * y;
        return resultado;
    }

    //Função de divisão
    public double divide(double x,double y){
            double resultado = x / y;
        return resultado;
    }

    //Função de resto
    public double rest(double x,double y){
            double resultado = x % y;
        return resultado;
    }

}