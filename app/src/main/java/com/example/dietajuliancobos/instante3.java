package com.example.dietajuliancobos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class instante3 extends AppCompatActivity {

    private TextView t1;
    public static final long demora = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instante3);

        FondoRandom();
        t1 = (TextView)findViewById(R.id.titulo1);
        parametro_de_act1();

        //Tarea del Temporizador
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                irInstante4();
            }
        };
        //temporizador ejecuta la instantane = splash
        Timer temporizador = new Timer();
        temporizador.schedule(tarea,demora);
    }

    private  void parametro_de_act1(){
        String leerParamtro = getIntent().getStringExtra("nomVariable");
        t1.setText(leerParamtro);
    }

    private void irInstante4() {
        Intent intento = new Intent(this, instante4.class);
        intento.putExtra("nomVariable",t1.getText());
        startActivity(intento);
        finish();
    }

    private void FondoRandom(){
        int numero = MiGlobal.getContador1();
        switch (numero){
            case 1:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta1);
                break;
            case 2:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta2);
                break;
            case 3:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta3);
                break;
            case 4:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta4);
                break;
            case 5:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta5);
                break;
            case 6:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta6);
                break;
            case 7:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta7);
                break;
            case 8:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta8);
                break;
            case 9:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta9);
                break;
            case 10:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta10);
                break;
            case 11:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta11);
                break;
            case 12:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta12);
                break;
            case 13:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta13);
                break;
        }
    }
}