package com.example.kushagra.udaipur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import static com.example.kushagra.udaipur.R.*;

public class MainActivity extends AppCompatActivity {
    TextView textView;
   // ImageView imageView3;
    Button button,button2,button3,button4,button5;
    //ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
       // imageView3=findViewById(R.id.imageView3);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
       // flipper=findViewById(R.id.flipper);
    }
     public void funa(View view)
     {
         Intent intent=new Intent(this,Main2Activity.class);
         startActivity(intent);
     }
    public void funb(View view)
    {
        Intent intent=new Intent(this,geo_activity.class);
        startActivity(intent);
    }
    public void func(View view)
    {
        Intent intent=new Intent(this,eco_activity.class);
        startActivity(intent);
    }
    public void fund(View view)
    {
        Intent intent=new Intent(this,abt_activity.class);
        startActivity(intent);
    }
    public void funw(View view)
    {
        Intent intent=new Intent(this,wiki_activity.class);
        startActivity(intent);
    }
}
