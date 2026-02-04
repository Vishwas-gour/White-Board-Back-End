package com.web.whiteboard.controller;

import com.web.whiteboard.modal.WhiteboardEvent;
import com.web.whiteboard.service.impl.WhiteboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/whiteboard")
@RequiredArgsConstructor
@CrossOrigin("*")
public class WhiteboardRestController {

    private final WhiteboardService whiteboardService;

    @GetMapping("/history/{sessionId}")
    public List<WhiteboardEvent> history(@PathVariable String sessionId) {
        return whiteboardService.getHistory(sessionId);
    }

    @DeleteMapping("/clear/{sessionId}")
    public void clear(@PathVariable String sessionId) {
        whiteboardService.clearSession(sessionId);
    }
}
