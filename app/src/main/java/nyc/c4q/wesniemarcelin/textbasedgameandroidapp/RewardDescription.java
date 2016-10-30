package nyc.c4q.wesniemarcelin.textbasedgameandroidapp;

import android.support.annotation.DrawableRes;

/**
 * Created by wesniemarcelin on 10/27/16.
 */

public class RewardDescription {
    public final String mRewardName;
    private final Integer mImage;

    public RewardDescription(String name){
        mRewardName = name;
        mImage = R.drawable.blank_reward;
    }

    public RewardDescription(String name, @DrawableRes Integer resource){
        mRewardName = name;
        mImage = resource;
    }

    public String getmRewardName() {
        return mRewardName;
    }

    public Integer getmImage() {
        return mImage;
    }

//    public String getName(){
//        return mRewardName;
//    }
//
//    public Integer getImageResource(){
//        return mImage;
//    }
}
