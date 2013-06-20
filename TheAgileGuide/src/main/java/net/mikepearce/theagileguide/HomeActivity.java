package net.mikepearce.theagileguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.mikepearce.theagileguide.utils.AndroidUtils;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Set body font (for whole page)
        AndroidUtils.setRobotoFont(this, (ViewGroup) this.getWindow().getDecorView(), "Thin");

        TextView tv = (TextView) findViewById(R.id.title_manifesto);
        AndroidUtils.setRobotoFont(this, tv, "Thin");

        TextView tv2 = (TextView) findViewById(R.id.title_manifesto_the);
        AndroidUtils.setRobotoFont(this, tv2, "ThinItalic");

    }

    public void viewManifesto(View view) {
        Intent intent = new Intent(this, ManifestoActivity.class);
        startActivity(intent);
    }

    public void viewScrum(View view) {
        Intent intent = new Intent(this, ComingsoonActivity.class);
        startActivity(intent);
    }

    public void viewKanban(View view) {
        Intent intent = new Intent(this, ComingsoonActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
