package com.arias.programacionii_proyecto1; // Asegurate que coincida con tu package

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Datos de tu base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/proyecto_programacion2";
    private static final String USER = "root";
    private static final String PASSWORD = "adminjota17"; // Poné la que usás en el Workbench

    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            // Registrar el driver (opcional en versiones nuevas, pero buena práctica)
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("❌ Error al conectar: " + e.getMessage());
        }
        return conexion;
    }
}