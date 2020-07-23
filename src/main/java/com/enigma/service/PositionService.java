package com.enigma.service;

import com.enigma.entity.Position;

import java.util.List;

public interface PositionService {

    public Position getById(Integer id);
    public Position insertPosition(Position position);
    public Position updatePosition(Position position);
    public void deletePosition(Position position);
    public List<Position> getPositions();
}
