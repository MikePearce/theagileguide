package net.mikepearce.theagileguide.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.mikepearce.theagileguide.R;

public class ValueFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate view
        View view = inflater.inflate(R.layout.fragment_value, container, false);

        // Get the iD
        Activity a = getActivity();
        Bundle b = a.getIntent().getExtras();
        Integer val_id = b.getInt("value_id");

        // Get the views
        TextView valueFull = (TextView) view.findViewById(R.id.value_full);
        TextView valueDesc = (TextView) view.findViewById(R.id.value_desc);

        // Grab the string data
        String[] values = getResources().getStringArray(R.array.manifesto_values);
        String[] desc_values = getResources().getStringArray(R.array.desc_values);

        //Populate the views
        valueFull.setText(Html.fromHtml(values[val_id]));
        valueDesc.setText(Html.fromHtml(desc_values[val_id]));

        return view;
    }





}