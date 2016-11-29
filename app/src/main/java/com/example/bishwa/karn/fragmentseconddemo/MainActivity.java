package com.example.bishwa.karn.fragmentseconddemo;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private Button btnRegister;
    private TextView tvForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnLogin.setOnClickListener(clicked);
        btnRegister.setOnClickListener(clicked);

        showLoginFragment();

    }

    private void init() {
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnRegister = (Button) findViewById(R.id.btn_register);
        tvForgotPassword = (TextView) findViewById(R.id.tv_forgot_password);

    }

    View.OnClickListener clicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_login:
                    showLoginFragment();
                    break;
                case R.id.btn_register:
                    showRegisterFragment();
                    break;

            }

        }
    };



    private void showRegisterFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new FragmentRegister()).commit();
    }


    private void showLoginFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new FragmentLogin()).commit();
    }

    public void setDialogFragment(View view) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentDialogDemo fdd = new FragmentDialogDemo();
        fdd.show(fm,"Forgot Password");

    }

    public void setDialogFragmentSecond(View view) {

        FragmentDialogDemoSecond dialogDemoSecond = new FragmentDialogDemoSecond();
        dialogDemoSecond.show(getSupportFragmentManager(),"dialog_demo_second");
    }
}
