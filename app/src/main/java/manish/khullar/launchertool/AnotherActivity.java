package manish.khullar.launchertool;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.content.Intent.ACTION_MAIN;

public class AnotherActivity extends AppCompatActivity {

    TextView Wapp, Cal, Utube, Play, Music, Power,Misc;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Wapp = findViewById(R.id.tvWapp);
        Cal = findViewById(R.id.tvCalender);
        Utube = findViewById(R.id.tvUtube);
        Play = findViewById(R.id.tvPlay);
        Power = findViewById(R.id.tvPower);
        Music=findViewById(R.id.tvMusic);
        Misc=findViewById(R.id.tvMisc);
        btn=findViewById(R.id.button2);

btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i;
        i = new Intent(AnotherActivity.this,MainActivity.class);
        startActivity(i);
    }
});

        Wapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ACTION_MAIN);
                startActivity(i);
            }
        });


        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_MAIN);
                startActivity(i);
            }
        });


        Utube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ACTION_MAIN);
                startActivity(i);
            }
        });


        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ACTION_MAIN);
                startActivity(i);
            }
        });

        Power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_POWER_USAGE_SUMMARY);
                startActivity(i);
            }
        });


        Music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ACTION_MAIN);
                startActivity(intent);

            }
        });

        Misc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ACTION_MAIN);
                startActivity(intent);

            }
        });
    }
}