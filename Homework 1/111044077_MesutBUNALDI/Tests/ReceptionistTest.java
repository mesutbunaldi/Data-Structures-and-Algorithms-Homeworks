import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ReceptionistTest {

    @Test
    public void checkin() throws IOException {
        Receptionist user=new Receptionist();
        user.setId(3);
        user.setUserType(2);
        user.setName("meltem");
        user.setPassword("sifre000");
        Hotel hotel=new Hotel(90);
        user.hotel=hotel;
        hotel=user.booking(true);
        hotel=user.checkin(true);
        assertEquals('X',hotel.getRooms()[0].getStatement());
    }

    @Test
    public void checkout() throws IOException {
        Receptionist user=new Receptionist();
        user.setId(3);
        user.setUserType(2);
        user.setName("bünyamin");
        user.setPassword("sifre000");
        Hotel hotel=new Hotel(90);
        user.hotel=hotel;
        hotel=user.booking(true);
        hotel=user.checkin(true);
        hotel=user.checkout(true);
        assertEquals('.',hotel.getRooms()[0].getStatement());
    }

    @Test
    public void chooseProccess() throws IOException {
        Receptionist recep=new Receptionist();
        assertEquals(-1,recep.chooseProccess(true));
    }
}