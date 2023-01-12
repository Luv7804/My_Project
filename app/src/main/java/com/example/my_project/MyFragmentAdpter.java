package com.example.my_project;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyFragmentAdpter extends FragmentStateAdapter {
    public MyFragmentAdpter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new JanasiFragment();
        } else if (position == 1) {
            return new Sakbhaji_Fragment();
        } else {
            return new FalFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
