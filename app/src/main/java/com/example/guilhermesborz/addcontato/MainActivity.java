package com.example.guilhermesborz.addcontato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import fr.ganfra.materialspinner.MaterialSpinner;

public class MainActivity extends AppCompatActivity {

    private  EditText etNome;
    //private Button btMaisCampos;
    //private Button btSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this.getApplicationContext(), "Mensagem", Toast.LENGTH_SHORT).show();

        etNome =(EditText) findViewById(R.id.etNome);
        //btMaisCampos = (Button)findViewById(R.id.btMaisCampos);
        //btSalvar = (Button)

    }

    public void clicouNoBotao(View origemDoClique){

        Toast.makeText(this.getApplicationContext(), "Ola"+etNome.getText().toString(), Toast.LENGTH_SHORT).show();

    }

    String[] ITEMS = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6"};
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ITEMS);
    adapter.setDropDownViewResource();
    MaterialSpinner spinner = (MaterialSpinner) findViewById(R.id.spinner);
    MaterialSpinner.setAdapter(adapter);

}
