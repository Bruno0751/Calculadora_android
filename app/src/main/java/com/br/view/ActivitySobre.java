package com.br.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.br.model.Sobre;

public class ActivitySobre extends AppCompatActivity implements View.OnClickListener {

    Sobre objSobre = new Sobre();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        objSobre.setvoltar((Button) findViewById(R.id.buttonVoltar));

        objSobre.getVoltar().setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == objSobre.getVoltar()) {
            finish();
        }
    }
}