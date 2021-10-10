package com.example.hellotoast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount ;
    public static final String EXTRA_MESSAGE = "com.example.hellotoast.MESSAGE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount =(TextView)findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        activity2();

    }


    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
    public void activity2() {
        Intent intent = new Intent(this, hello.class);

        String message = mShowCount.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);
    }

    }