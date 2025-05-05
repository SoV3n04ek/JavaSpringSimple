package com.sprintsimpleidea.springboot.Repositories;

import com.sprintsimpleidea.springboot.Models.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacancyRepository
    extends JpaRepository<Vacancy, Integer> {

}
