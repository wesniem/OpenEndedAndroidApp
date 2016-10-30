package nyc.c4q.wesniemarcelin.textbasedgameandroidapp;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by wesniemarcelin on 10/27/16.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {
    private final View mView;
    private final ImageView mRewardPicture;
    private final TextView mRewardName;

    public MyViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        mView = itemView;
        mRewardPicture = (ImageView) mView.findViewById(R.id.employee_image);
        mRewardName = (TextView) mView.findViewById(R.id.employee_name);
    }

    /*
    Advanced question: Do you know why this function must be static???
     */
    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.reward_view_holder, parent, false);
    }

    public void bind(RewardDescription rewardDescription) {
        mRewardName.setText(rewardDescription.getmRewardName());
        Integer resource = rewardDescription.getmImage();
        if (resource != null){
            mRewardPicture.setImageResource(resource);
        }
    }


    public TextView getName(){
        return mRewardName;
    }

    public void setOnClickListener(View.OnClickListener clickListener){
        mView.setOnClickListener(clickListener);
    }
}
