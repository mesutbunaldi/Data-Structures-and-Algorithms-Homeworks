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



public class User extends MyHotelObject {
    private String name = "noname";
    private String surname;
    protected int userType;
    protected Hotel hotel;

    public User() {

    }

    public User(int id, String name) {
        super(id);
        this.name = name;
        this.surname = surname;

    }

    public User(Hotel hotelVal) {
        this.hotel = hotelVal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public boolean login(String name, String pass) throws IOException {
        String userName = name;
        String password = pass, line = "";
        String filePath = null;
        String[] tmpUsers;
        boolean check = false;
        while (check == false) {


            if (userName == null && password == null) {
                System.out.println("\n\nKullanıcı Adını Girin : ");
                userName = this.getUserData.readLine();
                System.out.println("Şifre Girin : ");
                password = this.getUserData.readLine();
            }


            BufferedReader getUserData2 = new BufferedReader(new FileReader("users.csv"));

            while ((line = getUserData2.readLine()) != null) {
                tmpUsers = line.split(",");

                if (userName.equals(tmpUsers[2]) && password.equals(tmpUsers[4])) {
                    System.out.println("Giriş başarılı tebrikler "+userName );

                    this.setId(Integer.parseInt(tmpUsers[0]));
                    this.setUserType(Integer.parseInt(tmpUsers[1]));
                    this.setName(tmpUsers[2]);
                    this.setSurname(tmpUsers[3]);
                    check = true;

                    return true;
                }

            }


        }
        System.out.println("Kullanıcı adı veya şifreyi yanlış girdiniz.");
        return false;
    }

    public Hotel booking(boolean check) throws IOException {
        int roomId = 0;
        if (check == true) {
            roomId = getRoomId(0);
        } else if (check == false) {
            roomId = getRoomId(1);
        }
        if (this.hotel.getRooms()[roomId].getStatement() == '.') {
            this.hotel.getRooms()[roomId].setStatement('O');
            //burada log file üzerne kayıt yapmalıyız
            FileWriter writeLog = new FileWriter("logs.csv", true);
            writeLog.write("" + this.getId() + "," + getUserType() + "," + this.hotel.getRooms()[roomId].getId() + "," + this.getName() + ",reservation\n");
            writeLog.close();
            System.out.println("Rezervasyon başarıyla tamamlandı Oda : "+this.hotel.getRooms()[roomId].getId());
        }
        return this.hotel;
    }

    public int getRoomId(int temp) throws IOException {

        int roomId;
        if (temp != 0) {
            System.out.println("\n\nOda Numarasını Girin : ");
            roomId = Integer.parseInt(getUserData.readLine()) - 1;
        } else
            roomId = temp;


        return roomId;
    }




    public Hotel cancel(boolean check) throws IOException {
        BufferedReader getLogs = new BufferedReader(new FileReader("logs.csv"));
        String[] tmpLog;
        String line;
        int roomId;
        if (check == true)
            roomId = 1;
        else
            roomId = getRoomId(1) + 1;
        while ((line = getLogs.readLine()) != null) {
            tmpLog = line.split(",");

            if (tmpLog[0].equals(String.valueOf(this.getId()))) {

                if (tmpLog[2].equals(String.valueOf(roomId))) {

                    BufferedReader getRoom = new BufferedReader(new FileReader("rooms.csv"));
                    String[] tmpRoom;
                    String roomLine;
                    while ((roomLine = getRoom.readLine()) != null) {
                        tmpRoom = roomLine.split(",");
                        if (tmpRoom[0].equals(String.valueOf(roomId)) && (tmpRoom[1].equals(String.valueOf('O')))) {

                            hotel.getRooms()[roomId - 1].setStatement('.');
                            FileWriter writeLog = new FileWriter("logs.csv", true);
                            writeLog.write("" + this.getId() + "," + getUserType() + "," + (hotel.getRooms()[roomId].getId()-1) + "," + this.getName() + ",cancel\n");
                            writeLog.close();
                            System.out.println("Rezervasyon iptal edildi. Oda : "+(this.hotel.getRooms()[roomId].getId()-1));
                            return hotel;
                        }
                    }
                }
            }
        }
        return hotel;
    }
    public int chooseProccess(int temp) throws IOException {

        int proccessType;
        if (temp != -1) {

            System.out.println("\n1-Reservation\n2-Cancel Reservation\n0-Exit\n");
            proccessType = Integer.parseInt(getUserData.readLine());


        } else
            proccessType = temp;


        return proccessType;
    }
}
