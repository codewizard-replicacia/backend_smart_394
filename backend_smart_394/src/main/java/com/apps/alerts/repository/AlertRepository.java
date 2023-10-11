package com.apps.alerts.repository;


import com.apps.alerts.model.Alert;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class AlertRepository extends SimpleJpaRepository<Alert, String> {
    private final EntityManager em;
    public AlertRepository(EntityManager em) {
        super(Alert.class, em);
        this.em = em;
    }
    @Override
    public List<Alert> findAll() {
        return em.createNativeQuery("Select * from \"smart\".\"Alert\"", Alert.class).getResultList();
    }
}