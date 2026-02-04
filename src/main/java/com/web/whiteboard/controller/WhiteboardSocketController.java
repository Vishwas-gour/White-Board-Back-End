package com.web.whiteboard.controller;

import com.web.whiteboard.dto.DrawEvent;
import com.web.whiteboard.service.impl.WhiteboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@RequiredArgsConstructor
@CrossOrigin("*")
public class WhiteboardSocketController {

    private final WhiteboardService whiteboardService;

    @MessageMapping("/draw")
    @SendTo("/topic/whiteboard")
    public DrawEvent handleDraw(DrawEvent event) {
        whiteboardService.saveDrawEvent(event);
        return event;
    }
}

