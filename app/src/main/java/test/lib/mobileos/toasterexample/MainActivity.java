package test.lib.mobileos.toasterexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import test.lib.mobileos.toastlibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToasterMessage.s(getApplicationContext(),"Hello from Library!");
    }
}