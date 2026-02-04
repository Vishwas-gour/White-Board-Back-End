package com.web.whiteboard.dto;


import lombok.Data;

@Data
public class DrawEvent {

    private String type;      // draw | clear
    private String sessionId;
    private String userId;

    private double startX;
    private double startY;
    private double endX;
    private double endY;

    private String color;
    private int lineWidth;
    private String tool;      // draw | erase
}
