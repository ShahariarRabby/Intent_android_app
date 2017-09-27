package com.rabby.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    public static final String Extra_message = "Extra";
    private final String TEXT_CONTENTS = "TEXT_CONTENTS";

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

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(TEXT_CONTENTS, editText.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String saveString = savedInstanceState.getString(TEXT_CONTENTS);
        editText.setText(saveString);
    }

}
