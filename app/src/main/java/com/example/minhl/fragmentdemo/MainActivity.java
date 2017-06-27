package com.example.minhl.fragmentdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnCustomListenner{
    Fragment fr;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fr = new FragmentOne();
    }

    public void selectFrag(View view) {
        getFragmentManager().beginTransaction().add(R.id.framelayout, fr).commit();

    }

    public void deleteFragment(View view) {
        getFragmentManager().beginTransaction().remove(fr).commit();
    }

    @Override
    public void onEvent() {
        finish();
    }
}
