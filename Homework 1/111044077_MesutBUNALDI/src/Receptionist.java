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

public class Receptionist extends User {
    private String userTypeName = "Receptionist";
    private String password;

    public Receptionist() {

    }

    public Receptionist(Hotel hotelVal) {
        this.hotel = hotelVal;
    }

    public Receptionist(int id, String name) {
        super(id, name);
        this.userTypeName = userTypeName;

    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "Receptionist:" +
                "userTypeName='" + userTypeName + '\'' +
                " " + super.toString();
    }

    public Hotel checkin(boolean check) throws IOException { //checkin ,checkout

        int roomId = 0;
        if (check == false) {
            roomId = getRoomId(1);
        }

        if (hotel.getRooms()[roomId].getStatement() == 'O') {
            hotel.getRooms()[roomId].setStatement('X');
            //burada log file üzerne kayıt yapmalıyız
            FileWriter writeLog = new FileWriter("logs.csv", true);
            writeLog.write("" + this.getId() + "," + getUserType() + "," + hotel.getRooms()[roomId].getId() + "," + this.getName() + ",checkin\n");
            this.hotel.writeToFile();
            writeLog.close();
            System.out.println("Check-in başarıyla tamamlandı!");
        }
        return hotel;

    }

    public Hotel checkout(boolean check) throws IOException {
        int roomId = 0;
        if (check == true)
            roomId = getRoomId(0);
        else
            roomId = getRoomId(1);

        if (this.hotel.getRooms()[roomId].getStatement() == 'X') {
            this.hotel.getRooms()[roomId].setStatement('.');//
            this.hotel.writeToFile();
            FileWriter writeLog = new FileWriter("logs.csv", true);
            writeLog.write("" + this.getId() + "," + getUserType() + "," + hotel.getRooms()[roomId].getId() + "," + this.getName() + ",check-out\n");
            writeLog.close();
            System.out.println("Check-out başarıyla tamamlandı!");
        }

        return hotel;
    }



    public int chooseProccess(boolean check) throws IOException {


        int proccessType;

        if (check == true) {
            proccessType = -1;
        } else {
            System.out.println("\n1-Reservation\n2-Cancel Reservation\n3-Check-in\n4-Check-out\n0-Exit\n");
            proccessType = Integer.parseInt(getUserData.readLine());
        }
        return proccessType;
    }

}