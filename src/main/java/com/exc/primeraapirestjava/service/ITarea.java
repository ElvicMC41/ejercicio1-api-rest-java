package com.exc.primeraapirestjava.service;

import com.exc.primeraapirestjava.model.entity.Tarea;

public interface ITarea {

    Tarea save(Tarea tarea);

    Tarea findById(Integer id_tarea);

    void delete(Tarea tarea);
}
