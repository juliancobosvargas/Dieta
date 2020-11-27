package com.example.dietajuliancobos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Random;

public class Dieta1 extends AppCompatActivity {

    private TextView t1;
    private ListView l1,l2,l3,l4,l5,l6,l7,l8,l9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dieta1);

        FondoRandom();
        asignoObjetos();
        llenoLista();
        parametro_de_act1();
    }

    private  void parametro_de_act1(){
        String leerParamtro = getIntent().getStringExtra("nomVariable");
        t1.setText(leerParamtro);
    }

    private void asignoObjetos(){
        t1 = (TextView)findViewById(R.id.titulo1);
        l1 = (ListView)findViewById(R.id.lst1);
        l2 = (ListView)findViewById(R.id.lst2);
        l3 = (ListView)findViewById(R.id.lst3);
        l4 = (ListView)findViewById(R.id.lst4);
        l5 = (ListView)findViewById(R.id.lst5);
        l6 = (ListView)findViewById(R.id.lst6);
        l7 = (ListView)findViewById(R.id.lst7);
        l8 = (ListView)findViewById(R.id.lst8);
        l9 = (ListView)findViewById(R.id.lst9);
    }

    private void llenoLista(){
        Resources recurso = getResources();
        String [] miArreglo = recurso.getStringArray(R.array.d1_deportistas);
        ArrayAdapter <String> Adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,miArreglo);
        l1.setAdapter(Adaptador);
        //otro
        miArreglo = recurso.getStringArray(R.array.d1_hombres);
        Adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,miArreglo);
        l2.setAdapter(Adaptador);
        //otro
        miArreglo = recurso.getStringArray(R.array.d1_mujeres);
        Adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,miArreglo);
        l3.setAdapter(Adaptador);
        //otro
        miArreglo = recurso.getStringArray(R.array.d1_mediamanana);
        Adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,miArreglo);
        l4.setAdapter(Adaptador);
        //otro
        miArreglo = recurso.getStringArray(R.array.d1_comida);
        Adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,miArreglo);
        l5.setAdapter(Adaptador);
        //otro
        miArreglo = recurso.getStringArray(R.array.d1_merienda_depor);
        Adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,miArreglo);
        l6.setAdapter(Adaptador);
        //otro
        miArreglo = recurso.getStringArray(R.array.d1_merienda_hombre);
        Adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,miArreglo);
        l7.setAdapter(Adaptador);
        //otro
        miArreglo = recurso.getStringArray(R.array.d1_merienda_mujer);
        Adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,miArreglo);
        l8.setAdapter(Adaptador);
        //otro
        miArreglo = recurso.getStringArray(R.array.d1_cena);
        Adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,miArreglo);
        l9.setAdapter(Adaptador);
    }

    private void FondoRandom() {
        int numero = MiGlobal.getContador2();
        switch (numero) {
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

    public void Regresar(View view) {
        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);
        finish();
    }
}