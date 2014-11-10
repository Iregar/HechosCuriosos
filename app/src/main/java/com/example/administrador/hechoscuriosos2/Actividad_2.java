package com.example.administrador.hechoscuriosos2;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Random;

public class Actividad_2 extends Activity {

    //Declare 3 variables of the class TextView and button

    private TextView factLabel;
    private RelativeLayout background;
    private FactBook factBook;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_2);

        //metodo findViewBYiD sirve para asiganar valores


        factLabel = (TextView) findViewById(R.id.textView);
        background = (RelativeLayout) findViewById(R.id.background);
        factBook = new FactBook();  //instancio el atributo que me cree arriba


        /*
        cuando pinche onClick ira a buscar a la clase FactBook que contiene el array de las frases
        y las mostrará aleatoriamente
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

        */

    public void onClick(View view) {

        factLabel.setText(factBook.getRamdomFact());
    }

}
       /* ) ;*/

   /** public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.actividad_2, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
   // }
}**/
