package Controllers;

import com.opencsv.CSVWriter;
import com.opencsv.CSVReader;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        int a=1;
        String b="a";

        System.out.println(a+b);
        Scanner scanner=new Scanner(System.in);
        MainController controller=new MainController();
        int choiceMain,choiceAdd,choiceShow;
        boolean checkMainChoice, checkAdd, checkShow;

        controller.displayMainMenu();
        choiceMain=scanner.nextInt();

        checkMainChoice=true;
        while (checkMainChoice){
            switch (choiceMain){
                case 1:
                    controller.addNewServices();
                    choiceAdd=scanner.nextInt();
                    checkAdd=true;
                    while (checkAdd){
                        switch (choiceAdd){
                            case 1:
                                String villa = "src/main/java/Data/Villa.csv";
                                try (Writer writer = new FileWriter(villa);
                                     CSVWriter csvWriter = new CSVWriter(writer,
                                             CSVWriter.DEFAULT_SEPARATOR,
                                             CSVWriter.NO_QUOTE_CHARACTER,
                                             CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                                             CSVWriter.DEFAULT_LINE_END);) {
                                    String[] headerRecord = {"NameServicesCode","nameServices", "area", "costServices", "accompanying", "typeRent",
                                            "roomStandard", "otherAmenities", "areaPool", "numFloor"};
                                    csvWriter.writeNext(headerRecord);
                                    String[] addVilla=new String[10];
                                    addVilla[0]=validateNameServicesCode(choiceAdd,addVilla[0]);
                                    addVilla[1]=validateNameServices(addVilla[1]);
                                    addVilla[2]=validateArea(addVilla[2]);
                                    addVilla[3]=validateCostServices(addVilla[3]);
                                    addVilla[4]=validateAccompanying(addVilla[4]);
                                    addVilla[5]=validateTypeRent(addVilla[5]);
                                    addVilla[6]=validateRoomStandard(addVilla[6]);
                                    addVilla[7]=validateOtherAmenities(addVilla[7]);
                                    addVilla[8]=validateAreaPool(addVilla[8]);
                                    addVilla[9]=validateNumFloor(addVilla[9]);

                                    csvWriter.writeNext(addVilla);
                                    System.out.println("Da them thong tin cua villa");
                                }
                                controller.addNewServices();
                                choiceAdd=scanner.nextInt();
                                break;
                            case 2:
                                String house = "src/main/java/Data/House.csv";
                                try (Writer writer = new FileWriter(house);
                                     CSVWriter csvWriter = new CSVWriter(writer,
                                             CSVWriter.DEFAULT_SEPARATOR,
                                             CSVWriter.NO_QUOTE_CHARACTER,
                                             CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                                             CSVWriter.DEFAULT_LINE_END);) {
                                    String[] headerRecord = {"NameServicesCode","nameServices", "area", "costServices", "accompanying", "typeRent",
                                            "roomStandard", "otherAmenities","numFloor"};
                                    csvWriter.writeNext(headerRecord);
                                    String[] addHouse=new String[10];
                                    addHouse[0]=validateNameServicesCode(choiceAdd,addHouse[0]);
                                    addHouse[1]=validateNameServices(addHouse[1]);
                                    addHouse[2]=validateArea(addHouse[2]);
                                    addHouse[3]=validateCostServices(addHouse[3]);
                                    addHouse[4]=validateAccompanying(addHouse[4]);
                                    addHouse[5]=validateTypeRent(addHouse[5]);
                                    addHouse[6]=validateRoomStandard(addHouse[6]);
                                    addHouse[7]=validateOtherAmenities(addHouse[7]);
                                    addHouse[8]=validateNumFloor(addHouse[8]);

                                    csvWriter.writeNext(addHouse);
                                    System.out.println("Da them thong tin cua house");
                                }
                                controller.addNewServices();
                                choiceAdd=scanner.nextInt();
                                break;
                            case 3:
                                String room = "src/main/java/Data/Room.csv";
                                try (Writer writer = new FileWriter(room);
                                     CSVWriter csvWriter = new CSVWriter(writer,
                                             CSVWriter.DEFAULT_SEPARATOR,
                                             CSVWriter.NO_QUOTE_CHARACTER,
                                             CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                                             CSVWriter.DEFAULT_LINE_END);) {
                                    String[] headerRecord = {"NameServicesCode","nameServices", "area", "costServices", "accompanying", "typeRent",
                                            "freeService"};
                                    csvWriter.writeNext(headerRecord);
                                    String[] addRoom=new String[10];
                                    addRoom[0]=validateNameServicesCode(choiceAdd,addRoom[0]);
                                    addRoom[1]=validateNameServices(addRoom[1]);
                                    addRoom[2]=validateArea(addRoom[2]);
                                    addRoom[3]=validateCostServices(addRoom[3]);
                                    addRoom[4]=validateAccompanying(addRoom[4]);
                                    addRoom[5]=validateTypeRent(addRoom[5]);
                                    addRoom[6]=validateFreeService(addRoom[6]);


                                    csvWriter.writeNext(addRoom);
                                    System.out.println("Da them thong tin cua room");
                                }
                                controller.addNewServices();
                                choiceAdd=scanner.nextInt();
                                break;
                            case 4:
                                controller.displayMainMenu();
                                choiceMain=scanner.nextInt();
//                                choiceAdd=0;
                                checkAdd=false;
                                break;
                            case 5:
                                System.out.println("Thoat chuong trinh chinh");
                                checkMainChoice=false;
                                checkAdd=false;
                                break;
                            default:
                                System.out.println("Nhap sai, yeu cau nhap lai (nhap tu 1-5):");
                                choiceAdd=scanner.nextInt();
                                break;
                        }
                    }
                    break;
                case 2:
                    controller.showServices();
                    choiceShow=scanner.nextInt();
                    checkShow=true;
                    while (checkShow){
                        switch (choiceShow){
                            case 1:
                                ArrayList<String> propertyShowVilla=new ArrayList<>();
                                ArrayList<String> showVilla=new ArrayList<>();

                                String csvVilla = "src/main/java/Data/Villa.csv";
                                try (Reader reader = new FileReader(csvVilla);
                                     CSVReader csvReader = new CSVReader(reader);) {
                                    String[] line;
                                    line=csvReader.readNext();
                                    for (int i=0;i<line.length;i++){
                                        propertyShowVilla.add(line[i]);
                                    }
                                    line=csvReader.readNext();
                                    for (int i=0;i<line.length;i++){
                                        showVilla.add(line[i]);
                                    }
                                }
                                for (int i=0;i<showVilla.size();i++){
                                    System.out.println(propertyShowVilla.get(i)+": "+showVilla.get(i));
                                }
                                controller.showServices();
                                choiceShow=scanner.nextInt();
                                break;
                            case 2:
                                ArrayList<String> propertyShowHouse=new ArrayList<>();
                                ArrayList<String> showHouse=new ArrayList<>();

                                String csvHouse = "src/main/java/Data/House.csv";
                                try (Reader reader = new FileReader(csvHouse);
                                     CSVReader csvReader = new CSVReader(reader);) {
                                    String[] line;
                                    line=csvReader.readNext();
                                    for (int i=0;i<line.length;i++){
                                        propertyShowHouse.add(line[i]);
                                    }
                                    line=csvReader.readNext();
                                    for (int i=0;i<line.length;i++){
                                        showHouse.add(line[i]);
                                    }
                                }
                                for (int i=0;i<showHouse.size();i++){
                                    System.out.println(propertyShowHouse.get(i)+": "+showHouse.get(i));
                                }
                                controller.showServices();
                                choiceShow=scanner.nextInt();
                                break;
                            case 3:
                                ArrayList<String> propertyShowRoom=new ArrayList<>();
                                ArrayList<String> showRoom=new ArrayList<String>();

                                String csvRoom = "src/main/java/Data/Room.csv";
                                try (Reader reader = new FileReader(csvRoom);
                                     CSVReader csvReader = new CSVReader(reader);) {
                                    String[] line;
                                    line=csvReader.readNext();
                                    for (int i=0;i<line.length;i++){
                                        propertyShowRoom.add(line[i]);
                                    }
                                    line=csvReader.readNext();
                                    for (int i=0;i<line.length;i++){
                                        showRoom.add(line[i]);
                                    }
                                }
                                for (int i=0;i<showRoom.size();i++){
                                    System.out.println(propertyShowRoom.get(i)+": "+showRoom.get(i));
                                }
                                controller.showServices();
                                choiceShow=scanner.nextInt();
                                break;
                            case 4:

                                break;
                            case 5:

                                break;
                            case 6:

                                break;
                            case 7:
                                controller.displayMainMenu();
                                choiceMain=scanner.nextInt();
                                choiceShow=0;
                                checkShow=false;
                                break;
                            case 8:
                                System.out.println("Thoat chuong trinh chinh");
                                checkMainChoice=false;
                                checkShow=false;
                                break;
                            default:
                                System.out.println("Nhap sai, yeu cau nhap lai (nhap tu 1-8):");
                                choiceShow=scanner.nextInt();
                                break;
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Thoat chuong trinh chinh");
                    checkMainChoice=false;
                    break;
                default:
                    System.out.println("Nhap sai, yeu cau nhap lai (nhap tu 1-9):");
                    choiceMain=scanner.nextInt();
                    break;
            }
        }
    }

//---------------------------------------------------------------------------------
    private static String validateNameServicesCode(int choiceAdd,String ServicesCode) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten dich vu villa (theo cu phap SVXX-YYYY, Y la so tu 0-9):");
        ServicesCode=scanner.nextLine();
        String nameVillaFormat = null;
        if(choiceAdd==1){
            nameVillaFormat="(SVVL-)[0-9]{4}";
        }else if (choiceAdd==2){
            nameVillaFormat="(SVHO-)[0-9]{4}";
        }else {
            nameVillaFormat="(SVRO-)[0-9]{4}";
        }
        while (!ServicesCode.matches(nameVillaFormat)){
            System.out.println("Nhap sai cu phap,yeu cau nhap lai!\nNhap ten dich vu villa (theo cu phap SVVL-YYYY, Y la so tu 0-9):");
            ServicesCode=scanner.nextLine();
        }
        return ServicesCode;
    }
    private static String validateNameServices(String nameServices){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten dich vu (viet hoa ki tu dau tien):");
        nameServices=scanner.nextLine();
        String nameServicesFormat="[A-Z][a-z]*?";
        while (!nameServices.matches(nameServicesFormat)){
            System.out.println("Nhap sai cu phap,yeu cau nhap lai!\nNhap ten dich vu (viet hoa ki tu dau tien):");
            nameServices=scanner.nextLine();
        }
        return nameServices;
    }
    private static String validateArea(String area){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap dien tich su dung (so thuc lon hon 30):");
        int areaInt=scanner.nextInt();

        while (areaInt<=30){
            System.out.println("Nhap sai cu phap,yeu cau nhap lai!\nNhap dien tich su dung (so thuc lon hon 30):");
            areaInt=scanner.nextInt();
        }
        return area=String.valueOf(areaInt);
    }
    private static String validateCostServices(String cost) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap chi phi thue (so duong):");
        int costInt=scanner.nextInt();
        while (costInt<=0){
            System.out.println("Nhap sai cu phap,yeu cau nhap lai!\nNhap chi phi thue (so duong):");
            costInt=scanner.nextInt();
        }
        return cost=String.valueOf(costInt);
    }
    private static String validateAccompanying(String accompanying) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so nguoi toi da (lon hon 0 va nho hon 20):");
        int accompanyingInt=scanner.nextInt();
        while (accompanyingInt<=0||accompanyingInt>=20){
            System.out.println("Nhap sai cu phap,yeu cau nhap lai!\nNhap so nguoi toi da (lon hon 0 va nho hon 20):");
            accompanyingInt=scanner.nextInt();
        }
        return accompanying=String.valueOf(accompanyingInt);
    }
    private static String validateTypeRent(String typeRent) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap kieu thue (viet hoa ki tu dau tien):");
        typeRent=scanner.nextLine();
        String typeRentFormat="[A-Z][a-z]*?";
        while (!typeRent.matches(typeRentFormat)){
            System.out.println("Nhap sai cu phap,yeu cau nhap lai!\nNhap kieu thue (viet hoa ki tu dau tien):");
            typeRent=scanner.nextLine();
        }
        return typeRent;
    }
    private static String validateRoomStandard(String roomStandard) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap tieu chuan phong (viet hoa ki tu dau tien):");
        roomStandard=scanner.nextLine();
        String roomStandardFormat="[A-Z][a-z]*?";
        while (!roomStandard.matches(roomStandardFormat)){
            System.out.println("Nhap sai cu phap,yeu cau nhap lai!\nNhap kieu thue (viet hoa ki tu dau tien):");
            roomStandard=scanner.nextLine();
        }
        return roomStandard;
    }
    private static String validateFreeService(String freeService) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap dich vu di kem (massage, karaoke, food, drink, car):");
        freeService=scanner.nextLine();
        String freeServiceFormat="(massage|karaoke|food|drink|car)";
        while (!freeService.matches(freeServiceFormat)){
            System.out.println("Nhap sai cu phap,yeu cau nhap lai!\nNhap dich vu di kem (massage, karaoke, food, drink, car):");
            freeService=scanner.nextLine();
        }
        return freeService;
    }
    private static String validateAreaPool(String area){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap dien tich ho boi(so thuc lon hon 30):");
        int areaInt=scanner.nextInt();

        while (areaInt<=30){
            System.out.println("Nhap sai cu phap,yeu cau nhap lai!\nNhap dien tich ho boi (so thuc lon hon 30):");
            areaInt=scanner.nextInt();
        }
        return area=String.valueOf(areaInt);
    }
    private static String validateNumFloor(String numFloor) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap chi phi thue (so duong):");
        int numFloorInt=scanner.nextInt();
        while (numFloorInt<=0){
            System.out.println("Nhap sai cu phap,yeu cau nhap lai!\nNhap chi phi thue (so duong):");
            numFloorInt=scanner.nextInt();
        }
        return numFloor=String.valueOf(numFloorInt);
    }
    private static String validateOtherAmenities(String otherAmenities) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap dich vu mien phi di kem (massage, karaoke, food, drink, car):");
        otherAmenities=scanner.nextLine();
        String otherAmenitiesFormat="(massage|karaoke|food|drink|car)";
        while (!otherAmenities.matches(otherAmenitiesFormat)){
            System.out.println("Nhap sai cu phap,yeu cau nhap lai!\nNhap dich vu mien phi di kem (massage, karaoke, food, drink, car):");
            otherAmenities=scanner.nextLine();
        }
        return otherAmenities;
    }
}
