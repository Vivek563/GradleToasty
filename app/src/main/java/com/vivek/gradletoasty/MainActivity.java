package com.vivek.gradletoasty;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showtoast(View view){

        switch (view.getId()){
            case R.id.errorButton:
                Toasty.error(MainActivity.this, "This is an error toast.", Toast.LENGTH_SHORT, true).show();
                break;

            case R.id.successButton:
                Toasty.success(MainActivity.this, "This is an success toast.", Toast.LENGTH_SHORT, true).show();
                break;

            case R.id.infobutton:
                Toasty.info(MainActivity.this, "This is an Info toast.", Toast.LENGTH_SHORT, true).show();
                break;

            case R.id.warningbutton:
                Toasty.warning(MainActivity.this, "This is a warning toast.", Toast.LENGTH_SHORT, true).show();
                break;

            case R.id.imageButton:
                Toasty.normal(MainActivity.this, "Image",
                                Toast.LENGTH_SHORT,
                        ContextCompat.getDrawable(MainActivity.this,R.drawable.ic_cloud))
                        .show();
                break;

        }

    }


}