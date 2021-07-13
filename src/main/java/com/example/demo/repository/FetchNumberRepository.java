package com.example.demo.repository;

import com.example.demo.entity.FetchNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FetchNumberRepository extends JpaRepository<FetchNumber, Long> {

    public FetchNumber findByCategoryCode(String categoryCode);
}
