package org.example.repositories.supermercado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.example.models.supermercado.Cliente;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public class ClienteRepository {
    private final EntityManagerFactory entityManagerFactory;

    public ClienteRepository(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    //Para guardar
    public void save(Cliente cliente) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(cliente);
        transaction.commit();
        entityManager.close();
    }

    //Para encontrar por ID, listar
    public Cliente findById(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Cliente cliente = entityManager.find(Cliente.class, id);
        entityManager.close();
        return cliente;
    }

    //Para encontrar todos
    public List<Cliente> findAll() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Cliente> clientes = entityManager.createQuery("from Cliente", Cliente.class).getResultList();
        entityManager.close();
        return clientes;
    }

    //Para eliminar
    public void delete(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Cliente cliente = entityManager.find(Cliente.class, id);
        entityManager.remove(cliente);
        transaction.commit();
        entityManager.close();
    }

    //Para actualizar
    public void update(Cliente cliente) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(cliente);
        transaction.commit();
        entityManager.close();
    }
}
