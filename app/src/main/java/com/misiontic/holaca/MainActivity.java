package com.misiontic.holaca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Método para generar el menú
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    // Método para asignar funciones al menú
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.item_contactos) {
            goToContacts();
        } else if (id == R.id.item_pedidos) {
            goToOrders();
        }
        return super.onOptionsItemSelected(item);
    }


    public void goToCalculator(View view) {
        Intent calculator = new Intent(this, CalculatorActivity.class);
        // Intent calculator = new Intent(this, ScrollActivity.class);

        etName = (EditText) findViewById(R.id.etPersonName);
        String nombre = etName.getText().toString();

        calculator.putExtra("user", nombre);

        startActivity(calculator);
    }

    public void goToContacts() {
        Intent intentContacts = new Intent(this, ScrollActivity.class);
        startActivity(intentContacts);
    }

    public void goToOrders() {
        Intent intentOrder = new Intent(this, OrderActivity.class);
        startActivity(intentOrder);
    }


}