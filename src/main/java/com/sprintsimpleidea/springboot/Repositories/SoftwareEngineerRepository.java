package com.sprintsimpleidea.springboot.Repositories;

import com.sprintsimpleidea.springboot.Models.SoftwareEngineer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoftwareEngineerRepository
        extends JpaRepository<SoftwareEngineer, Integer> {

}