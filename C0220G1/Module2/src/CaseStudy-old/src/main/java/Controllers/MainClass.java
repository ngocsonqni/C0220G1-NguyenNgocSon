package Controllers;

import com.opencsv.CSVWriter;
import com.opencsv.CSVReader;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws IOException {
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
                                    String[] headerRecord = { "nameServices", "area", "costServices", "accompanying", "typeRent",
                                            "roomStandard", "otherAmenities", "areaPool", "numFloor"};
                                    csvWriter.writeNext(headerRecord);
                                    csvWriter.writeNext(new String[] { "villa","20","100","50","2 ngay",
                                            "vip","khong co","50","2"});
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
                                    String[] headerRecord = { "nameServices", "area", "costServices", "accompanying", "typeRent",
                                            "roomStandard", "otherAmenities","numFloor"};
                                    csvWriter.writeNext(headerRecord);
                                    csvWriter.writeNext(new String[] { "house","20","100","50","2 ngay",
                                            "vip","khong co","2"});
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
                                    String[] headerRecord = { "nameServices", "area", "costServices", "accompanying", "typeRent",
                                            "freeService"};
                                    csvWriter.writeNext(headerRecord);
                                    csvWriter.writeNext(new String[] { "room","20","100","50","2 ngay", "khong co"});
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
}
