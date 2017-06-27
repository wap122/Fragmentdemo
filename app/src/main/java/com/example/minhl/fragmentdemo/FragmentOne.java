package com.example.minhl.fragmentdemo;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by minhl on 22/06/2017.
 */

public class FragmentOne extends Fragment {
    MainActivity mainActivity;
    private OnCustomListenner onCustomListenner;

    @Override
    public void onStart() {
        super.onStart();
        mainActivity = (MainActivity) getActivity();
        Toast.makeText(mainActivity, "Khoi tao Fragment", Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        Button button = (Button) view.findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCustomEvent(mainActivity);
            }
        });
        return view;
    }

    private void setCustomEvent(OnCustomListenner onCustomListenner) {
        this.onCustomListenner = onCustomListenner;
        onCustomListenner.onEvent();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(mainActivity, "Xoa Fragment", Toast.LENGTH_SHORT).show();
    }
}
