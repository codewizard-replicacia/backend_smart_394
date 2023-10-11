package com.apps.alerts.repository;


import com.apps.alerts.model.WaterPipe;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class WaterPipeRepository extends SimpleJpaRepository<WaterPipe, String> {
    private final EntityManager em;
    public WaterPipeRepository(EntityManager em) {
        super(WaterPipe.class, em);
        this.em = em;
    }
    @Override
    public List<WaterPipe> findAll() {
        return em.createNativeQuery("Select * from \"smart\".\"WaterPipe\"", WaterPipe.class).getResultList();
    }
}