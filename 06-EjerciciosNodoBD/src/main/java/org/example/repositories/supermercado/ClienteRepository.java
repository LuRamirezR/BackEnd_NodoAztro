package org.example.repositories.supermercado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.example.models.supermercado.Cliente;
import jakarta.persistence.TypedQuery; // Para realizar las acciones a la BD

import java.util.List;

public class ClienteRepository {
    private final EntityManagerFactory emf;

    public ClienteRepository(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void save(Cliente cliente) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(cliente);
        transaction.commit();
        entityManager.close();
    }

    public void saveAll(List<Cliente> clientes) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        for (Cliente cliente : clientes) {
            entityManager.persist(cliente);
        }
        transaction.commit();
        entityManager.close();
    }

    public Cliente findById(long id) {
        EntityManager entityManager = emf.createEntityManager();
        Cliente cliente = entityManager.find(Cliente.class, id);
        entityManager.close();
        return cliente;
    }

    public List<Cliente> findAll() {
        EntityManager entityManager = emf.createEntityManager();
        TypedQuery<Cliente> query = entityManager.createQuery("SELECT c FROM Cliente c", Cliente.class);
        List<Cliente> clientes = query.getResultList();
        entityManager.close();
        return clientes;
    }
}
