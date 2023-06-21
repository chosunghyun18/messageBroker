package com.websocket.chat.repo;

import com.websocket.chat.model.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ChatRoomRepository extends JpaRepository<ChatRoom,Long> {

}
