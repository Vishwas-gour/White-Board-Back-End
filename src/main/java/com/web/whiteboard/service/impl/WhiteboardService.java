package com.web.whiteboard.service.impl;

import com.web.whiteboard.dto.DrawEvent;
import com.web.whiteboard.modal.WhiteboardEvent;


import java.util.List;

public interface WhiteboardService {


    void saveDrawEvent(DrawEvent event);

    List<WhiteboardEvent> getHistory(String sessionId);

    void clearSession(String sessionId);
}
