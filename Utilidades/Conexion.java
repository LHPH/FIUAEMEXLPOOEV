package Utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

//import oracle.jdbc.OracleDriver;

public class Conexion {
    private String url;   //URL de la base de datos
    private String user;  // nombre del usuario de la base de datos
    private String password; // contraseña de la base de datos
    public final static String ORACLE_DATABASE="jdbc:oracle:thin:@localhost:1521:XE";
    private static Connection connection;
    private ResultSet consulta;
    private Statement sentencia;
    
    
    public Conexion(String url,String user, String password) {
        super();
        this.url=url;
        this.user = user;
        this.password = password;
    }

    public boolean initConexion() {
           boolean acc=false;
        if (connection == null) {
            try {
               // DriverManager.registerDriver(new OracleDriver());
                connection = DriverManager.getConnection(url, user, password);
                acc=true;
            } catch (SQLException sqle) {
                acc=false;
            }
        }
        return acc;
    }

    public void executeDML(String sql) {
        try {
            sentencia = connection.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cleanUp() {
        try {
            if (sentencia != null)
                sentencia.close();
            if (consulta != null)
                consulta.close();
            if (connection != null){
                connection.close();
                connection=null;
            }
                
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public ResultSet getResultSet(String sql) {
        try {
            sentencia = connection.createStatement();
            consulta = sentencia.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return consulta;
    }
    
    public int setIndice(String camp,String nomTabla){
        String sql="SELECT MAX("+camp+") AS C FROM "+nomTabla+"";
        ResultSet res=getResultSet(sql);
        int num=0;
        try{
           res.next();
           num=res.getInt("C");
        }catch(SQLException e){
           num=0;
        }
        return num;
    }
    
    public void executeDDL(String sql)throws Exception,NullPointerException,SQLException{
        if(sql.isEmpty()){
            throw new Exception("String con longituid 0");
        }
        if(sql==null){
            throw new NullPointerException("String Null");
        }
        else{
            sentencia = connection.createStatement();
            sentencia.executeUpdate(sql);
        }
    }
}



