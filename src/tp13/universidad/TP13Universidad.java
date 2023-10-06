
package tp13.universidad;

import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

public class TP13Universidad {

    public static void main(String[] args) {
        
       try {
            //Cargo Driver de conexión
            Class.forName("org.mariadb.jdbc.Driver");
            //Establecer la conexión 
            String URL="jdbc:mariadb://localhost:3306/universidad";
            String usuario="root";
            String password="";
            Connection con=(Connection) DriverManager.getConnection(URL,usuario,password);
            
            //------------------------Agregar Alumno----------------------------
            
            /*String sql="INSERT INTO alumno (dni,apellido, nombre, fechaDeNacimiento, estado)"
            + "Values (45923456, 'Cuk', 'Gonzalo', '2004-07,01', true)";           
            PreparedStatement ps =con.prepareStatement(sql);
            int filas= ps.executeUpdate();
            if(filas>0){                
                JOptionPane.showMessageDialog(null, "Alumno Agregado ");
            }
            System.out.println("Exito");*/
            
            //----------------Dar alta a una materia (Insert)-------------------
            
            /*String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);            
            // Establecer los valores de los parámetros
            ps.setString(1, "Química"); // Reemplaza con el nombre de la materia que deseas agregar
            ps.setInt(2, 2023); // Reemplaza con el año en el que se imparte la materia
            ps.setBoolean(3, true); // Reemplaza con true si la materia está activa, false si no

            int filas = ps.executeUpdate();
            if (filas > 0) {
            JOptionPane.showMessageDialog(null, "Materia Agregada");
            }
            System.out.println("Exito");*/
            
            //-----------Obtener los datos de los alumnos activos---------------
            
            /*String sql = "SELECT * FROM alumno WHERE estado=true";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
                int id=rs.getInt("IdAlumno");
                int dni=rs.getInt("dni");                
                String apellido = rs.getString("apellido");
                String nombre = rs.getString("nombre");
                LocalDate fechaN = rs.getDate("fechaDeNacimiento").toLocalDate();
                boolean estado = rs.getBoolean("estado");
                
                
                System.out.println("-----------------------------------");
                System.out.println("DNI: "+dni);
                System.out.println("Apellido: "+apellido);
                System.out.println("Nombre: "+nombre);
                System.out.println("Fecha: "+fechaN.toString());
                if(estado = true){                
                    System.out.println("El alumno está activo");
                }else
                    System.out.println("El alumno no está activo");
            }*/
            
            //------------Dar alta a una materia (Insert)-----------------------
            
            /*String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            // Establecer los valores de los parámetros
            ps.setDouble(1, 10);//Nota 
            ps.setInt(2, 3);//idAlumno
            ps.setInt(3, 4);//idMateria

            int filas = ps.executeUpdate();
            if (filas > 0) {
            JOptionPane.showMessageDialog(null, "Inscripcion Agregada");
            }
            System.out.println("Exito");*/
            
            //--Listar los datos de los alumnos con calificaciones superiores a 8.---
            
                                        
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el Driver ");
        } catch (SQLException ex) {
           int error=ex.getErrorCode();
           if(error==1146){
               JOptionPane.showMessageDialog(null, "Tabla Inexistente");
        }else if(error==1062){
              JOptionPane.showMessageDialog(null, "Dni Duplicado");
        }else if(error==1049){
            JOptionPane.showMessageDialog(null, "BD inexistente");
           }else {
            JOptionPane.showMessageDialog(null, "Error SQL");
        }
       }
    }
}   
 
    
    

