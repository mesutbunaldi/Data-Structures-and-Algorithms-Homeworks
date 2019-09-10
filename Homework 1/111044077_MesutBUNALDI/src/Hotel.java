import com.sun.org.apache.xpath.internal.SourceTree;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/*
 * NAME          : MESUT
 * SURNAME       : BUNALDI
 * STUDENT ID    : 111044077
 * HOMEWORK      : 01
 *
 *
 *
 *
 * */

import java.io.*;

public class Hotel extends MyHotelObject {


    private int countOfRoom = 1;

    private String name = "default";
    private Room[] hotelRoom;

    public Hotel(int countOfRoomVal) throws IOException {
        countOfRoom = countOfRoomVal;
        hotelRoom = new Room[countOfRoomVal];
        initializeRooms();
    }

    public Hotel() {

    }


    public int getCountOfRoom() {
        return countOfRoom;
    }

    public Room[] getRooms() {

        return this.hotelRoom;
    }

    public void initializeRooms() throws IOException {
        BufferedReader getUserData = new BufferedReader(new FileReader("rooms.csv"));
//
//
        getUserData.readLine();
        if (getUserData.readLine() != null) {

            updateRoom();
            getUserData.close();

        } else {
            FileWriter writeLog = new FileWriter("rooms.csv", false);
            for (int i = 0; i < countOfRoom; i++) {
                hotelRoom[i] = new Room();
                hotelRoom[i].setId(i + 1);
                hotelRoom[i].setStatement('.');

                writeLog.write(hotelRoom[i].getId() + "," + hotelRoom[i].getStatement() + "\n");


            }

            writeLog.close();

        }


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int chooseUserType() throws IOException {

        String userType;


        System.out.println("\nUser Tipini Girin :\n1-Guest\n2-Receptionist\n ");
        userType = (getUserData.readLine());

        if (userType == String.valueOf(1))
            System.out.println("Guest olarak giriş yapıyorsunuz.\n");
        else if (userType == String.valueOf(2))
            System.out.println("Receptionist olarak giris yapıyorsunuz.\n");

        return Integer.parseInt(userType);
    }


    public boolean drawHotelRoom() {
        int counter = 1;
        System.out.print("\n      ");
        for (int i = 1; i <= 10; ++i)
            System.out.print(i + ".Oda  ");
        for (int i = 0; i < this.getCountOfRoom(); i++) {

            if (i % 10 == 0) {
                System.out.print("\nKat " + (counter++) + "   ");
            }
            System.out.print(hotelRoom[i].getStatement() + "      ");
        }
        return true;
    }


    //doysyadan okuyup otel odalarını initial ediyoruz
    public void updateRoom() throws IOException {

        BufferedReader getUserData = new BufferedReader(new FileReader("rooms.csv"));
        String[] tmpRooms;
        String line;
        int counter = 0;
        while ((line = getUserData.readLine()) != null) {
            tmpRooms = line.split(",");
            hotelRoom[counter] = new Room();
            hotelRoom[counter].setId(Integer.parseInt(tmpRooms[0]));
            hotelRoom[counter].setStatement((tmpRooms[1].toCharArray()[0]));
            counter++;

        }

    }

    public void writeToFile() throws IOException {
        FileWriter writeLog = new FileWriter("rooms.csv", false);
        for (int i = 0; i < this.getCountOfRoom(); i++) {
            writeLog.write(hotelRoom[i].getId() + "," + hotelRoom[i].getStatement() + "\n");


        }
        writeLog.close();
    }
}
