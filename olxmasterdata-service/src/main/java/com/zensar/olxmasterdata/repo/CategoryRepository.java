package com.zensar.olxmasterdata.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.olxmasterdata.model.Categories;

public interface CategoryRepository extends JpaRepository<Categories, Integer> {

}
