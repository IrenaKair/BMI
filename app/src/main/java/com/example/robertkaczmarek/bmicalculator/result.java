package com.example.robertkaczmarek.bmicalculator;

import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

public class result extends AppCompatActivity {
    public static final String RES = "res";
     public static final String MAX = "max";
      public static final String MIN = "min";
     public static final String FIT = "fita";
     ImageView image1;
        double s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent take = getIntent();
        String res1 = take.getStringExtra(RES);
         String max1 = take.getStringExtra(MAX);
        String min1 = take.getStringExtra(MIN);
         String fit = take.getStringExtra(FIT);

        TextView bmiIs = (TextView) findViewById(R.id.result1);
        bmiIs.setText(res1);

              image1  = (ImageView) findViewById(R.id.obraz);
            image1.setImageResource(R.drawable.abc);


        TextView commen = (TextView)findViewById(R.id.comment);
        commen.setText(min1);

        TextView comm2 = (TextView)findViewById(R.id.comment2);
        comm2.setText(max1);

        TextView com3 = (TextView)findViewById(R.id.comment3);
        com3.setText(fit);



    }
}

