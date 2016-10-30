package nyc.c4q.wesniemarcelin.textbasedgameandroidapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import static nyc.c4q.wesniemarcelin.textbasedgameandroidapp.R.id.fragment_container_rules_layout;

/**
 * Created by wesniemarcelin on 10/29/16.
 */

public class DisplayRules extends FragmentActivity {
    ImageView image;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_for_rules);
        image = (ImageView) findViewById(R.id.rules_image);
        Rules rules = new Rules();
        //Inflate layout with this view
        getSupportFragmentManager().beginTransaction()
                .replace(fragment_container_rules_layout, rules).commit();

    }
}
