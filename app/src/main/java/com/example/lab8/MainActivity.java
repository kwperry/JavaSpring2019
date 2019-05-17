package com.example.lab8;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button calc;
    private TextView bulkSavingsOut;
    private TextView buyNSavingsOut;
    private EditText numToBuy;
    private EditText itemCost;
    private EditText minimum;
    private EditText percent;
    private EditText numDisc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        calc = findViewById(R.id.btnCalc);
        numToBuy = findViewById(R.id.txtNumToBuy);
        itemCost = findViewById(R.id.txtItemCost);
        minimum = findViewById(R.id.txtMinimum);
        percent = findViewById(R.id.txtPercent);
        numDisc = findViewById(R.id.txtNumDisc);
        bulkSavingsOut = findViewById(R.id.blkDiscOut);
        buyNSavingsOut = findViewById(R.id.NSavingsOut);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int price = Integer.parseInt(itemCost.getText().toString());
                    int items = Integer.parseInt(numToBuy.getText().toString());
                    int itemsToBuy = Integer.parseInt(numDisc.getText().toString());
                    int min = Integer.parseInt(minimum.getText().toString());
                    int intpercent = Integer.parseInt(percent.getText().toString());

                    BulkDiscount blk = new BulkDiscount(min, intpercent);
                    BuyNItemsGetOneFree disc = new BuyNItemsGetOneFree(itemsToBuy);

                    bulkSavingsOut.setText(String.valueOf(blk.computeDiscount(items, price)));
                    buyNSavingsOut.setText(String.valueOf(disc.computeDiscount(items, price)));
                } catch(NumberFormatException ex )
                {

                }

                catch(NullPointerException ex)
                {

                }

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
