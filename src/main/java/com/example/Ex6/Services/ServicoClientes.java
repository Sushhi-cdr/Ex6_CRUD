package com.example.Ex6.Services;

import com.example.Ex6.Models.Clientes;
import com.example.Ex6.Repositories.RepositorioClientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoClientes {

    @Autowired
    private RepositorioClientes repositorio;

    public Clientes criar(Clientes clientes) {
        return repositorio.save(clientes);
    }

    public List<Clientes> listar(){
        return repositorio.findAll();
    }

    public Clientes buscarPorId(Long id){
        return repositorio.findById(id).orElse(null);
    }

    public void deletar(Long id){
        repositorio.deleteById(id);
    }
}
