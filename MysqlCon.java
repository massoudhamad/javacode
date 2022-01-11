import java.sql.*;  
class MysqlCon{  
    public static void main(String args[]){  
        try{
            //register driver 
            Class.forName("com.mysql.jdbc.Driver"); 
            
            //establish connection
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/student","root","root");  
            //here sonoo is database name, root is username and password  
            //create statement
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from emp");  
            while(rs.next())  
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
            con.close();  
        }catch(Exception e){ System.out.println(e);}  
    }  
}  