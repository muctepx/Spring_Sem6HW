package com.example.spring.data.repository;

import com.example.spring.data.domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Интерфейс для работы с репозиторием.
 */
@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}