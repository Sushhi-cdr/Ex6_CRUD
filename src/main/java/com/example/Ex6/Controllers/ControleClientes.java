package com.example.Ex6.Controllers;

import com.example.Ex6.Models.Clientes;
import com.example.Ex6.Services.ServicoClientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Clientes")
public class ControleClientes {

    @Autowired
    private ServicoClientes servico;

    @PostMapping
    public Clientes criar(@RequestBody Clientes clientes){
        return servico.save(clientes);
    }

    @GetMapping
    public List<Clientes> listar(){
        return servico.listar();
    }

    @GetMapping("/{id}")
    public Clientes buscar(@PathVariable Long id){
        return servico.buscarPorId(id);
    }

    @DeleteMapping
    public void excluir(@PathVariable Long id){
        servico.deletar(id);
    }

}
