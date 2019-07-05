package com.example.rahmatlailbayu.wisataalamjakarta;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // marker taman
        LatLng mangrove = new LatLng(-6.105227, 106.735574);
        mMap.addMarker(new MarkerOptions().position(mangrove).title("Taman Wisata Alam Mangrove,Angke Kapuk"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mangrove,9));

        LatLng babakan = new LatLng(-6.341325, 106.823803);
        mMap.addMarker(new MarkerOptions().position(babakan).title("Taman Wisata Setu Babakan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(babakan,9));

        LatLng ragunan = new LatLng(-6.312180, 106.825640);
        mMap.addMarker(new MarkerOptions().position(ragunan).title("Taman Margasatwa Ragunan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ragunan,9));

        LatLng ecopark = new LatLng(-6.125792, 106.836322);
        mMap.addMarker(new MarkerOptions().position(ecopark).title("Taman Allianz Ecopark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ecopark,9));

        LatLng tmii = new LatLng(-6.302382, 106.895177);
        mMap.addMarker(new MarkerOptions().position(tmii).title("Taman Mini Indonesia Indah"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tmii,9));

        LatLng menteng = new LatLng(-6.195977, 106.829646);
        mMap.addMarker(new MarkerOptions().position(menteng).title("Taman Menteng"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(menteng,9));

        //marker pantai

        final LatLng ancol = new LatLng(-6.120376, 106.847535);
        mMap.addMarker(new MarkerOptions().position(ancol).title("Pantai Ancol"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ancol,9));

        LatLng harapan = new LatLng(-5.653855, 106.568573);
        mMap.addMarker(new MarkerOptions().position(harapan).title("Pulau Harapan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(harapan,9));

        LatLng pari = new LatLng(-5.857490, 106.618052);
        mMap.addMarker(new MarkerOptions().position(pari).title("Pulau Pari"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pari,9));

        LatLng tidung = new LatLng(-5.794365, 106.483417);
        mMap.addMarker(new MarkerOptions().position(tidung).title("Pulau Tidung"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tidung,9));

        LatLng pramuka = new LatLng(-5.745789, 106.614297);
        mMap.addMarker(new MarkerOptions().position(pramuka).title("Pulau Pramuka"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pramuka,9));

        LatLng sepa = new LatLng(-5.576128, 106.581614);
        mMap.addMarker(new MarkerOptions().position(sepa).title("Pulau Sepa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sepa,9));

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                if (marker.getTitle().equals("Pantai Ancol")) {
                    Intent ancol1 = new Intent(MapsActivity.this, ancol.class);
                    startActivity(ancol1);
                } else if (marker.getTitle().equals("Taman Menteng")) {
                    Intent menteng1 = new Intent(MapsActivity.this, menteng.class);
                    startActivity(menteng1);

                } else if (marker.getTitle().equals("Taman Wisata Alam Mangrove,Angke Kapuk")) {
                    Intent mangrove1 = new Intent(MapsActivity.this, mangrove.class);
                    startActivity(mangrove1);

                } else if (marker.getTitle().equals("Taman Wisata Setu Babakan")) {
                    Intent babakan1 = new Intent(MapsActivity.this, babakan.class);
                    startActivity(babakan1);

                } else if (marker.getTitle().equals("Taman Margasatwa Ragunan")) {
                    Intent ragunan1 = new Intent(MapsActivity.this, ragunan.class);
                    startActivity(ragunan1);

                } else if (marker.getTitle().equals("Taman Allianz Ecopark")) {
                    Intent ecopark1 = new Intent(MapsActivity.this, ecopark.class);
                    startActivity(ecopark1);

                } else if (marker.getTitle().equals("Taman Mini Indonesia Indah")) {
                    Intent mini1 = new Intent(MapsActivity.this, tmii.class);
                    startActivity(mini1);

                } else if (marker.getTitle().equals("Pulau Harapan")) {
                    Intent harapan1 = new Intent(MapsActivity.this, harapan.class);
                    startActivity(harapan1);

                } else if (marker.getTitle().equals("Pulau Pari")) {
                    Intent pari1 = new Intent(MapsActivity.this, pari.class);
                    startActivity(pari1);

                } else if (marker.getTitle().equals("Pulau Tidung")) {
                    Intent tidung1 = new Intent(MapsActivity.this,tidung.class);
                    startActivity(tidung1);

                } else if (marker.getTitle().equals("Pulau Pramuka")) {
                    Intent pramuka1 = new Intent(MapsActivity.this, pramuka.class);
                    startActivity(pramuka1);

                } else if (marker.getTitle().equals("Pulau Sepa")) {
                    Intent sepa1 = new Intent(MapsActivity.this, sepa.class);
                    startActivity(sepa1);
                }
                return false;
            }
        });








    }
}
