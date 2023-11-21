package com.atenea.viewmodelonegrupo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

public class MiActividad extends AppCompatActivity {
    private MyViewModel myViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_actividad);

        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);

        myViewModel.setNombre("Juan");
        myViewModel.setEdad(25);

        TextView textView = findViewById(R.id.MyTextView);

        textView.setText("nombre: "+ myViewModel.getNombre()+ "Edad: "+ myViewModel.getEdad());
    }
}