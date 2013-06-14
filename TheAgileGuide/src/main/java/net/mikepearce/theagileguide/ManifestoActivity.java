package net.mikepearce.theagileguide;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.ViewGroup;

import net.mikepearce.theagileguide.fragment.TabFragment;

import static net.mikepearce.theagileguide.R.menu.main;

public class ManifestoActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Notice how there is not very much code in the Activity. All the business logic for
        // rendering tab content and even the logic for switching between tabs has been pushed
        // into the Fragments. This is one example of how to organize your Activities with Fragments.
        // This benefit of this approach is that the Activity can be reorganized using layouts
        // for different devices and screen resolutions.
        setContentView(R.layout.activity_manifesto);

        // Set body font (for whole page)
        AndroidUtils.setRobotoFont(this, (ViewGroup) this.getWindow().getDecorView(), "Thin");

        // Grab the instance of TabFragment that was included with the layout and have it
        // launch the initial tab.
        FragmentManager fm = getSupportFragmentManager();
        TabFragment tabFragment = (TabFragment) fm.findFragmentById(R.id.fragment_tab);
        tabFragment.gotoValueView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(main, menu);
        return true;
    }



}
