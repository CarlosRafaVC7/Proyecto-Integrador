
package pe.edu.upeu.oracle.test;

import com.google.gson.Gson;
import pe.edu.upeu.oracle.config.Conexion;
import pe.edu.upeu.oracle.dao.EstudianteDao;
import pe.edu.upeu.oracle.dao.RolDao;
import pe.edu.upeu.oracle.dao.UsuarioDao;
import pe.edu.upeu.oracle.daoImpl.EstudianteDaoImpl;
import pe.edu.upeu.oracle.daoImpl.RolDaoImpl;
import pe.edu.upeu.oracle.daoImpl.UsuarioDaoImpl;
import pe.edu.upeu.oracle.entity.EstudianteEntity;
import pe.edu.upeu.oracle.entity.Rol;

/**
 *
 * @author Docente
 */
public class Test {
static UsuarioDao udao = new UsuarioDaoImpl();
static EstudianteDao rdao = new EstudianteDaoImpl();
static Gson g = new Gson();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(g.toJson(rdao.createEstudiante(new EstudianteEntity(0,"Maria","Parado", "maria@upeu.edu.pe", "987542163",1))));
        //System.out.println(g.toJson(rdao.updateEstudiante(new EstudianteEntity(9,"Kiara","Mattos", "kiara@upeu.edu.pe", "95281473",3))));
        //System.out.println(g.toJson(rdao.deleteEstudiante(11)));
        System.out.println(g.toJson(rdao.readEstudiante(9)));

    }
    static void todo(){
        if(Conexion.getConexion()!=null){
            System.out.println("Conectado");
        }else{
            System.out.println("no conectado");
        }
        //System.out.println(rdao.createRol(new Rol(1,"PRUEBA",1)));
        //System.out.println(rdao.updateRol(new Rol(21,"PRUEBA2",1)));
        //System.out.println(rdao.deleteRol(21));
        //System.out.println(g.toJson(rdao.readRol(21)));
        //System.out.println(g.toJson(rdao.readAllRol()));
        System.out.println(g.toJson(udao.login("dreyna", "1234567")));
    }
}
