package com.example.demo.Domain;

public class Emotion {
    int idEmotion;
    String nameEmotion;
    int idCategory;

    @Override
    public String toString() {
        return "Emotion{" +
                "idEmotion=" + idEmotion +
                ", nameEmotion='" + nameEmotion + '\'' +
                ", idCategory=" + idCategory +
                '}';
    }

    public int getIdEmotion() {
        return idEmotion;
    }

    public void setIdEmotion(int idEmotion) {
        this.idEmotion = idEmotion;
    }

    public String getNameEmotion() {
        return nameEmotion;
    }

    public void setNameEmotion(String nameEmotion) {
        this.nameEmotion = nameEmotion;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }
}
