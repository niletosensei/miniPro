package dit.ksu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static dit.ksu.myapplication.R.id.bbat20;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView back = (ImageView) findViewById(R.id.blackview2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Login.class);
                startActivity(a);

            }
        });
         Button next=(Button)findViewById(R.id.bst01);
         next.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent b=new Intent(MainActivity.this,Attraction.class);
                 startActivity(b);
             }
         });
        Button next1=(Button)findViewById(bbat20);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c=new Intent(MainActivity.this,Sshoptan.class);
                startActivity(c);
            }
        });
        Button next2=(Button)findViewById(R.id.bst03);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d =new Intent(MainActivity.this,Themework.class);
                startActivity(d);
            }
        });
        Button next3=(Button)findViewById(R.id.bst4);
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f=new Intent(MainActivity.this,Contach.class);
                startActivity(f);
            }
        });
    }
}