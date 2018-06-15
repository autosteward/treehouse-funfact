package com.mente_tattica.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    // Member Variables
    private TextView tv_fact;
    private Button btn_next;
    private FactBook factBook = new FactBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assign Views
        tv_fact = findViewById(R.id.tv_fact);
        btn_next = findViewById(R.id.btn_next);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = factBook.getFact();
                // Update the screen with new fact
                tv_fact.setText(fact);
            }
        };
        btn_next.setOnClickListener(listener);
    }
}
