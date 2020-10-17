package com.br.view;

import android.content.Intent;
import android.os.Bundle;

import com.br.model.Calculadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.br.controller.Calculos;

public class ActivityMain extends AppCompatActivity implements View.OnClickListener {

    private final String TAG ="Main";
    Calculadora objCalculadora = new Calculadora();
    Calculos objCalculos = new Calculos();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Preparando todos as variaveis através do metodo findViewById
        objCalculadora.setButtonZero((Button)findViewById(R.id.buttonZero));
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
        objCalculadora.setVisor((EditText)findViewById(R.id.editTextVisor));

        //Retornando todas as variasveis e preparando-as como botoes
        objCalculadora.getButtonZero().setOnClickListener(this);
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
    }

    protected void onStart() {
        super.onStart();
        Log.e(TAG, "Ola");
        Toast m = Toast.makeText(ActivityMain.this, "Projeto em andamento", Toast.LENGTH_LONG);
        m.show();
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
                /*
                AlertDialog.Builder msg = new AlertDialog.Builder(this);
                msg.setMessage("Em Breve");
                msg.show();
                break;
                 */
                Intent intent = new Intent(ActivityMain.this, ActivitySobre.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v == objCalculadora.getButtonZero()) {

            objCalculadora.getVisor().setText(objCalculadora.getVisor().getText() + "0");

        }else if(v == objCalculadora.getButtonUm()){

            objCalculadora.getVisor().setText(objCalculadora.getVisor().getText() + "1");

        }else if(v == objCalculadora.getButtonDois()){

            objCalculadora.getVisor().setText(objCalculadora.getVisor().getText() + "2");

        }else if(v == objCalculadora.getButtonTres()){

            objCalculadora.getVisor().setText(objCalculadora.getVisor().getText() + "3");

        }else if(v == objCalculadora.getButtonQuatro()){

            objCalculadora.getVisor().setText(objCalculadora.getVisor().getText() + "4");

        }else if(v == objCalculadora.getButtonCinco()){

            objCalculadora.getVisor().setText(objCalculadora.getVisor().getText() + "5");

        }else if(v == objCalculadora.getButtonSeis()){

            objCalculadora.getVisor().setText(objCalculadora.getVisor().getText() + "6");

        }else if(v == objCalculadora.getButtonSete()){

            objCalculadora.getVisor().setText(objCalculadora.getVisor().getText() + "7");

        }else if(v == objCalculadora.getButtonOito()){

            objCalculadora.getVisor().setText(objCalculadora.getVisor().getText() + "8");

        }else if(v == objCalculadora.getButtonNove()){

            objCalculadora.getVisor().setText(objCalculadora.getVisor().getText() + "9");

        }else if(v == objCalculadora.getButtonRaizQuadrada()){

            objCalculadora.setOp('r');
            objCalculos.setNumero1(Float.parseFloat(objCalculadora.getVisor().getText().toString()));
            objCalculadora.limpar();
            objCalculos.setResultadoOutros(Math.sqrt(objCalculos.getNumero1()));
            objCalculadora.getVisor().setText(String.valueOf(objCalculos.getResultadoOutros()));

        }else if(v == objCalculadora.getButtonRaizCubica()){

            objCalculadora.setOp('z');
            objCalculos.setNumero1(Float.parseFloat(objCalculadora.getVisor().getText().toString()));
            objCalculadora.limpar();
            objCalculos.setResultadoOutros(Math.cbrt(objCalculos.getNumero1()));
            objCalculadora.getVisor().setText(String.valueOf(objCalculos.getResultadoOutros()));

        }else if(v == objCalculadora.getButtonPorcento()){

            objCalculadora.setOp('%');
            objCalculos.setNumero1(Float.parseFloat(objCalculadora.getVisor().getText().toString()));
            objCalculadora.limpar();

        }else if(v == objCalculadora.getButtonLimpar()){

            objCalculadora.limpar();

        }else if(v == objCalculadora.getButtonPotencia()){

            objCalculadora.setOp('p');
            objCalculos.setNumero1(Float.parseFloat(objCalculadora.getVisor().getText().toString()));
            objCalculadora.limpar();

        }else if(v == objCalculadora.getButtonIgual()){

            switch(objCalculadora.getOp()){
                case '+':

                    objCalculos.setNumero2(Float.parseFloat(objCalculadora.getVisor().getText().toString()));
                    objCalculos.setResultado(objCalculos.getNumero1() + objCalculos.getNumero2());
                    objCalculadora.getVisor().setText(String.valueOf(objCalculos.getResultado()));

                    break;
                case '-':

                    objCalculos.setNumero2(Float.parseFloat(objCalculadora.getVisor().getText().toString()));
                    objCalculos.setResultado(objCalculos.getNumero1() - objCalculos.getNumero2());
                    objCalculadora.getVisor().setText(String.valueOf(objCalculos.getResultado()));

                    break;
                case '*':

                    objCalculos.setNumero2(Float.parseFloat(objCalculadora.getVisor().getText().toString()));
                    objCalculos.setResultado(objCalculos.getNumero1() * objCalculos.getNumero2());
                    objCalculadora.getVisor().setText(String.valueOf(objCalculos.getResultado()));

                    break;
                case '/':

                    objCalculos.setNumero2(Float.parseFloat(objCalculadora.getVisor().getText().toString()));
                    objCalculos.setResultado(objCalculos.getNumero1() / objCalculos.getNumero2());
                    objCalculadora.getVisor().setText(String.valueOf(objCalculos.getResultado()));

                    break;
                case 'p':

                    objCalculos.setNumero2(Float.parseFloat(objCalculadora.getVisor().getText().toString()));
                    objCalculos.setResultadoOutros(Math.pow(objCalculos.getNumero1(), objCalculos.getNumero2()));
                    objCalculadora.getVisor().setText(String.valueOf(objCalculos.getResultadoOutros()));

                    break;
                case '%':

                    objCalculos.setNumero2(Float.parseFloat(objCalculadora.getVisor().getText().toString()));
                    objCalculos.setResultado(objCalculos.getNumero1() * objCalculos.getNumero2() / 100);
                    objCalculadora.getVisor().setText(String.valueOf(objCalculos.getResultado()));

                    break;
            }

        }else if(v == objCalculadora.getButtonMais()){

            objCalculadora.setOp('+');
            objCalculos.setNumero1(Float.parseFloat(objCalculadora.getVisor().getText().toString()));
            objCalculadora.limpar();

        }else if(v == objCalculadora.getButtonMenos()){

            objCalculadora.setOp('-');
            objCalculos.setNumero1(Float.parseFloat(objCalculadora.getVisor().getText().toString()));
            objCalculadora.limpar();

        }else if(v == objCalculadora.getButtonVezees()) {

            objCalculadora.setOp('*');
            objCalculos.setNumero1(Float.parseFloat(objCalculadora.getVisor().getText().toString()));
            objCalculadora.limpar();

        }else if(v == objCalculadora.getButtonDivide()){

            objCalculadora.setOp('/');
            objCalculos.setNumero1(Float.parseFloat(objCalculadora.getVisor().getText().toString()));
            objCalculadora.limpar();
        }
    }
}