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

public class Room extends MyHotelObject {


    public char statement = '.'; //. : empty room , X : full room , O : reserve room

    public Room() {

    }

    public Room(char statement) {
        this.statement = statement;
    }

    public Room(int id, char statement) {
        super(id);
        this.statement = statement;
    }

    public char getStatement() {
        return statement;
    }

    public void setStatement(char statement) {
        this.statement = statement;
    }

    public String toString() {
        return String.valueOf(getStatement());
    }


}
