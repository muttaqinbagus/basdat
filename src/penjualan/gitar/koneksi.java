/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.gitar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author taqbagus
 */
public class koneksi {
    private static Connection conn;
        public static Connection getConnection(){
        String url = "oracle.jdbc.driver.OracleDriver";
        String database = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "muttaqin_6709";
        String password = "muttaqin";
        try{
            conn = (Connection) DriverManager.getConnection(database,username,password);
           // JOptionPane.showMessageDialog(null, "Connect");
        }catch (SQLException err){
            JOptionPane.showMessageDialog(null, "Gak Connect");
        }
        return conn;
        }
        void putData(String sql){
		try{
                    Connection con = getConnection();
                    Statement state = con.createStatement();
                    state.executeUpdate(sql);
                    state.close();
		} catch(Exception ex){

		}
	}
	public Statement state;
	public ResultSet getData(String sql) throws Exception {
		Connection con = getConnection();
		state = con.createStatement();
		ResultSet rset = state.executeQuery(sql);
		return rset;
	}
}
