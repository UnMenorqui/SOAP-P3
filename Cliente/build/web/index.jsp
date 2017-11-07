<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina inicial SOAP</title>
    </head>
    <body>
        <%
            Connection connection = null;
        try {            
            // load the sqlite-JDBC driver using the current class loader
            Class.forName("org.sqlite.JDBC");        

            // create a database connection
            connection = DriverManager.getConnection("jdbc:sqlite:/Users/Toni/Documents/Universitat/AD/LAB/p3.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.

            //hotel_fecha (id_hotel, fecha, num_hab_ocupadas, num_hab_libres)

            //vuelo_fecha (id_vuelo, fecha, num_plazas_ocupadas, num_plazas_max)
            //hotel_fecha (id_hotel, fecha, num_hab_ocupadas, num_hab_libres)
            statement.executeUpdate("create table if not exists hotel_fecha(id_hotel integer primary key, fecha integer, num_hab_ocupadas integer, num_hab_libres integer)");
            statement.executeUpdate("create table if not exists vuelo_fecha(id_vuelo integer primary key, fecha integer, num_plazas_ocupadas integer, num_plazas_max integer)");
            ResultSet rs = statement.executeQuery("select * from hotel_fecha");
            boolean esta = false;
            while (rs.next()) {
                esta = true;
            }
            if (!esta) {
                statement.executeUpdate("insert into hotel_fecha values(1, 20171107, 0, 100)");
                statement.executeUpdate("insert into hotel_fecha values(2, 20171107, 0, 50)");
                statement.executeUpdate("insert into hotel_fecha values(3, 20171107, 0, 10)");
            }
            
            rs = statement.executeQuery("select * from vuelo_fecha");
            esta = false;
            while (rs.next()) {
                esta = true;
            }
            if (!esta) {
                statement.executeUpdate("insert into vuelo_fecha values(1, 20171107, 0, 100)");
                statement.executeUpdate("insert into vuelo_fecha values(2, 20171107, 0, 50)");
                statement.executeUpdate("insert into vuelo_fecha values(3, 20171107, 0, 10)");
            }
            
        } catch(SQLException e) {
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if(connection != null)
                    connection.close();
            } catch(SQLException e) {
                // connection close failed.
                System.err.println(e.getMessage());
            }
        }
        %>
        
        <form method="POST">
            <a href="http://localhost:8080/Cliente/ServletHotel">Hotel</a><br>
            <a href="http://localhost:8080/Cliente/ServletVuelo">Vuelo</a><br>
            <a href="http://localhost:8080/Cliente/ServletReiniciar">Reiniciar base de datos</a>
        </form>
            
        
        
        
    </body>
</html>
