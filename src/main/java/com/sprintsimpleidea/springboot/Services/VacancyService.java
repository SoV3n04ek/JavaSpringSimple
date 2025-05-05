package com.sprintsimpleidea.springboot.Services;

import com.sprintsimpleidea.springboot.Models.Vacancy;
import com.sprintsimpleidea.springboot.Repositories.VacancyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacancyService {
    private final VacancyRepository vacancyRepository;


    public VacancyService(VacancyRepository vacancyRepository) {
        this.vacancyRepository = vacancyRepository;
    }

    public List<Vacancy> getAllVacancies() { return vacancyRepository.findAll(); }
}
