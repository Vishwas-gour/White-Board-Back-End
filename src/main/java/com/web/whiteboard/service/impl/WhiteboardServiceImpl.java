package com.web.whiteboard.service.impl;




import com.web.whiteboard.dto.DrawEvent;
import com.web.whiteboard.modal.WhiteboardEvent;
import com.web.whiteboard.repository.WhiteboardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class WhiteboardServiceImpl implements WhiteboardService {

    private final WhiteboardRepository repository;

    @Override
    public void saveDrawEvent(DrawEvent event) {

        if (!"draw".equals(event.getType())) return;

        WhiteboardEvent entity = WhiteboardEvent.builder()
                .sessionId(event.getSessionId())
                .startX(event.getStartX())
                .startY(event.getStartY())
                .endX(event.getEndX())
                .endY(event.getEndY())
                .color(event.getColor())
                .lineWidth(event.getLineWidth())
                .tool(event.getTool())
                .build();

        repository.save(entity);
    }

    @Override
    @Transactional(readOnly = true)
    public List<WhiteboardEvent> getHistory(String sessionId) {
        return repository.findBySessionId(sessionId);
    }

    @Override
    public void clearSession(String sessionId) {
        repository.deleteBySessionId(sessionId);
    }
}
