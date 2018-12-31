package com.sercanyilmaz.androidcirclemenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    String arrayName[]={"Facebook",
                        "Twitter",
                        "Driver",
                        "Gmail",
                        "Google+"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleMenu circleMenu=(CircleMenu)findViewById(R.id.circle_menu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.add,R.drawable.close)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.facebook)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.twitter)
                .addSubMenu(Color.parseColor("#1a237e"),R.drawable.google_driver)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.gmail)
                .addSubMenu(Color.parseColor("#f95d8b"),R.drawable.google_plus)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        Toast.makeText(MainActivity.this,"You Selected "+arrayName[index],Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
