package net.mikepearce.theagileguide.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import net.mikepearce.theagileguide.PrincipleActivity;
import net.mikepearce.theagileguide.R;

public class ListShortprincipleFragment extends ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the adapter based on the string-array
        String[] principles = getResources().getStringArray(R.array.short_principles);
        setListAdapter(new ArrayAdapter<String>(getActivity(), R.layout.list_principles, principles ));

        // Get the list view
        final ListView listView = getListView();
        listView.setTextFilterEnabled(true);

        // When clicked, pass to new Activity with the position as a parameter
        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Activity a = getActivity();
                Intent intent = new Intent(view.getContext(), PrincipleActivity.class);
                intent.putExtra("princ_id", position);
                startActivity(intent);
                a.overridePendingTransition(0,0);
            }
        });

    }

}