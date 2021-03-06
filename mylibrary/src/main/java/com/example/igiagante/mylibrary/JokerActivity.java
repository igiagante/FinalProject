package com.example.igiagante.mylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * @author igiagante
 */
public class JokerActivity extends AppCompatActivity {

    private static final String JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        if(intent != null) {
            String joke = intent.getStringExtra(JOKE);
            Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
        }
    }
}
