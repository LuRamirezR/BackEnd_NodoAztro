package org.example;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.persistence.*;
import org.example.models.supermercado.Cliente;
import org.example.repositories.supermercado.ClienteRepository;

public class Main {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().load();

        System.setProperty("jakarta.persistence.jdbc.url", dotenv.get("DB_URL"));
        System.setProperty("jakarta.persistence.jdbc.user", dotenv.get("DB_USER"));
        System.setProperty("jakarta.persistence.jdbc.password", dotenv.get("DB_PASSWORD"));

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        ClienteRepository clienteRepository = new ClienteRepository(emf);

        Cliente cliente = new Cliente();
        cliente.setNombre("Pelicanger");
        cliente.setApellido("Lozano");
        clienteRepository.save(cliente);

        emf.close();
    }
}