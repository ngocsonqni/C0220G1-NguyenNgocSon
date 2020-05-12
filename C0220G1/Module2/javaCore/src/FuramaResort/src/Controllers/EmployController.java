package Controllers;
import Commons.FuncGeneric;
import Commons.ScannerUtils;
import FileCSV.Resume;
import Models.Employee;
import java.util.*;
import static Controllers.MainController.backMainMenu;
public class EmployController {
    public static void showInformationEmployee(){
        ArrayList<Employee> employeeList = FuncGeneric.getLisFromCSV(FuncGeneric.EntityType.EMPLOYEE);
        Map<String,Employee> map = new HashMap<>();
        for(Employee employee: employeeList){
            map.put(employee.getId(),employee);
        }
        displayMap(map);
        backMainMenu();
    }
    public static void displayMap(Map<String, Employee> map){
        for(Map.Entry m : map.entrySet()){
            System.out.println("Key : " + m.getKey() + "\n" + m.getValue().toString());
        }
    }
    public static void findEmployeeFromResume(){
        Stack<Employee> employeeStack = Resume.getAllEmployee();
        System.out.println("Enter key of Employee: ");
        String inputSearch = ScannerUtils.scanner.nextLine();
        try{
            while (true){
                boolean foundByID =  employeeStack.peek().getId().contains(inputSearch);
                if(!foundByID){
                    employeeStack.pop();
                }else {
                    System.out.println("---- founded employee below :");
                    System.out.println(employeeStack.peek().toString());
                    break;
                }
            }
        }catch (EmptyStackException ex){
            System.out.println("Key invalid, please try again");
            findEmployeeFromResume();
        }
        backMainMenu();
    }
}