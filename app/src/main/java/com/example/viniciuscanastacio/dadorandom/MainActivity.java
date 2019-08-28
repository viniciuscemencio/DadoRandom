package com.example.viniciuscanastacio.dadorandom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private TextView textViewResultado;
    private ImageView imageViewDado;
    private ImageView imageViewDado2;
    int Soma, Soma1, Resultado;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewDado = findViewById(R.id.imageViewDado);
        imageViewDado2 = findViewById(R.id.imageViewDado2);
        textViewResultado = findViewById(R.id.textViewResultado);


    }

    public void  gerenerate(View v) {
        Random r = new Random();
        int number = r.nextInt(6)+1;
        Soma = number;
        gerenerate2();
        resultadoFinal(v);



        if (number == 1){ imageViewDado.setImageResource(R.drawable.dado1);}
        else if (number == 2){ imageViewDado.setImageResource(R.drawable.dado2); }
        else if (number == 3){ imageViewDado.setImageResource(R.drawable.dado3); }
        else if (number == 4){ imageViewDado.setImageResource(R.drawable.dado4); }
        else if (number == 5){ imageViewDado.setImageResource(R.drawable.dado5); }
        else if (number == 6){ imageViewDado.setImageResource(R.drawable.dado6); }




    }

    public  void  gerenerate2() {
        Random r = new Random();
        int number2 = r.nextInt(6)+1;

        Soma1 = number2;

        if (number2 == 1){ imageViewDado2.setImageResource(R.drawable.dado1);}
        else if (number2 == 2){ imageViewDado2.setImageResource(R.drawable.dado2); }
        else if (number2 == 3){ imageViewDado2.setImageResource(R.drawable.dado3); }
        else if (number2 == 4){ imageViewDado2.setImageResource(R.drawable.dado4); }
        else if (number2 == 5){ imageViewDado2.setImageResource(R.drawable.dado5); }
        else if (number2 == 6){ imageViewDado2.setImageResource(R.drawable.dado6); }


    }

    public void resultadoFinal(View v){

        Resultado = Soma + Soma1;
        textViewResultado.setText(Integer.toString(Resultado));


    }

}
