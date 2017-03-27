package xabi.es.zinovax.pulsaciones1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador=0;

    }

    //Esto es un metodo
    public void sumaContador (View vista){
        contador++;
        //Llamamos al metodo mostrarResultado;
        mostrarResultado();
    }
    //Esto es un metodo
    public void restaContador (View vista){
        contador--;
        //Llamamos al metodo mostrarResultado;
        mostrarResultado();
    }
    //Esto es un metodo
    public void reseteaContador (View vista){
        contador=0;
        //Llamamos al metodo mostrarResultado;
        mostrarResultado();
    }

    //Metodo
    public void mostrarResultado(){
        TextView valtexto = (TextView)findViewById(R.id.contadorvalor);

        if (contador > 0 ) {
            valtexto.setTextColor(Color.GREEN);
        }else if (contador == 0) {
            valtexto.setTextColor(Color.BLUE);
        } else {
            valtexto.setTextColor(Color.RED);
        }

            //Metemos un blano por delante de la variable contador, si no el setText da error
        valtexto.setText("" + contador);

    }

}
