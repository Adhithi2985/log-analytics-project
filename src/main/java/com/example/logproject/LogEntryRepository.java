package com.example.logproject; // <-- Make sure this package name is correct

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogEntryRepository extends JpaRepository<LogEntry, Long> {
    // Spring Data JPA automatically creates methods like save(), findById(), findAll()
    // You don't need to write any code here!
}
