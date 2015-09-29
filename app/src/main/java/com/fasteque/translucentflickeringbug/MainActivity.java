package com.fasteque.translucentflickeringbug;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent userActivity = new Intent(new Intent(MainActivity.this, UserActivity.class));
                userActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(userActivity);

                Intent translucentActivity = new Intent(MainActivity.this, TranslucentActivity.class);
                translucentActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(translucentActivity);

                finish();
            }
        });
    }
}
