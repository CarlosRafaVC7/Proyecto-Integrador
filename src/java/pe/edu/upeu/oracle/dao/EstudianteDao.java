/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.oracle.dao;

import java.util.List;
import pe.edu.upeu.oracle.entity.EstudianteEntity;

/**
 *
 * @author COMTEC
 */
public interface EstudianteDao {
    int createEstudiante(EstudianteEntity es);
    int updateEstudiante(EstudianteEntity es);
    int deleteEstudiante(int id);
    EstudianteEntity readEstudiante(int id);
    public List<EstudianteEntity> readAll();
    
}
