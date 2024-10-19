package org.example;

import jakarta.persistence.*;
import org.example.models.supermercado.Cliente;
import org.example.repositories.supermercado.ClienteRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        System.out.println("Conexión exitosa");
        ClienteRepository clienteRepository = new ClienteRepository(emf);

        Cliente cliente = new Cliente();
        cliente.setNombre("Carlos");
        cliente.setApellido("Aguilar");
        cliente.setEmail("caguilar@mail.com");
        cliente.setTelefono("1234");

        clienteRepository.save(cliente);

        List<Cliente> clientes = clienteRepository.findAll();

        for (Cliente personaCliente : clientes) {
            System.out.println(personaCliente.getCompras());
            System.out.println(personaCliente);
        }

        emf.close();
    }
}