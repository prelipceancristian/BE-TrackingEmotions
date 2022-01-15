package com.example.demo.Domain;

public class SocialEnvironment {
    int SocialEnvironmentID;
    String Relation;
    boolean IsLocation;

    public boolean isLocation() {
        return IsLocation;
    }

    public void setLocation(boolean location) {
        IsLocation = location;
    }

    public String getRelation() {
        return Relation;
    }

    public void setRelation(String relation) {
        Relation = relation;
    }

    public int getSocialEnvironmentID() {
        return SocialEnvironmentID;
    }

    public void setSocialEnvironmentID(int socialEnvironmentID) {
        SocialEnvironmentID = socialEnvironmentID;
    }

    @Override
    public String toString() {
        return "SocialEnvironment{" +
                "SocialEnvironmentID=" + SocialEnvironmentID +
                ", Relation='" + Relation + '\'' +
                ", IsLocation=" + IsLocation +
                '}';
    }
}
