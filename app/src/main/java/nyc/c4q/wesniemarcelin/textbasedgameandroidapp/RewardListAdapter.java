package nyc.c4q.wesniemarcelin.textbasedgameandroidapp;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.List;


/**
 * Created by wesniemarcelin on 10/27/16.
 */

public class RewardListAdapter extends RecyclerView.Adapter {
    private List<RewardDescription> mData = Arrays.asList(
            new RewardDescription("Trophy", R.drawable.trophy_reward),
            new RewardDescription("Grenade", R.drawable.grenade),
            new RewardDescription("Star", R.drawable.star),
            new RewardDescription("Medal", R.drawable.trophy),
            new RewardDescription("Gun",R.drawable.weapon4),
            new RewardDescription("Spear", R.drawable.weapon6),
            new RewardDescription("Iron Bar", R.drawable.weapon7),
            new RewardDescription("Bat", R.drawable.weapon8),
            new RewardDescription("Knife", R.drawable.weaponnn)
    );

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder viewHolder = (MyViewHolder) holder;
        RewardDescription reward = mData.get(position);
        viewHolder.bind(reward);
        viewHolder.setOnClickListener(buildEmployeeClickListener(reward));
    }

    private View.OnClickListener buildEmployeeClickListener(RewardDescription employee) {
        if (employee != null) {
            return navigateToEmployeeViewListener(employee.getmRewardName());
        }
        return defaultClickListener();
    }

    /**
     * This click listener launches an intent with the employee name as an extra
     *
     * @param name
     * @return
     */
    private View.OnClickListener navigateToEmployeeViewListener(final String name) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RewardView.class);
                intent.putExtra(RewardView.REWARD_NAME, name);
                view.getContext().startActivity(intent);


            }
        };
    }

    private View.OnClickListener defaultClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Do Nothing
            }
        };
    }
    @Override
    public int getItemCount() {
        return mData.size();
    }
}