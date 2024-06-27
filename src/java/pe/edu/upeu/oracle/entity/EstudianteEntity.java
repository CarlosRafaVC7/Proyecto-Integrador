/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.oracle.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author COMTEC
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteEntity {

    private int idestudiante;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private int idcarrera;

}
