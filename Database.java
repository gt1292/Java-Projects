import java.sql.*;

public class Database 
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  //2

            Connection con = DriverManager.getConnection("jdbc::mysql://localhost:3306/marvellous","root","root"); //3

            Statement stmt = con.createStatement(); //4

            ResultSet rs = stmt.executeQuery("select * from student");  //5

            while(rs.next())  //6
            {
                System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getInt(3)+""+rs.getString(4));
            }
            con.close();
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured :"+obj);
        }
    }
}
