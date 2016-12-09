package com.example.shallwhite.thethirdhomework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lenovo on 2016/12/9.
 */

public class SecondFragment extends Fragment {
    private FamilyMember mFamilyMember;
    private RecyclerView mFamilyRecyclerView;
    private FamilyAdapter mAdapter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mFamilyMember = new FamilyMember();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second,container,false);
        mFamilyRecyclerView = (RecyclerView)view.findViewById(R.id.family_recycler_view2);
        mFamilyRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();
        return view;
    }
    private void updateUI(){
        FamilyLab2 familyLab = FamilyLab2.get(getActivity());
        List<FamilyMember> familyMembers = familyLab.getFamilyMembers();

        mAdapter = new FamilyAdapter(familyMembers);
        mFamilyRecyclerView.setAdapter(mAdapter);
    }
    private class FamilyHolder extends RecyclerView.ViewHolder{
        public TextView mFamilyTextView;
        public FamilyHolder(View itemview){
            super(itemview);
            mFamilyTextView = (TextView)itemview;
        }
    }
    private class FamilyAdapter extends RecyclerView.Adapter<FamilyHolder>{
        private List<FamilyMember> mFamilyMembers;
        public FamilyAdapter(List<FamilyMember> familyMembers){
            mFamilyMembers = familyMembers;
        }

        @Override
        public FamilyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(android.R.layout.simple_list_item_1,parent,false);
            return new FamilyHolder(view);
        }

        @Override
        public void onBindViewHolder(FamilyHolder holder, int position) {
            FamilyMember familyMember = mFamilyMembers.get(position);
            holder.mFamilyTextView.setText(familyMember.getName());
        }

        @Override
        public int getItemCount() {
            return mFamilyMembers.size();
        }
    }
}
