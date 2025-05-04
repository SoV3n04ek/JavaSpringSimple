package com.sprintsimpleidea.springboot.Services;

import com.sprintsimpleidea.springboot.Models.SoftwareEngineer;
import com.sprintsimpleidea.springboot.Repositories.SoftwareEngineerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {
    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(
            SoftwareEngineerRepository softwareEngineerRepository
    ) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerRepository.findAll();
    };
}
