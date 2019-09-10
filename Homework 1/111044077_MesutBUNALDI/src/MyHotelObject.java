
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

public abstract class MyHotelObject implements HotelManagement {
    private int id=0;
    public static  BufferedReader getUserData;
    public MyHotelObject() {



    }

    public MyHotelObject(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Id{"+(id)+" \n";
    }
}
