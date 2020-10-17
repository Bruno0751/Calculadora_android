package com.br.view;

import android.os.Bundle;

import com.br.model.Calculadora;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class Main extends AppCompatActivity implements View.OnClickListener {

    private final String TAG ="Main";
    Calculadora objCalculadora = new Calculadora();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        //Preparando todos os botoes através do metodo findViewById
        objCalculadora.setButtonUm((Button)findViewById(R.id.buttonUm));
        objCalculadora.setButtonDois((Button)findViewById(R.id.buttonDois));
        objCalculadora.setButtonTres((Button)findViewById(R.id.buttonTres));
        objCalculadora.setButtonQuatro((Button)findViewById(R.id.buttonQuatro));
        objCalculadora.setButtonCinco((Button)findViewById(R.id.buttonCinco));
        objCalculadora.setButtonSeis((Button)findViewById(R.id.buttonSeis));
        objCalculadora.setButtonSete((Button)findViewById(R.id.buttonSete));
        objCalculadora.setButtonOito((Button)findViewById(R.id.buttonOito));
        objCalculadora.setButtonNove((Button)findViewById(R.id.buttonNove));
        objCalculadora.setButtonRaizQuadrada((Button)findViewById(R.id.buttonRaizQuadrada));
        objCalculadora.setButtonRaizCubica((Button)findViewById(R.id.buttonRaizCubica));
        objCalculadora.setButtonPorcento((Button)findViewById(R.id.buttonPorcento));
        objCalculadora.setButtonLimpar((Button)findViewById(R.id.buttonLimpar));
        objCalculadora.setButtonPotencia((Button)findViewById(R.id.buttonPotencia));
        objCalculadora.setButtonIgual((Button)findViewById(R.id.buttonIgual));
        objCalculadora.setButtonMais((Button)findViewById(R.id.buttonMais));
        objCalculadora.setButtonMenos((Button)findViewById(R.id.buttonMenos));
        objCalculadora.setButtonVezees((Button)findViewById(R.id.buttonVezes));
        objCalculadora.setButtonDivide((Button)findViewById(R.id.buttonDivide));

        objCalculadora.getButtonUm().setOnClickListener(this);
        objCalculadora.getButtonDois().setOnClickListener(this);
        objCalculadora.getButtonTres().setOnClickListener(this);
        objCalculadora.getButtonQuatro().setOnClickListener(this);
        objCalculadora.getButtonCinco().setOnClickListener(this);
        objCalculadora.getButtonSeis().setOnClickListener(this);
        objCalculadora.getButtonSete().setOnClickListener(this);
        objCalculadora.getButtonOito().setOnClickListener(this);
        objCalculadora.getButtonNove().setOnClickListener(this);

        objCalculadora.getButtonRaizQuadrada().setOnClickListener(this);
        objCalculadora.getButtonRaizCubica().setOnClickListener(this);
        objCalculadora.getButtonPorcento().setOnClickListener(this);
        objCalculadora.getButtonLimpar().setOnClickListener(this);
        objCalculadora.getButtonPotencia().setOnClickListener(this);
        objCalculadora.getButtonIgual().setOnClickListener(this);
        objCalculadora.getButtonMais().setOnClickListener(this);
        objCalculadora.getButtonMenos().setOnClickListener(this);
        objCalculadora.getButtonVezees().setOnClickListener(this);
        objCalculadora.getButtonDivide().setOnClickListener(this);
        /*
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
         */
    }

    protected void onStart() {
        super.onStart();
        Log.e(TAG, "Ola");
        Toast m = Toast.makeText(Main.this, "Projeto em andamento", Toast.LENGTH_LONG);
        m.show();

        AlertDialog.Builder msg = new AlertDialog.Builder(this);
        msg.setMessage("Projeto em andamento");
        msg.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id){
            case R.id.menuItemSobre:

                AlertDialog.Builder msg = new AlertDialog.Builder(this);
                msg.setMessage("Em Breve");
                msg.show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(v == objCalculadora.getButtonUm()){

        }else if(v == objCalculadora.getButtonUm()){

        }else if(v == objCalculadora.getButtonDois()){

        }else if(v == objCalculadora.getButtonTres()){

        }else if(v == objCalculadora.getButtonQuatro()){

        }else if(v == objCalculadora.getButtonCinco()){

        }else if(v == objCalculadora.getButtonSeis()){

        }else if(v == objCalculadora.getButtonSete()){

        }else if(v == objCalculadora.getButtonOito()){

        }else if(v == objCalculadora.getButtonNove()){

        }else if(v == objCalculadora.getButtonRaizQuadrada()){

        }else if(v == objCalculadora.getButtonRaizCubica()){

        }else if(v == objCalculadora.getButtonPorcento()){

        }else if(v == objCalculadora.getButtonLimpar()){

        }else if(v == objCalculadora.getButtonPotencia()){

        }else if(v == objCalculadora.getButtonIgual()){

        }else if(v == objCalculadora.getButtonMais()){

        }else if(v == objCalculadora.getButtonMenos()){

        }else if(v == objCalculadora.getButtonVezees()) {

        }else if(v == objCalculadora.getButtonDivide()){

        }
    }
}