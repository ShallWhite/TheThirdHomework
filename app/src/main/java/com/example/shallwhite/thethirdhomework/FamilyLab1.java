package com.example.shallwhite.thethirdhomework;

import android.content.Context;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by lenovo on 2016/12/9.
 */

public class FamilyLab1 {
    private static FamilyLab1 sFamilyLab;
    private List<FamilyMember> mFamilyMembers;
    public static FamilyLab1 get(Context context){
        if (sFamilyLab == null){
            sFamilyLab = new FamilyLab1(context);
        }
        return sFamilyLab;
    }
    private FamilyLab1(Context context){
        mFamilyMembers = new ArrayList<>();
        for (int i = 1;i <= 100;i++){
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
