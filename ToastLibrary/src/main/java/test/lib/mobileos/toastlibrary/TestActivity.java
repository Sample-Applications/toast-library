package test.lib.mobileos.toastlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestActivity extends AppCompatActivity {
    Button btnNextLibActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        btnNextLibActivity=findViewById(R.id.btnNextLibActivity);
        btnNextLibActivity.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), TestActivity2.class);
            startActivity(intent);
        });
    }
}