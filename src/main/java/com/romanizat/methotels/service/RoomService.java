package com.romanizat.methotels.service;

import com.romanizat.methotels.entity.Room;

import java.util.List;

public interface RoomService {

    List<Room> findAll();

    Room save(Room room);

    Room update(Room room);

    Room findById(Integer id);

    void deleteById(Integer id);

}