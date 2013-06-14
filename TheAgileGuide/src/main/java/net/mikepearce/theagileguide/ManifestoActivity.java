package net.mikepearce.theagileguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

public class ManifestoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_manifesto);

        // Set body font (for whole page)
        AndroidUtils.setRobotoFont(this, (ViewGroup) this.getWindow().getDecorView(), "Thin");

        // Set title font
//        TextView tv = (TextView) findViewById(R.id.intro_title_top);
//        AndroidUtils.setRobotoFont(this, tv, "Thin");
    }

    public void startValue(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
