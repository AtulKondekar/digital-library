package com.tech.digitallibrary.repositories;

import com.tech.digitallibrary.entities.Card;
import com.tech.digitallibrary.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}
