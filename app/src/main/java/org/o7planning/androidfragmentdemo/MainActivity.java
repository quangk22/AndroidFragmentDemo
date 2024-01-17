package org.o7planning.androidfragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(String firstName, String lastName) {
        BottomFragment bottomFragment
                = (BottomFragment) this.getSupportFragmentManager()
                .findFragmentById(R.id.fragment_bottom);
        bottomFragment.showText(firstName, lastName);
    }
}