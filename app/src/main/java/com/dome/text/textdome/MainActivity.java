
package com.dome.text.textdome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"哈喽",Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,"哈喽",Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,"哈喽",Toast.LENGTH_SHORT).show();


    }
}
