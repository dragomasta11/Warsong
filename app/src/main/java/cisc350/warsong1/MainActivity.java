package cisc350.warsong1;

import android.content.Intent;
/*
import android.view.View.OnClickListener;
import android.app.Activity;
*/
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static cisc350.warsong1.R.id.fire;
import static cisc350.warsong1.R.id.incarcerate;
import static cisc350.warsong1.R.id.metal;
import static cisc350.warsong1.R.id.water;
import static cisc350.warsong1.R.id.woos;


public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.EarthBoss);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EarthBoss.class);
                startActivity(intent);
            }
        });
        Button button1 = (Button) findViewById(fire);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FireBoss.class);
                startActivity(intent);
            }
        });
        Button button2 = (Button) findViewById(incarcerate);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Incarcerate.class);
                startActivity(intent);
            }
        });
        Button button3 = (Button) findViewById(water);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WaterBoss.class);
                startActivity(intent);
            }
        });
        Button button4 = (Button) findViewById(metal);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MetalBoss.class);
                startActivity(intent);
            }
        });
        Button button6 = (Button) findViewById(woos);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Woos.class);
                startActivity(intent);
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
