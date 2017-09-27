package com.rabby.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    public static final String Extra_message = "Extra";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
    }

    public void go(View view) {
        String s = editText.getText().toString();
        Intent intent = new Intent(this, ImpulsiveActivity.class);
        intent.putExtra(Extra_message,s);
        startActivity(intent);
    }
}
