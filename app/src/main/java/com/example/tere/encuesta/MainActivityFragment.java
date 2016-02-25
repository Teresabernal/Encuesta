package com.example.tere.encuesta;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    public void Boton(View view) {

        if (view.getId() == R.id.button) {
            Toast.makeText(this, "Aceptaste", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Ganó", Toast.LENGTH_SHORT).show();
        }
    }
}

