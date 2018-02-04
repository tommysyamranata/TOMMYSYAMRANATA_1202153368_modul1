package com.example.asus.tommy_1202153368_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText texta, textb;
    private Button buttona, buttonb;
    private int jumlah, total;
    private int uang = 65500;
    private String menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texta =(EditText) findViewById(R.id.textPilih);
        textb =(EditText) findViewById(R.id.textJumlah);

        buttona =(Button) findViewById(R.id.button2);
        buttonb =(Button) findViewById(R.id.button3);



        buttona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String menu = texta.getText().toString();
                String jumlah = textb.getText().toString();
                jumlah = Integer.parseInt(jumlah);
                total = jumlah * 50000;


                Intent part2 = new Intent(getApplicationContext(), Main22Activity.class);
                startActivity(part2);

            }

        });

        buttonb.setOnClickListener(new View.OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View view){
                                           Intent part2 = new Intent(getApplicationContext(), Main22Activity.class);
                                           startActivity(part2);

                                       }
                                   }


        );


    }

}
