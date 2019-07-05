package com.example.rahmatlailbayu.wisataalamjakarta;


import android.content.Intent;
import android.media.Image;
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
public class Wisatataman extends Fragment {
    private CardView btn_babakan,btn_mangrove,btn_menteng,btn_ragunan,btn_mini,btn_ecopark;


    public Wisatataman() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ((navigationdrawer)getActivity()).setActionBarTitle("Wisata Taman");
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_wisata_taman, container, false);


        ImageView babakan = (ImageView)view.findViewById(R.id.babakan1);
        Glide.with(this).load(R.drawable.babakan1).into(babakan);

        ImageView mangrove = (ImageView) view.findViewById(R.id.mangrove1);
        Glide.with(this).load(R.drawable.mangrove1).into(mangrove);

        ImageView menteng = (ImageView) view.findViewById(R.id.menteng1);
        Glide.with(this).load(R.drawable.menteng1).into(menteng);

        ImageView ragunan = (ImageView) view.findViewById(R.id.ragunan1);
        Glide.with(this).load(R.drawable.ragunan1).into(ragunan);

        ImageView tmii = (ImageView) view.findViewById(R.id.mini1);
        Glide.with(this).load(R.drawable.mini1).into(tmii);

        ImageView ecopark = (ImageView) view.findViewById(R.id.ecopark1);
        Glide.with(this).load(R.drawable.ecopark1).into(ecopark);


    return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn_babakan = (CardView) view.findViewById(R.id.babakan);
        btn_babakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), babakan.class);
                getActivity().startActivity(intent);
            }

        });

        btn_mangrove = (CardView) view.findViewById(R.id.mangrove);
        btn_mangrove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), mangrove.class);
                getActivity().startActivity(intent);
            }

        });

        btn_menteng = (CardView) view.findViewById(R.id.menteng);
        btn_menteng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), menteng.class);
                getActivity().startActivity(intent);
            }

        });

        btn_ragunan = (CardView) view.findViewById(R.id.ragunan);
        btn_ragunan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ragunan.class);
                getActivity().startActivity(intent);
            }

        });

        btn_mini = (CardView) view.findViewById(R.id.mini);
        btn_mini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), tmii.class);
                getActivity().startActivity(intent);
            }

        });

        btn_ecopark = (CardView) view.findViewById(R.id.ecopark);
        btn_ecopark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ecopark.class);
                getActivity().startActivity(intent);
            }

        });
    }

}
