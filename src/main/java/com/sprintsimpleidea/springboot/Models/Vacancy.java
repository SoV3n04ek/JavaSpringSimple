package com.sprintsimpleidea.springboot.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Vacancy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description;
    private String link;
    private String company;
    private String companyUrl;

    public Vacancy() {
    }

    public Vacancy(Integer id, String title, String description, String link, String company, String companyUrl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.link = link;
        this.company = company;
        this.companyUrl = companyUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyUrl() {
        return companyUrl;
    }

    public void setCompanyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vacancy vacancy = (Vacancy) o;
        return Objects.equals(id, vacancy.id) && Objects.equals(title, vacancy.title) && Objects.equals(description, vacancy.description) && Objects.equals(link, vacancy.link) && Objects.equals(company, vacancy.company) && Objects.equals(companyUrl, vacancy.companyUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, link, company, companyUrl);
    }
}
