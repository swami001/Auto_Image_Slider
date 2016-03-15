package com.example.sourabh.northbengalslider;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
    Button button;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slidshow();
    }
    public void slidshow() {

        Intent intent = new Intent(MainActivity.this, SlideShow.class);
        startActivity(intent);
        //startDisplay();
    }

}