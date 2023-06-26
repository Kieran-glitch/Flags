package com.example.flags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText ans;
    ImageView img;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans=findViewById(R.id.editTextText);
        img=findViewById(R.id.imageView);
        btn=findViewById(R.id.button);
        Drawable ims[]=new Drawable[3];
        Resources res=getResources();
        ims[0]=res.getDrawable(R.drawable.india);
        ims[1]=res.getDrawable(R.drawable.sri_lanka);
        ims[2]=res.getDrawable(R.drawable.pakistan);
        String a[]=new String[3];
        a[0]="india";
        a[1]="sri lanka";
        a[2]="pakistan";
        Random r=new Random();
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int num=r.nextInt(3-0)+0;
               img.setImageDrawable(ims[num]);
               if(ans.getText().toString().equals(a[num])){
                   Toast.makeText(MainActivity.this,"Correct!",Toast.LENGTH_LONG).show();
                   num=r.nextInt(3-0)+0;
                   img.setImageDrawable(ims[num]);
               }
               else {
                   Toast.makeText(MainActivity.this,"Wrong!",Toast.LENGTH_LONG).show();
               }
           }
       });

    }
}