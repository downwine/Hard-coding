package com.example.project;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton img_button_left; /*Левая кнопка*/
    private ImageButton img_button_right; /*Правая кнопка*/
    private Button resetbtn; /*Кнопка сброса*/
    private TextView mycnt; /*Число*/
    private int counter; /*Счетчик*/

    /*Вызов небходимого метода в зависимости от нажатой кнопки*/
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
        /*Объявление числа*/
        mycnt = (TextView) findViewById(R.id.mycnt);
        /*Объявление левой кнопки*/
        img_button_left = (ImageButton) findViewById(R.id.img_Button_left);
        /*Метод для нажатия левой кнопки*/
        img_button_left.setOnClickListener(clickListener);
        /*Объявление правой кнопки*/
        img_button_right = (ImageButton) findViewById(R.id.img_Button_right);
        /*Метод для нажатия правой кнопки*/
        img_button_right.setOnClickListener(clickListener);
        /*Объявление кнопки сброса*/
        resetbtn = (Button) findViewById(R.id.resetbtn);
        /*Метод для нажатия кнопки сброса*/
        resetbtn.setOnClickListener(clickListener);

        initCounter();

    }

    /*Метод сброса подсчета*/
    private void initCounter(){
        counter = 0;
        mycnt.setText(counter + "");
    }

    /*Метод суммирования числа*/
    private void plusCounter(){
        counter++;
        mycnt.setText(counter + "");
    }

    /*Метод вычитания числа*/
    private void minusCounter(){
        counter--;
        mycnt.setText(counter + "");
    }

}
