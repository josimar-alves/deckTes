package com.exemple.deckTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.deckTest.models.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, String> {

}
