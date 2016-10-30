package nyc.c4q.wesniemarcelin.textbasedgameandroidapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class DisplayRewardActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reward_list);
        mRecyclerView = (RecyclerView) findViewById(R.id.rewardList);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        mRecyclerView.setAdapter(new RewardListAdapter());

        final MediaPlayer begincheer = MediaPlayer.create(this, R.raw.applause);
        begincheer.start();
        begincheer.setLooping(true);

    }
}
