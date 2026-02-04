package com.web.whiteboard.modal;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WhiteboardEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sessionId;

    private double startX;
    private double startY;
    private double endX;
    private double endY;

    private String color;
    private int lineWidth;
    private String tool; // draw | erase
}
