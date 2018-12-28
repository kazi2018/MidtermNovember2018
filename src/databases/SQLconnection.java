package databases;

import java.sql.*;

public class SQLconnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/safwan?useSSL=false&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "safwan2018";


        try {


            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            String sql = "select * from safwan";
            ResultSet rs = myStmt.executeQuery(sql);

            while (rs.next())
                System.out.println(rs.getString("name"));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
