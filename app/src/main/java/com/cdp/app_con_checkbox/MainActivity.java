package com.cdp.app_con_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBoxBoleta,checkBoxPe,checkBoxSocio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asignarReferencias();
    }
    private void asignarReferencias(){
        checkBoxBoleta=findViewById(R.id.checkBoxBoleta);
        checkBoxPe=findViewById(R.id.checkBoxPe);
        checkBoxSocio=findViewById(R.id.checkBoxSocio);
    }
    public void calcularPago(View view){
        String msj="";
        float np=0;
        if(!checkBoxBoleta.isChecked() && !checkBoxPe.isChecked() && !checkBoxSocio.isChecked()){
            np=40000;
            Toast.makeText(this,msj+ "\n No puedes ingresar; debes tener boleta,pagar"
                    + " o ser socio: ",Toast.LENGTH_LONG).show();
        }
        if(checkBoxBoleta.isChecked()) {
            np+=0;
            msj = "Puedes ingresar y consumir 4 cervesas  \n";
        }
        if(checkBoxPe.isChecked()){
            np+=40000;
            msj = "Puedes ingresar y consumir 4 cervesas  \n";
        }
        if(checkBoxSocio.isChecked()){
            np+=0;
            msj+=checkBoxSocio.getText().toString()+" \n";
        }
        Toast.makeText(this,  msj+"\n Total a pagar: "+np,Toast.LENGTH_LONG).show();

    }
    public void limpiar(View view){
        if(checkBoxBoleta.isChecked()) checkBoxBoleta.setChecked(false);
        if(checkBoxPe.isChecked()) checkBoxPe.setChecked(false);
        if(checkBoxSocio.isChecked()) checkBoxSocio.setChecked(false);
    }
}