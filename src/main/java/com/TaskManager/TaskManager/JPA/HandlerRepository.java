package com.TaskManager.TaskManager.JPA;

import com.TaskManager.TaskManager.Models.Handler;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HandlerRepository extends JpaRepository<Handler, Integer> {

    @Cacheable(sync = false)
    public Handler findById(int id);
}
