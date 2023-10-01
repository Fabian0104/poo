package com.poo.service.impl;

import java.util.List;

import com.poo.model.Materia;
import com.poo.service.IEstudianteService;

public class EstudianteServiceImpl implements IEstudianteService {

    @Override
    public double promedioFinal(List<Materia> materias){
        double promedio = 0;
        for (Materia materia : materias) {
            promedio += materia.getCalificacion();
        }

        return promedio/materias.size();
    }
    
}
