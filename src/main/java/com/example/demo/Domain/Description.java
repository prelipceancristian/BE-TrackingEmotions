package com.example.demo.Domain;

public class Description {
    int DescriptionID;
    String Text;

    @Override
    public String toString() {
        return "Description{" +
                "DescriptionID=" + DescriptionID +
                ", Text='" + Text + '\'' +
                '}';
    }

    public int getDescriptionID() {
        return DescriptionID;
    }

    public void setDescriptionID(int descriptionID) {
        DescriptionID = descriptionID;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }
}
