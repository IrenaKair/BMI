package com.example.robertkaczmarek.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ShareActionProvider;
import android.widget.TextView;

public class result1 extends AppCompatActivity {
    public static final String WEIGHT = "weight";
    public static final String HEIGHT = "height";
    String fit;
    String min;
    String max;
    Intent b;
    String rr;

    private ShareActionProvider shareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);

        Intent take = getIntent();
        String w = take.getStringExtra(WEIGHT);
        String h = take.getStringExtra(HEIGHT);
        Double ww = Double.parseDouble(w);
        Double hh = Double.parseDouble(h);

        Double r = ww / (hh * hh / 10000);
        Double maxR = (hh * hh / 10000) * 24.99;

        Double minR = (hh * hh / 10000) * 18;

        if (r < 15) {
            rr = String.format("%.2f", r);
            TextView wyn = (TextView) findViewById(R.id.result10);
            wyn.setText(rr);
            RelativeLayout new1 = (RelativeLayout) findViewById(R.id.activity_result1);
            new1.setBackgroundColor(ContextCompat.getColor(this, R.color.backgrA));
            ImageView obraz = (ImageView) findViewById(R.id.obrazek);
            obraz.setImageResource(R.drawable.ic_drawing);
            fit = getString(R.string.fitA);
            TextView comment = (TextView) findViewById(R.id.comment);
            comment.setText(fit);
            String sug = getString(R.string.suggestion);
            String and = getString(R.string.aa);
            String kg = getString(R.string.kg);
            min = String.format("%.2f", minR);
            max = String.format("%.2f", maxR);
            TextView interpretation = (TextView) findViewById(R.id.interpretation1);
            interpretation.setText(sug + " \n" + min + " " + and + " " + max + " " + kg);
        } else if (r >= 15 && r < 17) {
            rr = String.format("%.2f", r);
            TextView wyn = (TextView) findViewById(R.id.result10);
            wyn.setText(rr);
            RelativeLayout new1 = (RelativeLayout) findViewById(R.id.activity_result1);
            new1.setBackgroundColor(ContextCompat.getColor(this, R.color.backgrB));
            ImageView obraz = (ImageView) findViewById(R.id.obrazek);
            obraz.setImageResource(R.drawable.ic_drawing);
            fit = getString(R.string.fitB);
            TextView comment = (TextView) findViewById(R.id.comment);
            comment.setText(fit);
            String sug = getString(R.string.suggestion);
            String and = getString(R.string.aa);
            String kg = getString(R.string.kg);
            min = String.format("%.2f", minR);
            max = String.format("%.2f", maxR);
            TextView interpretation = (TextView) findViewById(R.id.interpretation1);
            interpretation.setText(sug + " \n" + min + " " + and + " " + max + " " + kg);
        } else if (r >= 17 && r < 18) {
            rr = String.format("%.2f", r);
            TextView wyn = (TextView) findViewById(R.id.result10);
            wyn.setText(rr);
            RelativeLayout new1 = (RelativeLayout) findViewById(R.id.activity_result1);
            new1.setBackgroundColor(ContextCompat.getColor(this, R.color.backgrC));
            ImageView obraz = (ImageView) findViewById(R.id.obrazek);
            obraz.setImageResource(R.drawable.ic_drawing);
            fit = getString(R.string.fitC);
            TextView comment = (TextView) findViewById(R.id.comment);
            comment.setText(fit);
            String sug = getString(R.string.suggestion);
            String and = getString(R.string.aa);
            String kg = getString(R.string.kg);
            min = String.format("%.2f", minR);
            max = String.format("%.2f", maxR);
            TextView interpretation = (TextView) findViewById(R.id.interpretation1);
            interpretation.setText(sug + " \n" + min + " " + and + " " + max + " " + kg);
            setTheme(R.style.resultCommentN);
        } else if (r >= 18 && r < 25) {
            rr = String.format("%.2f", r);
            TextView wyn = (TextView) findViewById(R.id.result10);
            wyn.setText(rr);
            RelativeLayout new1 = (RelativeLayout) findViewById(R.id.activity_result1);
            new1.setBackgroundColor(ContextCompat.getColor(this, R.color.backgrD));
            ImageView obraz = (ImageView) findViewById(R.id.obrazek);
            obraz.setImageResource(R.drawable.ic_drawing);
            fit = getString(R.string.fitD);
            TextView comment = (TextView) findViewById(R.id.comment);
            comment.setText(fit);
            String sug = getString(R.string.suggestion);
            String and = getString(R.string.aa);
            String kg = getString(R.string.kg);
            min = String.format("%.2f", minR);
            max = String.format("%.2f", maxR);
            TextView interpretation = (TextView) findViewById(R.id.interpretation1);
            interpretation.setText(sug + " \n" + min + " " + and + " " + max + " " + kg);
            setTheme(R.style.resultCommentF);
        } else if (r >= 25 && r < 30) {
            rr = String.format("%.2f", r);
            TextView wyn = (TextView) findViewById(R.id.result10);
            wyn.setText(rr);
            RelativeLayout new1 = (RelativeLayout) findViewById(R.id.activity_result1);
            new1.setBackgroundColor(ContextCompat.getColor(this, R.color.backgrE));
            ImageView obraz = (ImageView) findViewById(R.id.obrazek);
            obraz.setImageResource(R.drawable.ic_drawing);
            fit = getString(R.string.fatE);
            TextView comment = (TextView) findViewById(R.id.comment);
            comment.setText(fit);
            String sug = getString(R.string.suggestion);
            String and = getString(R.string.aa);
            String kg = getString(R.string.kg);
            min = String.format("%.2f", minR);
            max = String.format("%.2f", maxR);
            TextView interpretation = (TextView) findViewById(R.id.interpretation1);
            interpretation.setText(sug + " \n" + min + " " + and + " " + max + " " + kg);
        } else if (r >= 30 && r < 35) {
            rr = String.format("%.2f", r);
            TextView wyn = (TextView) findViewById(R.id.result10);
            wyn.setText(rr);
            RelativeLayout new1 = (RelativeLayout) findViewById(R.id.activity_result1);
            new1.setBackgroundColor(ContextCompat.getColor(this, R.color.backgrF));
            ImageView obraz = (ImageView) findViewById(R.id.obrazek);
            obraz.setImageResource(R.drawable.ic_drawing);
            fit = getString(R.string.fatF);
            TextView comment = (TextView) findViewById(R.id.comment);
            comment.setText(fit);
            String sug = getString(R.string.suggestion);
            String and = getString(R.string.aa);
            String kg = getString(R.string.kg);
            min = String.format("%.2f", minR);
            max = String.format("%.2f", maxR);
            TextView interpretation = (TextView) findViewById(R.id.interpretation1);
            interpretation.setText(sug + " \n" + min + " " + and + " " + max + " " + kg);
        } else if (r >= 35 && r < 40) {
            rr = String.format("%.2f", r);
            TextView wyn = (TextView) findViewById(R.id.result10);
            wyn.setText(rr);
            RelativeLayout new1 = (RelativeLayout) findViewById(R.id.activity_result1);
            new1.setBackgroundColor(ContextCompat.getColor(this, R.color.backgrG));
            ImageView obraz = (ImageView) findViewById(R.id.obrazek);
            obraz.setImageResource(R.drawable.ic_drawing);
            fit = getString(R.string.fatG);
            TextView comment = (TextView) findViewById(R.id.comment);
            comment.setText(fit);
            String sug = getString(R.string.suggestion);
            String and = getString(R.string.aa);
            String kg = getString(R.string.kg);
            min = String.format("%.2f", minR);
            max = String.format("%.2f", maxR);
            TextView interpretation = (TextView) findViewById(R.id.interpretation1);
            interpretation.setText(sug + " \n" + min + " " + and + " " + max + " " + kg);
        } else if (r > 40) {
            rr = String.format("%.2f", r);
            TextView wyn = (TextView) findViewById(R.id.result10);
            wyn.setText(rr);
            RelativeLayout new1 = (RelativeLayout) findViewById(R.id.activity_result1);
            new1.setBackgroundColor(ContextCompat.getColor(this, R.color.backgrH));
            ImageView obraz = (ImageView) findViewById(R.id.obrazek);
            obraz.setImageResource(R.drawable.ic_drawing);
            fit = getString(R.string.fatH);
            TextView comment = (TextView) findViewById(R.id.comment);
            comment.setText(fit);
            String sug = getString(R.string.suggestion);
            String and = getString(R.string.aa);
            String kg = getString(R.string.kg);
            min = String.format("%.2f", minR);
            max = String.format("%.2f", maxR);
            TextView interpretation = (TextView) findViewById(R.id.interpretation1);
            interpretation.setText(sug + " \n" + min + " " + and + " " + max + " " + kg);
            setTheme(R.style.resultCommentS);
        }
        TextView back = (TextView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b = new Intent(result1.this, BMI.class);
                startActivity(b);
                finish();
            }

        });


    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.share, menu);
       // MenuItem menuItem = menu.findItem(R.id.action_share);
        shareActionProvider = (ShareActionProvider) menu.findItem(R.id.action_share).getActionProvider();
        return true;
      //  setIntent("BIM wynosi ");
       // return super.onCreateOptionsMenu(menu);
    }



    private void setIntent() {

        Intent inte = new Intent(Intent.ACTION_SEND);
        inte.setType("Text/plain");
        inte.putExtra(Intent.EXTRA_TEXT, "This is");
        shareActionProvider.setShareIntent(inte);
      /*  Uri uri = Uri.parse("android.resource://com.mypackage.myapp/");
        inte.putExtra(Intent.EXTRA_STREAM, uri);
        inte.putExtra(Intent.EXTRA_TEXT, "Email body text");
        startActivity(Intent.createChooser(inte, "Share your card with:"));  //to jest z internrtu i nie rozumiem
    }



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_share:
                setIntent();
                break;
        }
        return true;
    }*/
      //  return super.onOptionsItemSelected(item);
    }
