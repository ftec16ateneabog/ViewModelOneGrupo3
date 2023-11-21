package com.atenea.viewmodelonegrupo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

public class Prueba extends AppCompatActivity {
    private MyViewModel myViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);
        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);

        TextView textView = findViewById(R.id.MySecondTextView);
        textView.setText("nombre: "+ myViewModel.getNombre()+ "Edad: "+ myViewModel.getEdad());
    }
}