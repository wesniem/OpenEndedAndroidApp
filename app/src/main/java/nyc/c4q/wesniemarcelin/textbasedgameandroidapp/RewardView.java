package nyc.c4q.wesniemarcelin.textbasedgameandroidapp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by wesniemarcelin on 10/27/16.
 */

public class RewardView extends AppCompatActivity {
    public static final String REWARD_NAME = "extra.employee.name";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reward_view);
        String employee = getIntent().getStringExtra(REWARD_NAME);
        if (employee != null) {
            switch (employee) {
                case "Trophy":
                    showTrophy();
                    break;
                case "Grenade":
                    showGrenade();
                    break;
                case "Star":
                    showStar();
                    break;
                case "Knife":
                    showKnife();
                    break;
                case "Bat":
                    showBat();
                    break;
                case "Iron Bar":
                    showIronBar();
                    break;
                case "Medal":
                    showMedal();
                    break;
                case "Gun":
                    showGun();
                    break;
                case "Spear":
                    showSpear();
                    break;
                default:
                    break;
            }
        }
    }

    private void showKnife() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container_glitter, new Knife());
        fragmentTransaction.commit();
    }

    private void showBat() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container_glitter, new Bat());
        fragmentTransaction.commit();
    }

    private void showIronBar() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container_glitter, new IronBar());
        fragmentTransaction.commit();
    }

    private void showMedal() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container_glitter, new Medal());
        fragmentTransaction.commit();
    }

    private void showGun() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container_glitter, new Gun());
        fragmentTransaction.commit();
    }

    private void showSpear() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container_glitter, new Spear());
        fragmentTransaction.commit();
    }

    private void showMoneyBag() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container_glitter, new MoneyBag());
        fragmentTransaction.commit();
    }

    private void showTrophy() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container_glitter, new Trophy());
        fragmentTransaction.commit();
    }


    private void showGrenade() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container_glitter, new Grenade());
        fragmentTransaction.commit();
    }

    private void showStar() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container_glitter, new Star());
        fragmentTransaction.commit();
    }
}
