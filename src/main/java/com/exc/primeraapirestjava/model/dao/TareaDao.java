package com.exc.primeraapirestjava.model.dao;

import com.exc.primeraapirestjava.model.entity.Tarea;
import org.springframework.data.repository.CrudRepository;

public interface TareaDao extends CrudRepository<Tarea, Integer> {
}
