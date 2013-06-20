package net.mikepearce.theagileguide.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import net.mikepearce.theagileguide.R;
import net.mikepearce.theagileguide.ValueActivity;

public class ListManifestoFragment extends ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the adapter based on the string-array
        String[] principles = getResources().getStringArray(R.array.manifesto_values);
        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(), R.layout.list_values, principles )
        {
            // This replaces the getView from ArrayAdapter so we can use the XML.
            // However, the strings need to use &lt;br /&gt; instead of <br /> No idea why. Stupid.
            @Override
            public View getView(int position, View convertView, ViewGroup parent)
            {
                View row;
                if (null == convertView) {
                    row = getActivity().getLayoutInflater().inflate(R.layout.list_values, null);
                } else {
                    row = convertView;
                }

                TextView tv = (TextView) row.findViewById(R.id.list_value_tv);
                tv.setText(Html.fromHtml(getItem(position)));

                return row;
            }

        };

        setListAdapter(adapter);

        // Get the list view
        final ListView listView = getListView();
        listView.setTextFilterEnabled(true);

        // When clicked, pass to new Activity with the position as a parameter
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Activity a = getActivity();
                Intent intent = new Intent(view.getContext(), ValueActivity.class);
                intent.putExtra("value_id", position);
                startActivity(intent);
                a.overridePendingTransition(0,0);
            }
        });

    }

}