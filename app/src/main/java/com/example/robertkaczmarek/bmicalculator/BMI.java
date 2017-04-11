package com.example.robertkaczmarek.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.PrintStream;

public class BMI extends AppCompatActivity {

    Double result2;
    Double minR;
    Double maxR;
    String fit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
    }

    public void calculate(View view) {
        EditText weight = (EditText) findViewById(R.id.weight);
        String w = weight.getText().toString();
        Double ww = Double.parseDouble(w);
        EditText height = (EditText)findViewById(R.id.height);
        String h = height.getText().toString();
        Double hh = Double.parseDouble(h);

         result2 = ww/(hh*hh/10000);
        Double maxR = (hh*hh/10000)*24.99;

        Double minR = (hh*hh/10000)*18;



        if (result2 < 15) {
             fit = getString(R.string.fitA);

        } else if (result2 < 17 && result2 >= 15) {
            fit = getString(R.string.fitB);
        }else if (result2 < 18 && result2 >= 17) {
             fit = getString(R.string.fitC);

        }
        else if (result2 < 25 && result2 >= 18) {

            fit = getString(R.string.fitD);


        }else if (result2 < 30 && result2 >= 25) {

             fit = getString(R.string.fatE);

        }else if (result2 < 35 && result2 >= 30) {

             fit = getString(R.string.fatF);
        }else if (result2 < 40 && result2 >= 35) {
             fit = getString(R.string.fatG);
        }else if (result2 >=40) {
            fit = getString(R.string.fatH);

        }



        String a = String.format("%.2f", result2);
        String max = String.format("%.2f", maxR);
        String min = String.format("%.2f", minR);
        String fita = fit;




        Intent go = new Intent(BMI.this, result.class);
        go.putExtra(result.RES, a);
        go.putExtra(result.FIT,fita);
        go.putExtra(result.MIN, min);
        go.putExtra(result.MAX, max);




        startActivity(go);
    }





    public void cleare(View view) {
        EditText weight = (EditText) findViewById(R.id.weight);

        EditText height = (EditText)findViewById(R.id.height);

        TextView result1 = (TextView)findViewById(R.id.result1);
        TextView comment = (TextView) findViewById(R.id.comment);
        TextView comment2 = (TextView) findViewById(R.id.comment2);
        weight.setText("");
        height.setText("");
        result1.setText("");
        comment.setText("");
        comment2.setText("");
    }
}
