package test.lib.mobileos.toasterexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import test.lib.mobileos.toastlibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {
    Button btnOpenLibActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToasterMessage.s(getApplicationContext(),"Hello from Library!");

        btnOpenLibActivity=findViewById(R.id.btnOpenLibActivity);
        btnOpenLibActivity.setOnClickListener(view -> {
            Intent intent = null;
            try {
                intent = new Intent(this,
                        Class.forName("test.lib.mobileos.toastlibrary.TestActivity"));
                startActivity(intent);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            /*Toast.makeText(getApplicationContext(),"Clicked!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent();
            intent.setClassName(this.getPackageName(), "test.lib.mobileos.toastlibrary.TestActivity");
            startActivity(intent);*/
        });
    }
}