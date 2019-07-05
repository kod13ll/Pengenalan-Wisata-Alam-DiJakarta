package com.example.rahmatlailbayu.wisataalamjakarta;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.DocumentsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {
    private CardView btn_lokasi;
    private Boolean exit = false;


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((navigationdrawer) getActivity()).setActionBarTitle("Home");
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_home, container, false);

        CardView btn_taman = (CardView) rootview.findViewById(R.id.wisata_taman12);
        CardView btn_pantai = (CardView) rootview.findViewById(R.id.wisata_pantai12);
        CardView btn_lokasi = (CardView) rootview.findViewById(R.id.peta_lokasi12);
        CardView btn_tentang = (CardView) rootview.findViewById(R.id.tentang_aplikasi12);


        btn_taman.setOnClickListener(this);
        btn_pantai.setOnClickListener(this);
        btn_lokasi.setOnClickListener(this);
        btn_tentang.setOnClickListener(this);


        // /Gambarnya
        ImageView pantai = (ImageView) rootview.findViewById(R.id.wisata_pantai1);
        Glide.with(this).load(R.drawable.tidung1).into(pantai);

        ImageView taman = (ImageView) rootview.findViewById(R.id.wisatataman1);
        Glide.with(this).load(R.drawable.mini1).into(taman);

        ImageView peta = (ImageView) rootview.findViewById(R.id.peta_lokasi1);
        Glide.with(this).load(R.drawable.peta1).into(peta);

        ImageView tentang = (ImageView) rootview.findViewById(R.id.tentang_aplikasi1);
        Glide.with(this).load(R.drawable.profile1).into(tentang);


        return rootview;

    }

    @Override
    public void onClick(View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.wisata_pantai12:
                fragment = new Wisatapantai();
                replaceFragment(fragment);
                break;

            case R.id.wisata_taman12:
                fragment = new Wisatataman();
                replaceFragment(fragment);
                break;

            case R.id.tentang_aplikasi12:
                fragment = new Tentangaplikasi();
                replaceFragment(fragment);
                break;
        }
    }

    public void replaceFragment(Fragment someFragment) {
        android.support.v4.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.framelayout, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn_lokasi = (CardView) view.findViewById(R.id.peta_lokasi12);
        btn_lokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MapsActivity.class);
                getActivity().startActivity(intent);
            }

        });
    }
        }
