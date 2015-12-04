//package com.bys.devicemaster;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.widget.Button;
//import android.widget.TextView;
//
//import butterknife.Bind;
//import butterknife.ButterKnife;
//import butterknife.OnClick;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Bind(R.id.app_name)TextView app_name;
//    @Bind(R.id.show_button)Button show_button;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        ButterKnife.bind(this);
//    }
//
//    @OnClick(R.id.show_button) void clickShow(){
//        app_name.setText("I'm here!");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//    }
//}
