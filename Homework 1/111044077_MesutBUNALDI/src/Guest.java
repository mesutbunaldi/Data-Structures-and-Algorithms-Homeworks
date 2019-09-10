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

import java.io.IOException;

public class Guest extends User {


    public String userTypeName = "Guest";

    public Guest() {

    }

    public Guest(Hotel hotelVal) {
        this.hotel = hotelVal;
    }

    public Hotel getHotel() {
        return hotel;
    }


    public Guest(int id, String name) {
        super(id, name);

        this.userTypeName = userTypeName;
    }


    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    public String toString() {
        return "Guest:" +
        "userTypeName='" + userTypeName + '\'' +
                " " + super.toString();
    }




}
