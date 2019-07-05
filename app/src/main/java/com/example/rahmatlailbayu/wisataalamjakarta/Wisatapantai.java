package com.example.rahmatlailbayu.wisataalamjakarta;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


/**
 * A simple {@link Fragment} subclass.
 */
public class Wisatapantai extends Fragment {
    private CardView btn_harapan, btn_ancol, btn_pari, btn_tidung, btn_pramuka, btn_sepa;


    public Wisatapantai() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ((navigationdrawer)getActivity()).setActionBarTitle("Wisata Pantai");


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_wisatapantai, container, false);
        ImageView ancol = (ImageView) view.findViewById(R.id.ancol1);
        Glide.with(this).load(R.drawable.ancol1).into(ancol);

        ImageView tidung = (ImageView) view.findViewById(R.id.tidung1);
        Glide.with(this).load(R.drawable.tidung1).into(tidung);

        ImageView harapan = (ImageView) view.findViewById(R.id.harapan1);
        Glide.with(this).load(R.drawable.harapan1).into(harapan);

        ImageView pari = (ImageView) view.findViewById(R.id.pari1);
        Glide.with(this).load(R.drawable.pari1).into(pari);

        ImageView sepa = (ImageView) view.findViewById(R.id.sepa1);
        Glide.with(this).load(R.drawable.sepa1).into(sepa);

        ImageView pramuka = (ImageView) view.findViewById(R.id.pramuka1);
        Glide.with(this).load(R.drawable.pramuka1).into(pramuka);


        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn_harapan = (CardView) view.findViewById(R.id.harapan);
        btn_harapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), harapan.class);
                getActivity().startActivity(intent);
            }

        });

        btn_ancol = (CardView) view.findViewById(R.id.ancol);
        btn_ancol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ancol.class);
                getActivity().startActivity(intent);
            }

        });

        btn_pari = (CardView) view.findViewById(R.id.pari);
        btn_pari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), pari.class);
                getActivity().startActivity(intent);
            }

        });

        btn_tidung = (CardView) view.findViewById(R.id.tidung);
        btn_tidung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), tidung.class);
                getActivity().startActivity(intent);
            }

        });

        btn_pramuka = (CardView) view.findViewById(R.id.pramuka);
        btn_pramuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), pramuka.class);
                getActivity().startActivity(intent);
            }

        });

        btn_sepa = (CardView) view.findViewById(R.id.sepa);
        btn_sepa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), sepa.class);
                getActivity().startActivity(intent);
            }

        });

    }
}
