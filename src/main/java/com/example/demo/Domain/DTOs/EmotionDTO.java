package com.example.demo.Domain.DTOs;

import com.example.demo.Domain.Emotion;

import java.util.List;

public class EmotionDTO {
    public List<Emotion> emotions;
    public int errorCode;

    public EmotionDTO(List<Emotion> emotions, int errorCode) {
        this.emotions = emotions;
        this.errorCode = errorCode;
    }
}
