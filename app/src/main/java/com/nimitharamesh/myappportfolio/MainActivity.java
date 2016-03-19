package com.nimitharamesh.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    /** Button methods that display a toast */

    public void spotifyStreamer(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Spotify Streamer app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        //Display toast at the bottom using the full width
        toast.setGravity(Gravity.FILL_HORIZONTAL,0,850);
        toast.show();
    }

    public void scoresApp(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Scores App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        //Display toast at the bottom using the full width
        toast.setGravity(Gravity.FILL_HORIZONTAL,0,850);
        toast.show();
    }

    public void libraryApp(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Library App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        //Display toast at the bottom using the full width
        toast.setGravity(Gravity.FILL_HORIZONTAL,0,850);
        toast.show();
    }

    public void buildItBigger(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Build it Bigger app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        //Display toast at the bottom using the full width
        toast.setGravity(Gravity.FILL_HORIZONTAL,0,850);
        toast.show();
    }

    public void xyzReader(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my XYZ Reader app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        //Display toast at the bottom using the full width
        toast.setGravity(Gravity.FILL_HORIZONTAL,0,850);
        toast.show();
    }

    public void capstoneMyOwnApp(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Capstone app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        //Display toast at the bottom using the full width
        toast.setGravity(Gravity.FILL_HORIZONTAL,0,850);
        toast.show();
    }

}
