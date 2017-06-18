package com.diegoflores.petagram;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        agregarFAB();
    }
    public void agregarFAB(){
        FloatingActionButton miFAB = (FloatingActionButton) findViewById(R.id.fabMiFAB)
                miFAB.setOnClickListener(new View.OnClickListener() { //Agregamos una acción al dar click.
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getBaseContext(),getResources().getString(R.string.texto_check),Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
