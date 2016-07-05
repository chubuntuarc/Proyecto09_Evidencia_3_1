package com.example.arciniega.proyecto09_evidencia_3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    // Declaración de Variables
    private EditText nombre;
    private Spinner spinner;
    // Declaramos un arreglo con los valores que se mostaran en el Spinner
    private String[] spinnerDatos = new String[]{
            "Windows",
            "Linux",
            "Mac OSX",
            "Android",
            "IOS"
    };

    // Se crea un adaptador de datos para el control spinner
    private ArrayAdapter<String> adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Se relacionan los elementos Java con los elementos del XML
        spinner = (Spinner)findViewById(R.id.spinner);
        nombre = (EditText)findViewById(R.id.editNombre);

        // Se indica que arreglo usará el adaptador
        adaptador = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,spinnerDatos);

        // Enlazar el adaptador con el spinner
        spinner.setAdapter(adaptador);

        // Establecer un listener para el evento 'Selección de item'
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                nombre.setText("" + spinner.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });
    }
}
