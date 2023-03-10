package org.example;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;


public class EntityManagerProducer {

    @Produces
    @PersistenceContext(unitName = "RestController")
    @MySqlDatabase
    private EntityManager em;

}
