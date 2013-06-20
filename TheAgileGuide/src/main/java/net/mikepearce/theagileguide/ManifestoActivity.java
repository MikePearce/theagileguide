package net.mikepearce.theagileguide;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;

import net.mikepearce.theagileguide.fragment.TabFragment;
import net.mikepearce.theagileguide.utils.RobotoTextView;

import static net.mikepearce.theagileguide.R.menu.main;

public class ManifestoActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_manifesto);
        // Grab the instance of TabFragment that was included with the layout and have it
        // launch the initial tab.
        FragmentManager fm = getSupportFragmentManager();
        TabFragment tabFragment = (TabFragment) fm.findFragmentById(R.id.fragment_tab);
        tabFragment.gotoValueView();

        // Set the default highlight
        RobotoTextView v = (RobotoTextView) this.findViewById(R.id.value_view_tab);
        v.setBackgroundResource(R.color.grey);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(main, menu);
        return true;
    }



}
