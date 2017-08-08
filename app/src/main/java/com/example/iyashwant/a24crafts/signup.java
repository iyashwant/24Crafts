package com.example.iyashwant.a24crafts;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class signup extends AppCompatActivity {

   // String[] country = {"Who am I? ","Producer","director"};

    String[] whoN={"Who am I? ","Actor","Actress","Music Director","Singer","Producer","Director","Co-Director"};
    String name;
    //int flags[] = {R.drawable.india, R.drawable.china, R.drawable.australia, R.drawable.portugle, R.drawable.america, R.drawable.new_zealand};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.spinner);
       // spin.setOnItemSelectedListener(ge);

        CustomAdapterSpinner customAdapter=new CustomAdapterSpinner(getApplicationContext(),whoN);
        spin.setAdapter(customAdapter);

        final EditText name1 =(EditText)findViewById(R.id.name1);


        Button next = (Button)findViewById(R.id.button1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name=name1.getText().toString();
                Intent goToNextActivity = new Intent(getApplicationContext(), signup2.class);
                Bundle bundle = new Bundle();
                bundle.putString("name",name);
              //  bundle.putInt("pos",position);
                goToNextActivity.putExtras(bundle);
                startActivity(goToNextActivity);
            }
        });



    }


    @Override
        public boolean dispatchTouchEvent(MotionEvent ev) {
            View v = getCurrentFocus();

        if (v != null &&
                (ev.getAction() == MotionEvent.ACTION_UP || ev.getAction() == MotionEvent.ACTION_MOVE) &&
                v instanceof EditText &&
                !v.getClass().getName().startsWith("android.webkit.")) {
            int scrcoords[] = new int[2];
            v.getLocationOnScreen(scrcoords);
            float x = ev.getRawX() + v.getLeft() - scrcoords[0];
            float y = ev.getRawY() + v.getTop() - scrcoords[1];

            if (x < v.getLeft() || x > v.getRight() || y < v.getTop() || y > v.getBottom())
                hideKeyboard(this);
        }
        return super.dispatchTouchEvent(ev);
    }

    public static void hideKeyboard(Activity activity) {
        if (activity != null && activity.getWindow() != null && activity.getWindow().getDecorView() != null) {
            InputMethodManager imm = (InputMethodManager)activity.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
        }
    }
}
