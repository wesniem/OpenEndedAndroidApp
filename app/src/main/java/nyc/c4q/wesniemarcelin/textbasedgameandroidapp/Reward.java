package nyc.c4q.wesniemarcelin.textbasedgameandroidapp;

/**
 * Created by wesniemarcelin on 10/28/16.
 */

public class Reward {
    String mrewardName;
    String mrewardPic;


    public Reward(String rewardName, String rewardPic){
        this.mrewardName = rewardName;
        this.mrewardPic = rewardPic;
    }
    public String getRewardName() {
        return mrewardName;
    }

    public void setRewardName(String rewardName) {
        this.mrewardName = rewardName;
    }

    public String getRewardPic() {
        return mrewardPic;
    }

    public void setRewardPic(String rewardPic) {
        this.mrewardPic = rewardPic;
    }
}
