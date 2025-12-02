
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class EmployeeDataOperations {
    public static void createEmployee(Employee employee) throws SQLException{
        Connection conn = DBConnection.connect();

        String query = queries.insert;
        PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, employee.getid());
            preparedStatement.setString(2, employee.getname());
            preparedStatement.setString(3, employee.getemail());
            preparedStatement.setInt(4, employee.getsalary());

            System.out.println("\n ps = "+preparedStatement);
            preparedStatement.executeUpdate();
            preparedStatement.close();
    }
    public static ArrayList<Employee> read() throws SQLException{
        ArrayList<Employee> empList = new ArrayList<Employee>();
        Connection conn = DBConnection.connect();

        String query = queries.select;
        PreparedStatement st = conn.prepareStatement(query);  // fixed: use PreparedStatement
       
        ResultSet rs =st.executeQuery(query);

        while (rs.next()) {
            Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4));
            empList.add(emp);
        }
        st.close();
        rs.close();
        
        return empList;
    }

    public static void update(int id,String name) throws SQLException {
        Connection conn = DBConnection.connect();
        String query = queries.update;
        PreparedStatement st = conn.prepareStatement(query);
            st.setInt(2,id);
            st.setString(1,name);

        st.executeUpdate();
        
        st.close();


    }
    public static void delete(int id) throws Exception{
        Connection con = DBConnection.connect();

        String query = queries.delete;

        PreparedStatement st = con.prepareStatement(query);

        st.setInt(1, id);
        st.executeUpdate();
        st.close();

    }

}
