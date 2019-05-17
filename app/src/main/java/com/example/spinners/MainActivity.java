package com.example.spinners;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private TextView flavorText;
    private Spinner iceCream;
    private Spinner itemSpinner;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        submit = findViewById(R.id.Submit);
        flavorText =findViewById(R.id.FlavorText);
        iceCream = findViewById(R.id.IceCream);
        submit = findViewById(R.id.Submit);
        itemSpinner = findViewById(R.id.Spinner2);
        setSupportActionBar(toolbar);
        List<String> list = new ArrayList<String>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        ArrayAdapter<String> dataAdapter = new 	ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        itemSpinner.setAdapter(dataAdapter);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String flavor = iceCream.getSelectedItem().toString();
                flavorText.setText("The flavor is: " + flavor);
            }
        });


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
