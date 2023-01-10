package com.romanizat.methotels.controller;

import com.romanizat.methotels.entity.Room;
import com.romanizat.methotels.service.RoomService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
@RequiredArgsConstructor
public class RoomController {
    private final RoomService roomService;

    @GetMapping
    @ApiOperation(value = "", nickname = "getAllRooms")
    public ResponseEntity<List<Room>> getAllRooms() {
        return ResponseEntity.ok(roomService.findAll());
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "", nickname = "getRoomById")
    public ResponseEntity<Room> getRoomById(@PathVariable Integer id) {
        return ResponseEntity.ok(roomService.findById(id));
    }

    @PostMapping
    @ApiOperation(value = "", nickname = "saveRoom")
    public ResponseEntity<Room> saveRoom(@RequestBody Room room) {
        return ResponseEntity.status(HttpStatus.CREATED).body(roomService.save(room));
    }

    @PutMapping
    @ApiOperation(value = "", nickname = "updateRoom")
    public ResponseEntity<Room> updateRoom(@RequestBody Room room) {
        return ResponseEntity.ok(roomService.update(room));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "", nickname = "deleteRoomById")
    public void deleteRoomById(@PathVariable Integer id) {
        roomService.deleteById(id);
    }

}

