package br.ulbra.telas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity
{
    Button btTela1, btTela2, btTela3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        CarregarTela1(); //chamar metodo
    }

    public void CarregarTela1()
    {
        setContentView(R.layout.tela1);

        btTela1 = (Button) findViewById(R.id.btTela1);

        btTela1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CarregarTela2();
            }
        });
    }

    public void CarregarTela2()
    {
        setContentView(R.layout.tela2);
        btTela2 = (Button) findViewById(R.id.btTela2);
        btTela2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CarregarTela3();
            }
        });
    }

    public void CarregarTela3()
    {
        setContentView(R.layout.tela3);
        btTela3 = (Button) findViewById(R.id.btTela3);
        btTela3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CarregarTela1();
            }
        });
    }
}