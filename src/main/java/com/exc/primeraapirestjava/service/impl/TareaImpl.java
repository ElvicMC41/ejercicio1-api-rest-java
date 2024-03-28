package com.exc.primeraapirestjava.service.impl;

import com.exc.primeraapirestjava.model.dao.TareaDao;
import com.exc.primeraapirestjava.model.entity.Tarea;
import com.exc.primeraapirestjava.service.ITarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TareaImpl implements ITarea {
    @Autowired
    private TareaDao tareaDao;

    @Transactional
    @Override
    public Tarea save(Tarea tarea ) {
        return tareaDao.save(tarea);
    }

    @Transactional(readOnly = true)
    @Override
    public Tarea findById(Integer id_tarea) {
        return tareaDao.findById(id_tarea).orElse(null);
    }

    public void delete(Tarea tarea) {
        tareaDao.delete(tarea);
    }



}
