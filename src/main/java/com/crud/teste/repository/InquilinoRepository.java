package com.crud.teste.repository;

import com.crud.teste.model.Inquilino;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InquilinoRepository extends JpaRepository<Inquilino, Long> {
}
