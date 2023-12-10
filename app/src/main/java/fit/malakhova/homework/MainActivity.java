package fit.malakhova.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button countButton;
    Button showToastButton;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("INFO", "OnCreate method - MAIN ACTIVITY");
        setContentView(R.layout.activity_main);

        countButton = findViewById(R.id.count_button);
        showToastButton = findViewById(R.id.show_toast_button);
        countButton.setOnClickListener(view -> count++);

        showToastButton.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Current counter value = " + count, Toast.LENGTH_LONG).show());
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