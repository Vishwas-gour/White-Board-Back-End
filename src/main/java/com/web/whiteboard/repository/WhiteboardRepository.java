package com.web.whiteboard.repository;




import com.web.whiteboard.modal.WhiteboardEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiteboardRepository extends JpaRepository<WhiteboardEvent, Long> {

    List<WhiteboardEvent> findBySessionId(String sessionId);

    void deleteBySessionId(String sessionId);
}
