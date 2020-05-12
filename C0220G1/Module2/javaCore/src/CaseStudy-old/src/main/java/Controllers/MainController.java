package Controllers;




public class MainController {
    public void displayMainMenu(){
        System.out.println("----------------------------------------------------");
        System.out.println("1. Add New Services\n2. Show Services\n*3. Add New Customer\n" +
                           "*4. Show Information of Customer\n*5. Add New Booking\n*6. Show Information of Employee\n"+
                           "*7. Booking Movie Ticket 4D\n*8. Find Employee\n9. Exit");
    }
    public void addNewServices(){
        System.out.println("----------------------------------------------------");
        System.out.println("1. Add New Villa\n2. Add New House\n3. Add New Room\n4. Back to menu\n5. Exit");
    }
    public void showServices(){
        System.out.println("----------------------------------------------------");
        System.out.println("1. Show all Villa\n2. Show all House\n3. Show all Room\n*4. Show All Name Villa Not Duplicate\n"+
                           "*5. Show All Name House Not Duplicate\n*6. Show All Name Name Not Duplicate\n7. Back to menu\n8. Exit");
    }
}
