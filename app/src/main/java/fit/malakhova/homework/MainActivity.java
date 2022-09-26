package fit.malakhova.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("INFO", "OnCreate method - MAIN ACTIVITY");
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button_1id);
        button1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ListActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("INFO", "OnStart method - MAIN ACTIVITY");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("INFO", "OnResume method - MAIN ACTIVITY");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("INFO", "OnPause method - MAIN ACTIVITY");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("INFO", "OnStop method - MAIN ACTIVITY");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("INFO", "OnDestroy method - MAIN ACTIVITY");
    }
}