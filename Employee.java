public class Employee {
    private int id;
    private String name;
    private String email;
    private int salary;

    Employee(int id,String name,String email,int salary){
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    int getid(){
        return id;
    }

    String getname(){
        return name;
    }
    String getemail(){
        return email;
    }
    int getsalary(){
        return salary;
    }

    public String toString(){
        return "Employee [ id = " + id + " name = " +name + " email = " + email +" salary = " +salary +"]";
    }
    
}
