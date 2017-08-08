package com.example.iyashwant.a24crafts;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Verification extends AppCompatActivity {
    ImageView fb,insta,twitter,phone,google;
    TextView fb_text,insta_text,google_text,twitter_text,phone_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        fb =(ImageView)findViewById(R.id.fb);
        insta=(ImageView) findViewById(R.id.insta);
        twitter = (ImageView) findViewById(R.id.twitter);
        phone = (ImageView) findViewById(R.id.phone);
        google = (ImageView) findViewById(R.id.google);



        fb_text= (TextView)findViewById(R.id.fb_text_veri);
        insta_text =(TextView)findViewById(R.id.insta_text_veri);
        twitter_text=(TextView)findViewById(R.id.twiter_text_veri);
        phone_text=(TextView)findViewById(R.id.phone_text_veri);
        google_text=(TextView)findViewById(R.id.google_text_veri);


        fb.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                fb.setImageResource(R.drawable.facebook);
                fb_text.setTextColor(Color.GREEN);
                fb_text.setText("Verified!");

                return false;
            }
        });

        insta.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                insta.setImageResource(R.drawable.insta);
                insta_text.setTextColor(Color.GREEN);
                insta_text.setText("verified!");
                return false;
            }
        });


        twitter.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                twitter.setImageResource(R.drawable.twitter);
                twitter_text.setTextColor(Color.GREEN);
                twitter_text.setText("verified!");
                return false;
            }

        });

        phone.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {


                View view2 = LayoutInflater.from(Verification.this).inflate(R.layout.phone_verify,null);

                AlertDialog.Builder builder = new AlertDialog.Builder(Verification.this);
                builder.setView(view2).setPositiveButton("verify !", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        phone_text.setTextColor(Color.GREEN);
                        phone_text.setText("verified!");
                        phone.setImageResource(R.drawable.phone2);




                    }
                }).setNegativeButton("cancel",null).setCancelable(true);

                AlertDialog alertDialog= builder.create();
                alertDialog.show();
                return false;
            }
        });


        google.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                google.setImageResource(R.drawable.google);
                google_text.setTextColor(Color.GREEN);
                google_text.setText("verified!");

                return false;
            }

        });




    }
}
