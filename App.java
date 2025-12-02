import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

         Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("\nEmployee management");
            System.out.println("1 = Create, 2 = Read, 3 = Update, 4 = Delete\n ");


            int choice = sc.nextInt();

            if(choice<1 || choice>4){
                break;
            }
            else{
                switch (choice) {
                    
                    case 1:
                        System.out.println("id,name,email,salary");
                        int id = sc.nextInt();
                        sc.nextLine();
                        String name = sc.nextLine();
                        String email = sc.nextLine();
                        int salary  = sc.nextInt();
                        sc.nextLine();
                        Employee emp = new Employee(id,name,email,salary);
                        EmployeeDataOperations.createEmployee(emp);
                        break;

                    case 2:
                        ArrayList<Employee> list = EmployeeDataOperations.read();
                        for(Employee employee :list){
                            System.out.println(employee);
                        }
                        break;

                    case 3:
                        System.out.println("Enter the id to change the details : ");
                        id= sc.nextInt();

                        sc.nextLine();

                        System.out.println("Enter the new name to change : ");
                        name = sc.nextLine();
                        EmployeeDataOperations.update(id,name);

                    case 4:
                        System.out.println("enter the id to delete : ");
                        id = sc.nextInt();
                        sc.nextLine();
                        EmployeeDataOperations.delete(id);

                    case 5:
                        

                    default:
                        break;
                }
            }



        }












    }
}
