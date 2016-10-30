package nyc.c4q.wesniemarcelin.textbasedgameandroidapp;

import android.media.MediaPlayer;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


    public class LoseGame extends AppCompatActivity {
        ImageView image;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout_for_lost_game);

            image = (ImageView)findViewById(R.id.image321);

            final MediaPlayer zombieAtack = MediaPlayer.create(this, R.raw.zombie);
            zombieAtack.start();
            zombieAtack.setLooping(true);
        }
    }


