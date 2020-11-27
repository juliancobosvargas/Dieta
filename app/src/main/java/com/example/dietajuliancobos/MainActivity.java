package com.example.dietajuliancobos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FondoRandom();
    }

    public void irDieta1(View view) {
        Intent intento = new Intent(this, instante3.class);
        intento.putExtra("nomVariable","Dieta Uno");
        startActivity(intento);
        finish();
    }

    public void irDieta2(View view) {
        Intent intento = new Intent(this, instante3.class);
        intento.putExtra("nomVariable","Dieta Dos");
        startActivity(intento);
        finish();
    }

    public void irDieta3(View view) {
        Intent intento = new Intent(this, instante3.class);
        intento.putExtra("nomVariable","Dieta Tres");
        startActivity(intento);
        finish();
    }

    public void irDieta4(View view) {
        Intent intento = new Intent(this, instante3.class);
        intento.putExtra("nomVariable","Dieta Cuatro");
        startActivity(intento);
        finish();
    }

    public void irDieta5(View view) {
        Intent intento = new Intent(this, instante3.class);
        intento.putExtra("nomVariable","Dieta Cinco");
        startActivity(intento);
        finish();
    }

    public void irDieta6(View view) {
        Intent intento = new Intent(this, instante3.class);
        intento.putExtra("nomVariable","Dieta Seis");
        startActivity(intento);
        finish();
    }

    public void irDieta7(View view) {
        Intent intento = new Intent(this, instante3.class);
        intento.putExtra("nomVariable","Dieta Siete");
        startActivity(intento);
        finish();
    }

    private void FondoRandom(){
        int numero = MiGlobal.getContador2();
        switch (numero){
            case 1:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta1b);
                break;
            case 2:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta2b);
                break;
            case 3:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta3b);
                break;
            case 4:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta4b);
                break;
            case 5:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta5b);
                break;
            case 6:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta6b);
                break;
            case 7:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta7b);
                break;
            case 8:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta8b);
                break;
            case 9:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta9b);
                break;
            case 10:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta10b);
                break;
            case 11:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta11b);
                break;
            case 12:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta12b);
                break;
            case 13:
                getWindow().setBackgroundDrawableResource(R.drawable.dieta13b);
                break;
        }
    }
}