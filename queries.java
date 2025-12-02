public class queries {
    static String insert = "INSERT INTO employee (id, name, email, salary) VALUES (?, ?, ?, ?)";
    static String select = "SELECT * FROM employee";
    static String update = "UPDATE employee SET name = ? WHERE id = ?";
    static String delete = "DELETE FROM employee WHERE id = ? ";
}
