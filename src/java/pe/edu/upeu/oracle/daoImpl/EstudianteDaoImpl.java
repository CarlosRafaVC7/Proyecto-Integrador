/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.oracle.daoImpl;

import java.util.List;
import pe.edu.upeu.oracle.dao.EstudianteDao;
import pe.edu.upeu.oracle.entity.EstudianteEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import pe.edu.upeu.oracle.config.Conexion;

/**
 *
 * @author COMTEC
 */
public class EstudianteDaoImpl implements EstudianteDao {

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int createEstudiante(EstudianteEntity es) {
        int x = 0;
        String SQL = "INSERT INTO estudiante(nombres, apellidos, correo, telefono, idcarrera) VALUES(?, ?, ?, ?, ?)";

        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, es.getNombres());
            ps.setString(2, es.getApellidos());
            ps.setString(3, es.getCorreo());
            ps.setString(4, es.getTelefono());
            ps.setInt(5, es.getIdcarrera());

            x = ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error " + e);
        }
        return x;
    }

    @Override
    public int updateEstudiante(EstudianteEntity es) {
        int x = 0; // Variable para almacenar el resultado de la operación de actualización
        String SQL = "UPDATE estudiante SET nombres=?, apellidos=?, correo=?, telefono=?, idcarrera=? WHERE idestudiante=?";

        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);

            ps.setString(1, es.getNombres());
            ps.setString(2, es.getApellidos());
            ps.setString(3, es.getCorreo());
            ps.setString(4, es.getTelefono());
            ps.setInt(5, es.getIdcarrera());
            ps.setInt(6, es.getIdestudiante()); // Suponiendo que 'getId()' devuelve el ID del estudiante que se desea actualizar

            x = ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error " + e);
        }
        return x;
    }

    @Override
    public int deleteEstudiante(int id) {
        int x = 0; // Variable para almacenar el resultado de la operación de actualización
        String SQL = "delete from estudiante where idestudiante=?";

        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            x = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error " + e);
        }
        return x;
    }

    @Override
    public EstudianteEntity readEstudiante(int id) {
        EstudianteEntity re = new EstudianteEntity();
        String SQL = "SELECT from estudiante where idestudiante=?";

        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                re.setIdestudiante(rs.getInt("idestudiante"));
                re.setNombres(rs.getString("nombres"));
                re.setApellidos(rs.getString("apellidos"));
                re.setCorreo(rs.getString("correo"));
                re.setTelefono(rs.getString("telefono"));
                re.setIdcarrera(rs.getInt("idcarrera"));

            }
        } catch (SQLException e) {
            System.out.println("Error " + e);
        }
        return re ;

    }

    @Override
    public List<EstudianteEntity> readAll() {
        List<EstudianteEntity> lista = new ArrayList<>();
        String SQL = "SELECT *from estudiante";

        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                EstudianteEntity re = new EstudianteEntity();

                re.setIdestudiante(rs.getInt("idestudiante"));
                re.setNombres(rs.getString("nombres"));
                re.setApellidos(rs.getString("apellidos"));
                re.setCorreo(rs.getString("correo"));
                re.setTelefono(rs.getString("telefono"));
                re.setIdcarrera(rs.getInt("idcarrera"));
lista.add(re);
            }
        } catch (SQLException e) {
            System.out.println("Error " + e);
        }
        return lista;
    }

}
