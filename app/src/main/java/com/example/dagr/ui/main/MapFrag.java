package com.example.dagr.ui.main;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dagr.R;

public class MapFrag extends Fragment {
    View myView;

    public MapFrag(){ }

    public static MapFrag newInstance() {
        MapFrag fragment = new MapFrag();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
////        // Get a handle to the fragment and register the callback.
////        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
////                .findFragmentById(R.id.map);
////        mapFragment.getMapAsync(this);
//
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
//        if(myView == null){
//            myView = inflater.inflate(R.layout.map_fragment, container, false);
//        } else {
//            ((ViewGroup) container.getParent()).removeView(myView);
//        }
        View view = inflater.inflate(R.layout.fragment_map, container, false);

//        ((SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map)).getMapAsync(this);
        return view;
    }


    // Get a handle to the GoogleMap object and display marker.
//    @Override
//    public void onMapReady(GoogleMap googleMap) {
//        googleMap.addMarker(new MarkerOptions()
//                .position(new LatLng(0, 0))
//                .title("Marker"));
//
//        //add map click listener.
//        googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
//
//            @Override
//            public void onMapClick(LatLng point) {
//
//                Toast.makeText(getActivity().getApplicationContext(), "Lat: " + point.latitude+ " Long:" +point.longitude,  Toast.LENGTH_SHORT).show();
//            }
//
//        });
//    }
}

