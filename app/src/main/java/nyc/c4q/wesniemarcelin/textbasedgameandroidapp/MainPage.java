package nyc.c4q.wesniemarcelin.textbasedgameandroidapp;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static nyc.c4q.wesniemarcelin.textbasedgameandroidapp.R.id.fragment_container_rules_layout;

public class MainPage extends AppCompatActivity {
    Button enter;
    Button rules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
        //playIntro();
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                final MediaPlayer scary_intro = MediaPlayer.create(getApplicationContext(), R.raw.scary_intro);
                scary_intro.start();
                scary_intro.setLooping(true);
            }
        });

        enter = (Button) findViewById(R.id.enter);
        rules = (Button) findViewById(R.id.rules);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), BeginGame.class);
                startActivity(intent);
                finish();

            }
        });


        rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), DisplayRules.class);
                startActivity(intent2);
                finish();

            }
        });
    }

//    public void displayRules(View v){
//        DisplayRules displayRules = new DisplayRules();
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
//                .replace(fragment_container_rules_layout,displayRules);
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
//    }

    void playIntro(){
//        AsyncTask.execute(new Runnable() {
//            @Override
//            public void run() {
//                final MediaPlayer scary_intro = MediaPlayer.create(getApplicationContext(), R.raw.scary_intro);
//                scary_intro.start();
//                scary_intro.setLooping(true);
//            }
//        });

    }
}
