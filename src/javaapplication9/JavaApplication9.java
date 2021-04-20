/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author mehab
 */
public class JavaApplication9 {

    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("JDBC:mySQL://localhost/company?characterEncoding=latin1&useConfigs=maxPerformance", "root", "12345678" );
        Statement st = con.createStatement();
        ResultSet result = st.executeQuery("select * from employee");
        result.first();
        String x=result.getString("FirstName");
        System.out.println(result.getString("FirstName"));
        System.out.println(result.getString("Age"));
        result.next();
        System.out.println(result.getString("FirstName"));
    }

}
