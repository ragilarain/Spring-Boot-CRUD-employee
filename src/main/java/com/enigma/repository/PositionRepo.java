package com.enigma.repository;

import com.enigma.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepo extends JpaRepository<Position,Integer> {


}
