package com.example.shallwhite.thethirdhomework;

import java.util.UUID;

/**
 * Created by lenovo on 2016/12/10.
 */

public class FamilyMember {
    private UUID mId;
    private String mName;

    public FamilyMember(){
        mId = UUID.randomUUID();
    }
    public UUID getId(){
        return mId;
    }
    public String getName(){
        return mName;
    }
    public void setName(String name){
        mName = name;
    }
}
