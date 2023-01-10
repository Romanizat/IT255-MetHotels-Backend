package com.romanizat.methotels.service.impl;

import com.romanizat.methotels.entity.Room;
import com.romanizat.methotels.repository.RoomRepository;
import com.romanizat.methotels.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {
    private final RoomRepository roomRepository;

    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public Room findById(Integer id) {
        return roomRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("RoomService.notFound"));
    }

    @Override
    public Room save(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room update(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public void deleteById(Integer id) {
        roomRepository.deleteById(id);
    }


}