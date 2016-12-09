package com.example.shallwhite.thethirdhomework;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by lenovo on 2016/12/10.
 */

public class FamilyLab2 {
    private static FamilyLab2 sFamilyLab;
    private List<FamilyMember> mFamilyMembers;
    public static FamilyLab2 get(Context context){
        if (sFamilyLab == null){
            sFamilyLab = new FamilyLab2(context);
        }
        return sFamilyLab;
    }
    private FamilyLab2(Context context){
        mFamilyMembers = new ArrayList<>();
        for (int i = 100;i >= 1;i--){
            FamilyMember familyMember = new FamilyMember();
            familyMember.setName("亲戚" + i);
            mFamilyMembers.add(familyMember);
        }
    }
    public List<FamilyMember> getFamilyMembers(){
        return mFamilyMembers;
    }
    public FamilyMember getFamilyMember(UUID uuid){
        for (FamilyMember familymember : mFamilyMembers) {
            if (familymember.getId().equals(uuid)) {
                return familymember;
            }
        }
        return null;
    }
}
