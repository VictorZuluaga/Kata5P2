
package view;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MailListReader {
    
    public List<String> read(String fileName)throws Exception{
        List<String> lista = new ArrayList<>(); 
        File doc = new File(fileName);
        BufferedReader obj = new BufferedReader(new FileReader(doc));
        String aux = "";
        String url = "jdbc:sqlite:EMAIL.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        String sql = "SELECT * FROM EMAIL";
        try (
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)){
            
        while (rs.next()) {
            lista.add(rs.getString("mail"));
        }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }
}

