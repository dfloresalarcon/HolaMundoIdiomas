package com.example.dfloresalarcon.holamundoidiomas;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FORMA 1 CUTRE :D
        TextView texto = (TextView)findViewById(R.id.toShow);
        if (texto.getText().toString().contains("port"))
        {
            showToast("nada");
        }
        else{
            showToast("Por favor gire el dispositivo para ponerlo de manera vertical");
        }


        //FORMA 2
        //setContentView(R.layout.main);
        Display display = ((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
        // Get the orientation
        int orientacionDeLaPantalla = display.getOrientation();

        if(orientacionDeLaPantalla ==0){
            Toast.makeText(MainActivity.this, "Orientacion: Vertical con Valor"+ orientacionDeLaPantalla, Toast.LENGTH_SHORT).show();
        }
        if(orientacionDeLaPantalla ==1){
            Toast.makeText(MainActivity.this, "Orientacion: Horizontal con Valor"+ orientacionDeLaPantalla, Toast.LENGTH_SHORT).show();
        }


        //FORMA GONZALO
        if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE)
        {
            Toast.makeText(MainActivity.this, "ES HORIZONTAAALL!!! YEEP", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(MainActivity.this, "ES VERTICAAAAAAAAAL!!! YEEP", Toast.LENGTH_LONG).show();
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void showToast(String msg)
    {
        Toast t = Toast.makeText(this.getApplicationContext(), msg, Toast.LENGTH_LONG);
        t.show();
    }

}
