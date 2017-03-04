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

        Double r = ww/(hh*hh/10000);
        String a = String.format("%.2f", r);

        Double maxR = (hh*hh/10000)*24.99;
        String max = String.format("%.2f", maxR);

        Double minR = (hh*hh/10000)*18;
        String min = String.format("%.2f", minR);

        TextView result = (TextView)findViewById(R.id.result);
        String bmi = getString(R.string.bmi);
        result.setText(bmi + "\n" + a);
        TextView comment = (TextView)findViewById(R.id.comment);
        String fitA = getString(R.string.fitA);
        String fitB = getString(R.string.fitB);
        String fitC = getString(R.string.fitC);
        String fitD = getString(R.string.fitD);
        String fatE = getString(R.string.fatE);
        String fatG = getString(R.string.fatG);
        String fatF = getString(R.string.fatF);
        String fatH = getString(R.string.fatH);

        //String norma = view.getTag().toString();
        if (r < 15) {
            comment.setText(fitA);// +"\n"+ "Dla ciebie " +"\n" +"min waga to "+"\n"+ min +"kg");

        } else if (r < 17 && r >= 15) {
            comment.setText(fitB);// +"\n"+ "Dla ciebie " +"\n" +"min waga to "+"\n"+ min +"kg");

        }else if (r < 18 && r >= 17) {
            comment.setText(fitC);//+"\n"+ "Dla ciebie " +"\n" +"min waga to "+"\n"+ min +"kg");

        }
        else if (r < 25 && r >= 18) {
            comment.setText(fitD);

        }else if (r < 30 && r >= 25) {
            comment.setText(fatE);// +"\n"+ "Dla ciebie " +"\n" +"max waga to "+"\n"+ max +"kg");
            

        }else if (r < 35 && r >= 30) {
            comment.setText(fatF);//+"\n"+ "Dla ciebie " +"\n" +"max waga to "+"\n"+ max +"kg");

        }else if (r < 40 && r >= 35) {
            comment.setText(fatG);// +"\n"+ "Dla ciebie " +"\n" +"max waga to "+"\n"+ max +"kg");

        }else if (r >=40)  {
            comment.setText(fatH);// +"\n"+ "Dla ciebie " +"\n" +"max waga to "+"\n"+ max +"kg");
        }
        TextView comment2 = (TextView) findViewById(R.id.comment2);
        String ooo = getString(R.string.oooo);
        String aa = getString(R.string.aa);
        String kg = getString(R.string.kg);
        comment2.setText(ooo +"\n"+ min +" "+ aa+" "+ max+" "+kg);
    }

    public void cleare(View view) {
        EditText weight = (EditText) findViewById(R.id.weight);

        EditText height = (EditText)findViewById(R.id.height);

        TextView result = (TextView)findViewById(R.id.result);
        TextView comment = (TextView) findViewById(R.id.comment);
        TextView comment2 = (TextView) findViewById(R.id.comment2);
        weight.setText("");
        height.setText("");
        result.setText("");
        comment.setText("");
        comment2.setText("");
    }
}
