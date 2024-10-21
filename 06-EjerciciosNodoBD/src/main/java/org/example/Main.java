package org.example;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.persistence.*;
import org.example.models.supermercado.Cliente;
import org.example.repositories.supermercado.ClienteRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().load();

        System.setProperty("jakarta.persistence.jdbc.url", dotenv.get("DB_URL"));
        System.setProperty("jakarta.persistence.jdbc.user", dotenv.get("DB_USER"));
        System.setProperty("jakarta.persistence.jdbc.password", dotenv.get("DB_PASSWORD"));

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        ClienteRepository clienteRepository = new ClienteRepository(emf);

        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Daniel");
        cliente1.setApellido("Arenas");
        cliente1.setCorreo("daniel.arenas@example.com");
        cliente1.setTelefono("123456");
        clienteRepository.save(cliente1);

//        Cliente cliente2 = new Cliente();
//        cliente2.setNombre("Ander");
//        cliente2.setApellido("Ramirez");
//        cliente2.setCorreo("ander.ramirez@example.com");
//        cliente2.setTelefono("78912");
//        clienteRepository.save(cliente2);

        List<Cliente> clientes = clienteRepository.findAll();

//        List<Cliente> clientes = List.of(cliente1, cliente2);
//        clienteRepository.saveAll(clientes);

        //List<Cliente> allclientes = clienteRepository.findAll();

        for (Cliente personaCliente : clientes) {
            System.out.println(personaCliente.getCompras());
            System.out.println(personaCliente);
        }

        emf.close();
    }
}