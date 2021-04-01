package com.wikitude.wikitudestudioandroidapptemplate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Iniciador extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.iniciador);
        Button btn = (Button)findViewById(R.id.button1);
    }
    public void Pasar(View v){
        Intent intent = new Intent(v.getContext(), RuntimePermissionRequestActivity.class);
        startActivityForResult(intent, 0);
    }
    public void info(View view){
        Intent intento = new Intent (view.getContext(), Ayuda.class);
        startActivityForResult(intento, 0);
    }
}
