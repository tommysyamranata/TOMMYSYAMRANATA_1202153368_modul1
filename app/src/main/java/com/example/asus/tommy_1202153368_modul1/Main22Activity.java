package com.example.asus.tommy_1202153368_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main22Activity extends AppCompatActivity {
private TextView one, two, three, four;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        one=(TextView) findViewById(R.id.textmenu);
        two=(TextView) findViewById(R.id.textporsi);
        three=(TextView) findViewById(R.id.textharga);
        three=(TextView) findViewById(R.id.restoran);


        one.setText();
        two.setText();
        three.setText();
        four.setText();


    }
}
