package com.example.user.android_class_27;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class F2 extends Fragment {
    private TextView mesg;
    private String strMesg;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_f2, container, false);
        mesg = (TextView)view.findViewById(R.id.f2mesg);
        if (strMesg != null){
            mesg.setText(strMesg);
        }
        return view;


    }
    public void chanegF2Mesg(String newmesg){
        strMesg = newmesg;
    }
}
