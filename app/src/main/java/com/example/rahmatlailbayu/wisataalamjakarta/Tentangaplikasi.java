package com.example.rahmatlailbayu.wisataalamjakarta;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tentangaplikasi extends Fragment {
    private Button btn_tentangpembuat;


    public Tentangaplikasi() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((navigationdrawer)getActivity()).setActionBarTitle("Tentang Aplikasi");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tentangaplikasi, container, false);


    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn_tentangpembuat = (Button) view.findViewById(R.id.button1);
        btn_tentangpembuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), tentangpembuat.class);
                getActivity().startActivity(intent);
            }

        });
    }
}
