package com.enigma.controller;

import com.enigma.entity.Position;
import com.enigma.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PositionController {

    @Autowired
    PositionService positionService;

    @CrossOrigin
    @GetMapping("/positions")
    public List<Position> getPositions(){
        return positionService.getPositions();
    }

    @CrossOrigin
    @GetMapping("/position/{id}")
    public Position getById(@PathVariable Integer id) {
        return positionService.getById(id);
    }
    @CrossOrigin
    @PostMapping("/position")
    public Position insertPosition(@RequestBody Position position) {
        return positionService.insertPosition(position);
    }
    @CrossOrigin
    @PutMapping("/position")
    public Position updatePosition(@RequestBody Position position) {
        return positionService.updatePosition(position);
    }
    @CrossOrigin
    @DeleteMapping("/position")
    public void deletePosition(@RequestBody Position position) {
        positionService.deletePosition(position);
    }
}
