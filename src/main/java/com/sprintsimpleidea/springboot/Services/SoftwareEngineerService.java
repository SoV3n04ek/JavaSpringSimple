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
    }

    // TODO: replace arg to DTO
    public void insertSoftwareEngineer(
            SoftwareEngineer softwareEngineer
    ) {
        // TODO: add not null & validation
        softwareEngineerRepository.save(softwareEngineer);
    }

    public SoftwareEngineer getSoftwareEngineerById(
            Integer id
    ) {
        return softwareEngineerRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        "SoftwareEngineer with id " + id + " not found"
                ));
    }
}