package com.example.project;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton img_button_left;
    private ImageButton img_button_right;
    private Button resetbtn;
    private TextView mycnt;
    private int counter;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.img_Button_left :
                    minusCounter();
                    break;
                case R.id.img_Button_right :
                    plusCounter();
                    break;
                case R.id.resetbtn :
                    initCounter();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mycnt = (TextView) findViewById(R.id.mycnt);
        img_button_left = (ImageButton) findViewById(R.id.img_Button_left);
        img_button_left.setOnClickListener(clickListener);
        img_button_right = (ImageButton) findViewById(R.id.img_Button_right);
        img_button_right.setOnClickListener(clickListener);
        resetbtn = (Button) findViewById(R.id.resetbtn);
        resetbtn.setOnClickListener(clickListener);

        initCounter();

    }

    private void initCounter(){
        counter = 0;
        mycnt.setText(counter + "");
    }

    private void plusCounter(){
        counter++;
        mycnt.setText(counter + "");
    }

    private void minusCounter(){
        counter--;
        mycnt.setText(counter + "");
    }

}
