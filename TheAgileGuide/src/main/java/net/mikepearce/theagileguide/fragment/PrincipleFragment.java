package net.mikepearce.theagileguide.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.mikepearce.theagileguide.R;

public class PrincipleFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate view
        View view = inflater.inflate(R.layout.fragment_principle, container, false);

        // Get the iD
        Activity a = getActivity();
        Bundle b = a.getIntent().getExtras();
        Integer princ_id = b.getInt("princ_id");

        // Get the views
        TextView principleFull = (TextView) view.findViewById(R.id.principle_full);
        TextView principleDesc = (TextView) view.findViewById(R.id.principle_desc);

        // Grab the string data
        String[] long_principles = getResources().getStringArray(R.array.long_principles);
        String[] desc_principles = getResources().getStringArray(R.array.desc_principles);

        // Populate the views
        principleFull.setText(long_principles[princ_id]);
        principleDesc.setText(desc_principles[princ_id]);

        return view;
    }





}