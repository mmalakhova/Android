package fit.malakhova.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

public class ListActivity extends AppCompatActivity {

    private ImageButton cat1;
    private ImageButton cat2;
    private ImageButton cat3;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("INFO", "OnCreate method - LIST VIEW");
        setContentView(R.layout.activity_list);

        cat1 = findViewById(R.id.image_button_cat1);
        cat1.setOnClickListener(view -> {
            Intent intent = new Intent(ListActivity.this, WebPageActivity.class);
            startActivity(intent);
        });

        cat2 = findViewById(R.id.image_button_cat2);
        cat2.setOnClickListener(view -> {
            Intent intent = new Intent(ListActivity.this, WebPageActivity.class);
            startActivity(intent);
        });

        cat3 = findViewById(R.id.image_button_cat3);
        cat3.setOnClickListener(view -> {
            Intent intent = new Intent(ListActivity.this, WebPageActivity.class);
            startActivity(intent);
        });

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.cats_array, android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("INFO", "OnStart method - LIST ACTIVITY");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("INFO", "OnResume method - LIST ACTIVITY");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("INFO", "OnPause method - LIST ACTIVITY");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("INFO", "OnStop method - LIST ACTIVITY");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("INFO", "OnDestroy method - LIST ACTIVITY");
    }
}