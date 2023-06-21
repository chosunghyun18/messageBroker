package com.websocket.chat.service;

import com.websocket.chat.model.ChatRoom;
import com.websocket.chat.repo.ChatRoomRepository;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChatRoomService {

    private final ChatRoomRepository chatRoomRepository;
    public List<ChatRoom> findAllRoom() {
        // 채팅방 생성순서 최근 순으로 반환
        return chatRoomRepository.findAll();
    }

    public ChatRoom findRoomById(Long id) {
        return  chatRoomRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Room not found with ID"));
    }

    public ChatRoom createChatRoom(String name) {
        return new ChatRoom(name);
    }
}
