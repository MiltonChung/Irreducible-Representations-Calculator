package com.zybooks.irreduciblerepresentationscalculator.PointGroups;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.zybooks.irreduciblerepresentationscalculator.MainActivity;
import com.zybooks.irreduciblerepresentationscalculator.R;
import com.zybooks.irreduciblerepresentationscalculator.Results;

public class o extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.o);
    }


    public void result(View view) {
        EditText value = findViewById(R.id.o_e_user_input);
        EditText value2 = findViewById(R.id.o_8c3_user_input);
        EditText value3 = findViewById(R.id.o_3c2_user_input);
        EditText value4 = findViewById(R.id.o_6c4_user_input);
        EditText value5 = findViewById(R.id.o_6c2_user_input);
        Intent intent = new Intent(this, Results.class);
        intent.putExtra("value", value.getText());
        intent.putExtra("value2", value2.getText());
        intent.putExtra("value3", value3.getText());
        intent.putExtra("value4", value4.getText());
        intent.putExtra("value5", value5.getText());
        startActivity(intent);
    }

    public void return_1(View view) {
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
        finish();
    }
}
