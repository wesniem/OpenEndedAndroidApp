package nyc.c4q.wesniemarcelin.textbasedgameandroidapp;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageView;
import android.support.v4.app.FragmentActivity;

import static nyc.c4q.wesniemarcelin.textbasedgameandroidapp.R.id.fragment_container;
import static nyc.c4q.wesniemarcelin.textbasedgameandroidapp.R.id.fragment_container_lost_game;
import static nyc.c4q.wesniemarcelin.textbasedgameandroidapp.R.id.fragment_container_rules_layout;
import static nyc.c4q.wesniemarcelin.textbasedgameandroidapp.R.id.fragment_container_trophy;
public class BeginGame extends FragmentActivity {
    ImageView imageView1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_for_fragment);

        imageView1 = (ImageView) findViewById(R.id.image123);

        Question1Fragment question1Fragment = new Question1Fragment();
        //Inflate layout with this view
        getSupportFragmentManager().beginTransaction()
                .replace(fragment_container, question1Fragment).commit();




    }

    public void aClicked1(View v) {
        A1Clicked fragment = new A1Clicked();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                .replace(fragment_container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void bClicked1(View view){
        B1Clicked bClicked = new B1Clicked();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTranaction = fragmentManager.beginTransaction()
                .replace(fragment_container,bClicked);
        fragmentTranaction.addToBackStack(null);
        fragmentTranaction.commit();
    }

    public void cClicked(View v){
        C1Clicked cClicked = new C1Clicked();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction()
                .replace(fragment_container, cClicked);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


    public void a2Clicked(View v){
        A2Clicked a2Clicked = new A2Clicked();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                .replace(fragment_container,a2Clicked);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void b2Clicked(View v){
        B2Clicked b2Clicked = new B2Clicked();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                .replace(fragment_container,b2Clicked);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void c2Clicked(View v){
        C2Clicked c2Clicked = new C2Clicked();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                .replace(fragment_container,c2Clicked);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void a3Clicked(View v){
        A3Clicked a3Clicked = new A3Clicked();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                .replace(fragment_container,a3Clicked);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void b3Clicked(View v){
        B3Clicked b3Clicked = new B3Clicked();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                .replace(fragment_container,b3Clicked);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


    public void c3Clicked(View v){
        C3Clicked c3Clicked = new C3Clicked();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                .replace(fragment_container,c3Clicked);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void a4Clicked(View v){
        A4Clicked a4Clicked = new A4Clicked();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                .replace(fragment_container,a4Clicked);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void b4Clicked(View v){
        B4Clicked b4Clicked = new B4Clicked();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                .replace(fragment_container,b4Clicked);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


    public void anotherRound(View v){
        A2Clicked a2Clicked = new A2Clicked();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                .replace(fragment_container,a2Clicked);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void trophySelection(View v){
//        final MediaPlayer begincheer = MediaPlayer.create(this, R.raw.applause);
//        begincheer.start();
//        begincheer.setLooping(true);
        TrophySelection trophySelection = new TrophySelection();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                .replace(fragment_container,trophySelection);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
//        Intent intent = new Intent(getApplicationContext(), TrophySelection.class);
//        startActivity(intent);
    }

    public void lostGame(View v){

        Intent intent = new Intent(this, LoseGame.class);
        startActivity(intent);
//        LoseGame lostGamee = new LoseGame();
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
//                .replace(fragment_container_lost_game,lostGamee);
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
    }

    public void beginNewGame(View v){
        Intent intent = new Intent(getApplicationContext(),BeginGame.class);
        startActivity(intent);
        finish();
    }


    public void displayRules(View v){
        Intent intent = new Intent(v.getContext(), DisplayRules.class);
        startActivity(intent);
        finish();
//        DisplayRules displayRules = new DisplayRules();
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
//                .replace(fragment_container_rules_layout,displayRules);
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
    }
    public void chooseReward(View v){
       Intent intent = new Intent(getApplicationContext(),DisplayRewardActivity.class);
        startActivity(intent);
    }
}

