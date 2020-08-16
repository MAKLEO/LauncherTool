package manish.khullar.launchertool;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView browser, phone, sms, camera, Clock, Email,calculator;
Button btn;
Notification nMN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // showNotification();

        browser = findViewById(R.id.tvBrowser);
        phone = findViewById(R.id.tVPhone);
        sms = findViewById(R.id.tVSMS);
        camera = findViewById(R.id.tVCamera);
        Email = findViewById(R.id.tvEmail);
        Clock=findViewById(R.id.tvClock);
        calculator=findViewById(R.id.tvCalculator);
        btn=findViewById(R.id.button);
        final String url = "https://www.google.com";


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(MainActivity.this,AnotherActivity.class);
                startActivity(i);
            }
        });


        browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebPage(url);
            }
        });


        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                startActivity(i);
            }
        });


        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_MAIN);
                startActivity(i);
            }
        });


        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_MAIN);
                startActivity(i);
            }
        });

        Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_MAIN);
                startActivity(i);
            }
        });


        Clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                startActivity(intent);

            }
        });

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                startActivity(intent);

            }
        });
    }

    @SuppressLint("ServiceCast")
    private void showNotification() {
        nMN = (Notification) getSystemService(NOTIFICATION_SERVICE);
        Notification n  = new Notification.Builder(this)
                .setContentTitle("Launcher Tool")
                .setContentText("Keep this always ON. Touch to go to the LAUNCHER APP DIRECTLY")
                .setOngoing(true)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .build();
      //  nMN.notify(NOTIFICATION_SERVICE);

    }

    private void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            webpage = Uri.parse("http://" + url);
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}