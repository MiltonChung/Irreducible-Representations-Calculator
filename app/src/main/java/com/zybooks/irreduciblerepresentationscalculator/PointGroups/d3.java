package com.zybooks.irreduciblerepresentationscalculator.PointGroups;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.zybooks.irreduciblerepresentationscalculator.MainActivity;
import com.zybooks.irreduciblerepresentationscalculator.R;
import com.zybooks.irreduciblerepresentationscalculator.Results;

public class d3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d3);
    }


    public void result(View view) {
        EditText value = findViewById(R.id.d3_e_user_input);
        EditText value2 = findViewById(R.id.d3_2c3_user_input);
        EditText value3 = findViewById(R.id.d3_3c2_user_input);
        Intent intent = new Intent(this, Results.class);
        intent.putExtra("value", value.getText());
        intent.putExtra("value2", value2.getText());
        intent.putExtra("value3", value3.getText());
        startActivity(intent);
    }

    public void return_1(View view) {
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
        finish();
    }
}