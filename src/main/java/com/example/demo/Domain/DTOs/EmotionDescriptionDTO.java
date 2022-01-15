package com.example.demo.Domain.DTOs;

import java.util.List;

public class EmotionDescriptionDTO {
    public List<EmotionWithDescription> emotions;
    public int errorCode;

    public EmotionDescriptionDTO(List<EmotionWithDescription> emotions, int errorCode) {
        this.emotions = emotions;
        this.errorCode = errorCode;
    }
}
