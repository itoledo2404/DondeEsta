package com.example.dondeesta;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Creo mi boton y mi editText1
		final Button boton = (Button)findViewById(R.id.button1);
		final EditText txtTexto = (EditText)findViewById(R.id.editText1);
		
		
		
		//Creo el Listener del Click Boton
		boton.setOnClickListener(new Button.OnClickListener(){
		
			@Override
			public void onClick(View v) {
				
				//Creo mi variable texto y le asigno el valor del editText1
				String texto = txtTexto.getText().toString();
				
				//Uso la clase Intent para llamar al Googlemaps y le paso mi variable texto como direccion
				Intent mapa = new Intent (android.content.Intent.ACTION_VIEW,
						Uri.parse("geo:0,0?q=" + texto));
				startActivity(mapa);
				
			}
		}
		
		
);
		
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
}
