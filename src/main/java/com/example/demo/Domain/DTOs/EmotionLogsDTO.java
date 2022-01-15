package com.example.demo.Domain.DTOs;

import com.example.demo.Domain.EmotionLog;

import java.util.List;

public class EmotionLogsDTO {

    public List<EmotionLog> emotionLogs;
    public int errorCode;

    public EmotionLogsDTO(List<EmotionLog> emotionLogs, int errorCode) {
        this.emotionLogs = emotionLogs;
        this.errorCode = errorCode;
    }

    public EmotionLogsDTO() {}

}
