package com.example.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Robert Hemingway on 03/05/2017.
 */
/* Handles the database data that is retrived from the website using the CRUD operations
-------------------------------------------------- */
 public interface BarRepository extends CrudRepository<Bar, Long> {
 }
