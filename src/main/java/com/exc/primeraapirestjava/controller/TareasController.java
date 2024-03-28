package com.exc.primeraapirestjava.controller;

import com.exc.primeraapirestjava.model.entity.Tarea;
import com.exc.primeraapirestjava.service.ITarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class TareasController {

    @Autowired
    private ITarea itarea;

    @PostMapping("tarea")
    public Tarea create(@RequestBody Tarea tarea) {
        return itarea.save(tarea);
    }

    @RequestMapping("tarea")
    public Tarea update(@RequestBody Tarea tarea) {
        return itarea.save(tarea);
    }

    @DeleteMapping("tarea/{id_tarea}")
    public void delete(@PathVariable Integer id_tarea){
        Tarea tareaEliminar = itarea.findById(id_tarea);
        itarea.delete(tareaEliminar);
    }

    @GetMapping("tarea/{id_tarea}")
    public Tarea showById(@PathVariable Integer id_tarea) {
        return itarea.findById(id_tarea);
    }




}
