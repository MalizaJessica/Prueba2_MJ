package com.deitel.doodlz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText editTextUsuario;
    private EditText editTextContrasena;
    private Button buttonIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        editTextUsuario = findViewById(R.id.editTextUsuario);
        editTextContrasena = findViewById(R.id.editTextContrasena);
        buttonIngresar = findViewById(R.id.buttonIngresar);
        //
        buttonIngresar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String usuario = editTextUsuario.getText().toString();
                String clave = editTextContrasena.getText().toString();
                if ((usuario.equals("Jessica") && clave.equals("Jessica"))||((usuario.equals("Maliza") && clave.equals("Maliza")))){
                    //mostrar un activity
                    //Intent intent = new Intent(this,MainActivity.class);
                    Toast.makeText(getApplicationContext(), "correcto", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    //pasar parametros
                   // intent.putExtra("variable_usuario",usuario);
                 //   intent.putExtra("variable_clave",clave);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "ERROR:  Usuario o clave incorrecto", Toast.LENGTH_LONG).show();

                   // Toast.makeText(this, "  ERROR:  Usuario o clave incorrecto", Toast.LENGTH_SHORT).show();
                }
            }

        });


    //public  void  ingresar (View view){
   //     String usuario = editTextUsuario.getText().toString();
     //   String clave = editTextContrasena.getText().toString();

       // if ((usuario.equals("Jessica") && clave.equals("Jessica"))||usuario.equals("Maliza") && clave.equals("Maliza") ){
            //mostrar un activity
         //   Intent intent = new Intent(this,MainActivity.class);

            //pasar parametros

         //   intent.putExtra("variable_usuario",usuario);
           // intent.putExtra("variable_clave",clave);


         //   startActivity(intent);
       // } else {
        //    Toast.makeText(this, "  ERROR:  Usuario o clave incorrecto", Toast.LENGTH_SHORT).show();
      //  }

    }
}