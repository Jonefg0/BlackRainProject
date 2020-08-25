package com.example.suralumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ventanaseleccion extends AppCompatActivity implements View.OnClickListener {

    private Button btnStock,btnCotizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventanaseleccion);

        btnStock= (Button) findViewById(R.id.seleccion_stockbutton);
        btnCotizar = (Button) findViewById(R.id.seleccion_cotizacionbutton);


        btnCotizar.setOnClickListener(this);
        btnStock.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.seleccion_cotizacionbutton:
                //Invocamos al método:
                Intent intencion = new Intent(getApplication(), cotizacion.class);
                startActivity(intencion);
                break;
            case R.id.seleccion_stockbutton:
                Intent intencion2 = new Intent(getApplication(), stock.class);
                startActivity(intencion2);
                break;
        }
    }
}