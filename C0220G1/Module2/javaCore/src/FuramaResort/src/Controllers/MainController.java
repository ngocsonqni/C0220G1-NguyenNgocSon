package Controllers;

import Commons.ScannerUtils;

import static Commons.Menu.*;
import static Controllers.BookingControllers.addNewBooking;
import static Controllers.BookingControllers.bookingMovieTicket4D;
import static Controllers.CustomerControllers.addNewCustomer;
import static Controllers.CustomerControllers.showInformationCustomers;
import static Controllers.EmployeeController.findEmployee;
import static Controllers.EmployeeController.showInformationEmployees;
import static Controllers.ServiceControllers.addNewServies;
import static Controllers.ServiceControllers.processMenuShowService;

public class MainController {
   public static void processMain(){
       try{
           displayMainMenu();
           processMainMenu();
       }catch (Exception e){
           backMainMenu();
       }
   }



    public static void processMainMenu(){
       switch (ScannerUtils.scanner.nextInt()) {
           case 1: {
               addNewServies();
               break;
           }
           case 2: {
               showServices();
               break;
           }
           case 3: {
               addNewCustomer();
               break;
           }
           case 4: {
               showInformationCustomers();
               break;
           }
           case 5: {
               addNewBooking();
               break;
           }
           case 6: {
               showInformationEmployees();
               break;
           }
           case 7: {
               bookingMovieTicket4D();
               break;
           }
           case 8: {
               findEmployee();
               break;
           }
           case 9: {
               System.exit(0);
               break;
           }
           default:{
               System.out.println("Error!!! Enter to back Menu");
               ScannerUtils.scanner.nextLine();
               backMainMenu();
           }
       }
   }

    public static void backMainMenu() {
       displayMenuBackToMain();
       processMain();
    }

    public static void showServices() {
        displayMenuShowServices();
        processMenuShowService();
    }


}
