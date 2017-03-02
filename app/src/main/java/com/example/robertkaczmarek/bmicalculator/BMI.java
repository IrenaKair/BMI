package com.example.robertkaczmarek.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.PrintStream;

public class BMI extends AppCompatActivity {

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

        Double r = ww/(hh*hh);
        String a = String.format("%.2f", r);

        Double maxR = (hh*hh)*24.99;
        String max = String.format("%.2f", maxR);

        Double minR = (hh*hh)*18;
        String min = String.format("%.2f", minR);

        TextView result = (TextView)findViewById(R.id.result);
        result.setText("Twoje BMI: "+ "\n" + a);
        TextView comment = (TextView)findViewById(R.id.comment);

        String norma = view.getTag().toString();
        if (r < 15) {
            comment.setText("Wygłodzenie "+"\n"+ "Dla ciebie " +"\n" +"min waga to "+"\n"+ min +"kg");

        } else if (r < 17 && r >= 15) {
            comment.setText("Wychudzenie"+"\n"+ "Dla ciebie " +"\n" +"min waga to "+"\n"+ min +"kg");

        }else if (r < 18 && r >= 17) {
            comment.setText("Niedowada"+"\n"+ "Dla ciebie " +"\n" +"min waga to "+"\n"+ min +"kg");

        }
        else if (r < 25 && r >= 18) {
            comment.setText(norma);

        }else if (r < 30 && r >= 25) {
            comment.setText("Masz nadwagę" +"\n"+ "Dla ciebie " +"\n" +"max waga to "+"\n"+ max +"kg");
            

        }else if (r < 35 && r >= 30) {
            comment.setText("Otyłość I stopnia"+"\n"+ "Dla ciebie " +"\n" +"max waga to "+"\n"+ max +"kg");

        }else if (r < 40 && r >= 35) {
            comment.setText("Otyłość II stopnia"+"\n"+ "Dla ciebie " +"\n" +"max waga to "+"\n"+ max +"kg");

        }else if (r >=40)  {
            comment.setText("Otyłość skrajna "+"\n"+ "Dla ciebie " +"\n" +"max waga to "+"\n"+ max +"kg");
        }
    }

    public void cleare(View view) {
        EditText weight = (EditText) findViewById(R.id.weight);

        EditText height = (EditText)findViewById(R.id.height);

        TextView result = (TextView)findViewById(R.id.result);
        TextView comment = (TextView) findViewById(R.id.comment);
        weight.setText("");
        height.setText("");
        result.setText("");
        comment.setText("");
    }
}
