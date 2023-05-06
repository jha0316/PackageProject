package com.example.packageproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 첫 화면은 1번으로 초기화
        initTransactionEvent();

    }

    // 카테고리 변환
    private void initTransactionEvent() {
        final FirstFragment firstFragment = new FirstFragment();
        final SecondFragment secondFragment = new SecondFragment();
        final ThirdFragment thirdFragment = new ThirdFragment();
        final FourthFragment fourthFragment = new FourthFragment();

        Button form_list_button1 = (Button) findViewById(R.id.form_list_1);
        Button form_list_button2 = (Button) findViewById(R.id.form_list_2);
        Button form_list_button3 = (Button) findViewById(R.id.form_list_3);
        Button form_list_button4 = (Button) findViewById(R.id.form_list_4);

        // FragmentManager 호출
        getSupportFragmentManager().beginTransaction().add(R.id.form_list_fv, firstFragment).commit();

        // Transaction 작업
        form_list_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Button color
                form_list_button1.setBackgroundResource(R.drawable.category_selected);
                form_list_button2.setBackgroundResource(R.color.transparent);
                form_list_button3.setBackgroundResource(R.color.transparent);
                form_list_button4.setBackgroundResource(R.color.transparent);

                // text color
                form_list_button1.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                form_list_button2.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                form_list_button3.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                form_list_button4.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.form_list_fv, firstFragment);
                transaction.commit();
            }
        });

        form_list_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Button color
                form_list_button1.setBackgroundResource(R.color.transparent);
                form_list_button2.setBackgroundResource(R.drawable.category_selected);
                form_list_button3.setBackgroundResource(R.color.transparent);
                form_list_button4.setBackgroundResource(R.color.transparent);

                // text color
                form_list_button1.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                form_list_button2.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                form_list_button3.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                form_list_button4.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.form_list_fv, secondFragment);
                transaction.commit();
            }
        });

        form_list_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Button color
                form_list_button1.setBackgroundResource(R.color.transparent);
                form_list_button2.setBackgroundResource(R.color.transparent);
                form_list_button3.setBackgroundResource(R.drawable.category_selected);
                form_list_button4.setBackgroundResource(R.color.transparent);

                // text color
                form_list_button1.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                form_list_button2.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                form_list_button3.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                form_list_button4.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.form_list_fv, thirdFragment);
                transaction.commit();
            }
        });

        form_list_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Button color
                form_list_button1.setBackgroundResource(R.color.transparent);
                form_list_button2.setBackgroundResource(R.color.transparent);
                form_list_button3.setBackgroundResource(R.color.transparent);
                form_list_button4.setBackgroundResource(R.drawable.category_selected);

                // text color
                form_list_button1.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                form_list_button2.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                form_list_button3.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                form_list_button4.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.form_list_fv, fourthFragment);
                transaction.commit();
            }
        });
    }
}