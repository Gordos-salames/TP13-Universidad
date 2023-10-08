package basededatostp13;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Materia{
    public static void main(String[] args){
    try {
    // Cargo Driver de conexión
    Class.forName("org.mariadb.jdbc.Driver");
    // Establecer la conexión
    String URL = "jdbc:mariadb://localhost:3306/universidad";
    String usuario = "root";
    String password = "";
    Connection con = DriverManager.getConnection(URL, usuario, password);
    
    // Dar alta a una materia (Insert)
    String sql = "INSERT INTO materia (nombre, codigo, creditos) VALUES (?, ?, ?)";
    PreparedStatement ps = con.prepareStatement(sql);
    
    // Establecer los valores de los parámetros
    ps.setString(1, "Laboratorio 1"); // Reemplaza con el nombre de la materia que deseas agregar
    ps.setString(2, "1"); // Reemplaza con el código de la materia
    ps.setInt(3, 4); // Reemplaza con la cantidad de créditos de la materia
    
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
}
