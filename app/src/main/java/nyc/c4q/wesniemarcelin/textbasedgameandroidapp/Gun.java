package nyc.c4q.wesniemarcelin.textbasedgameandroidapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by wesniemarcelin on 10/29/16.
 */
public class Gun extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.gun_reward, container, false);
    }
}
