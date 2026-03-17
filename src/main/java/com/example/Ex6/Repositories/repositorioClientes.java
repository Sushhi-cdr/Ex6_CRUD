package com.example.Ex6.Repositories;

import com.example.Ex6.Models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioClientes extends JpaRepository<Clientes, Long> {
}
