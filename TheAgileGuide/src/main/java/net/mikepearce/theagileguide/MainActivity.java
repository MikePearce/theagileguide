package net.mikepearce.theagileguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set title font
        TextView tv = (TextView) findViewById(R.id.intro_title_top);
        AndroidUtils.setRobotoFont(this, tv, "Thin");

        TextView tv2 = (TextView) findViewById(R.id.intro_title_center);
        AndroidUtils.setRobotoFont(this, tv2, "Regular");

        TextView tv3 = (TextView) findViewById(R.id.intro_title_start);
        AndroidUtils.setRobotoFont(this, tv3, "ThinItalic");
    }

    public void startGuide(View view) {
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
