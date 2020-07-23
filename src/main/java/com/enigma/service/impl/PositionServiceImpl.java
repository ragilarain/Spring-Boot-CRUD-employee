package com.enigma.service.impl;

import com.enigma.Exception.NotFoundException;
import com.enigma.entity.Employee;
import com.enigma.entity.Position;
import com.enigma.repository.PositionRepo;
import com.enigma.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    PositionRepo positionRepo;

    @Override
    public Position getById(Integer id) {
        if (!positionRepo.findById(id).isPresent()) {
            throw new NotFoundException("Id not found");
        }
        return positionRepo.findById(id).get();
    }

    @Override
    public Position insertPosition(Position position) {
        return positionRepo.save(position);
    }

    @Override
    public Position updatePosition(Position position) {

//        for (Employee employee:position.getEmployeeList()) {
//            employee.setPositionId(position);
//        }
        return positionRepo.save(position);
    }

    @Override
    public void deletePosition(Position position) {
        positionRepo.delete(position);
    }

    @Override
    public List<Position> getPositions() {
        return positionRepo.findAll();
    }
}
