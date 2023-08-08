package com.example.todoapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.todoapp.fragment.CreateWorkFragment;
import com.example.todoapp.fragment.WorkFragment;
import com.example.todoapp.fragment.WorkSharedFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new WorkFragment();
            case 1:
                return new WorkSharedFragment();
            case 2:
                return new CreateWorkFragment();
            default:
                return null;

        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
