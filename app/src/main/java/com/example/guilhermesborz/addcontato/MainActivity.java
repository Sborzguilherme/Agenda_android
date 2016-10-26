package com.example.guilhermesborz.addcontato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import fr.ganfra.materialspinner.MaterialSpinner;


public class MainActivity extends AppCompatActivity {

    private  EditText etNome;
    //Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNome =(EditText) findViewById(R.id.etNome);
        //spinner1= (Spinner)findViewById(R.id.spinner1);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Usuarios_email, R.layout.support_simple_spinner_dropdown_item);
        //spinner1.setAdapter(adapter);
        //spinner1.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

    }


    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView myText = (TextView) view;
        Toast.makeText(this, "Você escolheu" + myText.getText(), Toast.LENGTH_LONG);
    }



    public void clicouNoBotao(View origemDoClique){

        Toast.makeText(this.getApplicationContext(), "Ola"+etNome.getText().toString(), Toast.LENGTH_SHORT).show();

    }



}
