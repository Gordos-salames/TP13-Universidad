package basededatostp13;
import java.sql.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BaseDeDatosTp13 {
    public static void main(String[] args){
        /*try {
            //Cargo Driver de conexión
            Class.forName("org.mariadb.jdbc.Driver");
            //Establecer la conexión 
            String URL="jdbc:mariadb://localhost:3306/universidad";
            String usuario="root";
            String password="";
            Connection con=DriverManager.getConnection(URL,usuario,password);
            //Dar alta a un alumno. Insert
            String sql="INSERT INTO alumno (dni,apellido, nombre, fechaDeNacimiento, estado)"
            + "Values (45202852, 'Cuk', 'Gonzalo', '2005-10-03', true)";
            
            PreparedStatement ps =con.prepareStatement(sql);
            int filas= ps.executeUpdate();
            if(filas>0){
                JOptionPane.showMessageDialog(null, "Alumno Agregado ");
            }
            System.out.println("Exito");
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
    }*/
    /*try {
    // Cargo Driver de conexión
    Class.forName("org.mariadb.jdbc.Driver");
    // Establecer la conexión
    String URL = "jdbc:mariadb://localhost:3306/universidad";
    String usuario = "root";
    String password = "";
    Connection con = DriverManager.getConnection(URL, usuario, password);
    
    // Dar alta a una materia (Insert)
    String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?, ?, ?)";
    PreparedStatement ps = con.prepareStatement(sql);
    
    // Establecer los valores de los parámetros
    ps.setString(1, "Laboratorio 2"); // Reemplaza con el nombre de la materia que deseas agregar
    ps.setInt(2, 2024); // Reemplaza con el año en el que se imparte la materia
    ps.setBoolean(3, true); // Reemplaza con true si la materia está activa, false si no
    
    int filas = ps.executeUpdate();
    if (filas > 0) {
        JOptionPane.showMessageDialog(null, "Materia Agregada");
    }
    System.out.println("Exito");
} catch (ClassNotFoundException ex) {
    JOptionPane.showMessageDialog(null, "Error al cargar el Driver");
} catch (SQLException ex) {
    int error = ex.getErrorCode();
    if (error == 1146) {
        JOptionPane.showMessageDialog(null, "Tabla Inexistente");
    } else if (error == 1062) {
        JOptionPane.showMessageDialog(null, "Duplicado en la clave primaria");
    } else if (error == 1049) {
        JOptionPane.showMessageDialog(null, "Base de Datos Inexistente");
    } else {
        JOptionPane.showMessageDialog(null, "Error SQL");
    }
}
    }
    } */

    /*try {
    // Cargo Driver de conexión
    Class.forName("org.mariadb.jdbc.Driver");
    // Establecer la conexión
    String URL = "jdbc:mariadb://localhost:3306/universidad";
    String usuario = "root";
    String password = "";
    Connection con = DriverManager.getConnection(URL, usuario, password);
    
    // Inscribir Alumnos a Materias (Insert)
    String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?, ?, ?)";
    PreparedStatement ps = con.prepareStatement(sql);
    
    // Establecer los valores de los parámetros
    ps.setDouble(1, 7.5); // Nota del alumno
    ps.setInt(2, 2); // ID Del alumno
    ps.setInt(3, 1); // Id de la materia 
    
    int filas = ps.executeUpdate();
    if (filas > 0) {
        JOptionPane.showMessageDialog(null, "Inscripcion Agregada");
    }
    System.out.println("Exito");
} catch (ClassNotFoundException ex) {
    JOptionPane.showMessageDialog(null, "Error al cargar el Driver");
} catch (SQLException ex) {
    int error = ex.getErrorCode();
    if (error == 1146) {
        JOptionPane.showMessageDialog(null, "Tabla Inexistente");
    } else if (error == 1062) {
        JOptionPane.showMessageDialog(null, "Duplicado en la clave primaria");
    } else if (error == 1049) {
        JOptionPane.showMessageDialog(null, "Base de Datos Inexistente");
    } else {
        JOptionPane.showMessageDialog(null, "Error SQL");
    }
}
    }
    }
*/
    /*try {
              //Cargo Driver de conexión
            Class.forName("org.mariadb.jdbc.Driver");
            //Establecer la conexión 
            String URL="jdbc:mariadb://localhost:3306/universidad";
            String usuario="root";
            String password="";
            Connection con=DriverManager.getConnection(URL,usuario,password);
    
        //Obtener los datos de los alumnos activos.
             String sql="SELECT * FROM alumno WHERE estado=true";
             PreparedStatement ps=con.prepareStatement(sql);
             ResultSet rs=ps.executeQuery();
             while(rs.next()){
             
                 int id=rs.getInt("idAlumno");
                 int dni=rs.getInt("dni");
                 String apellido=rs.getString("apellido");
                 String nombre=rs.getString("nombre");
                 LocalDate fechaN=rs.getDate("fechaDeNacimiento").toLocalDate();
                 boolean estado=rs.getBoolean("estado");
                 
                 System.out.println("-----------------------------");
                 System.out.println("Dni "+dni);
                 System.out.println("Apellido "+apellido);
                 System.out.println("Fecha"+fechaN.toString());
             }
             
             con.close();

            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error al cargar Driver");
        } catch (SQLException ex) {
            int error=ex.getErrorCode();
            if(error==1146){
                JOptionPane.showMessageDialog(null,"Tabla inexistente");
            }else if(error==1062){
            
                JOptionPane.showMessageDialog(null,"Dni duplicado");
            }else if(error==1049){
            
                JOptionPane.showMessageDialog(null,"BD inexistente");
            }else {
            
                JOptionPane.showMessageDialog(null,"Error SQL");
                
            }
        }
    }
}*/
       /*try {
            //Cargo Driver de conexión
            Class.forName("org.mariadb.jdbc.Driver");
            //Establecer la conexión 
            String URL="jdbc:mariadb://localhost:3306/universidad";
            String usuario="root";
            String password="";
            Connection con=DriverManager.getConnection(URL,usuario,password);
    //Alumnos Con Notas Superiores A 8.
    String consultaListado = "SELECT alumno.idAlumno, alumno.dni, alumno.apellido, alumno.nombre, inscripcion.nota " +
        "FROM alumno " +
        "INNER JOIN inscripcion ON alumno.idAlumno = inscripcion.idAlumno " +
        "WHERE inscripcion.nota > 8";
    PreparedStatement psListado = con.prepareStatement(consultaListado);
    ResultSet resultado = psListado.executeQuery();

    // Procesar y mostrar los resultados
             while (resultado.next()) {
                int idAlumno = resultado.getInt("idAlumno");
                int dni = resultado.getInt("dni");
                String apellido = resultado.getString("apellido");
                String nombre = resultado.getString("nombre");
                double nota = resultado.getDouble("nota");

                System.out.println("ID de Alumno: " + idAlumno);
                System.out.println("DNI: " + dni);
                System.out.println("Apellido: " + apellido);
                System.out.println("Nombre: " + nombre);
                System.out.println("Nota: " + nota);
                System.out.println("-------------------");
            }

    resultado.close();
    psListado.close();

    // Cerrar la conexión
    con.close();
} catch (Exception e) {
    e.printStackTrace();
}
}
}*/
        /*try {
        //Cargo Driver de conexión
        Class.forName("org.mariadb.jdbc.Driver");
        //Establecer la conexión 
        String URL="jdbc:mariadb://localhost:3306/universidad";
        String usuario="root";
        String password="";
        Connection con=DriverManager.getConnection(URL,usuario,password);
            String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
    PreparedStatement psDesinscripcion = con.prepareStatement(sql);
    psDesinscripcion.setInt(1, 2); // Reemplaza con el ID del alumno
    psDesinscripcion.setInt(2, 1); // Reemplaza con el ID de la materia

    int filasAfectadas = psDesinscripcion.executeUpdate();
    if (filasAfectadas > 0) {
        System.out.println("El alumno ha sido desinscrito de la materia.");
    } else {
        System.out.println("El alumno no estaba inscrito en la materia.");
    }

    psDesinscripcion.close();

    // ... (código para manejar excepciones)

    // Cerrar la conexión
    con.close();
} catch (Exception e) {
    e.printStackTrace();
}
    }
}*/
    }
}
