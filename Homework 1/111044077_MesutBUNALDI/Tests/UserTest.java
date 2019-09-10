import org.junit.Test;

import javax.jws.soap.SOAPBinding;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void login() throws IOException {
        User user=new User();
        assertTrue(user.login("mesut", "sifre123"));
    }

    @Test
    public void booking() throws IOException {
        User user=new User();
        user.setId(1);
        user.setUserType(1);
        user.setName("mesut");

        Hotel hotel=new Hotel(90);
        user.hotel=hotel;
        hotel=user.booking(true);
        assertEquals('O',hotel.getRooms()[0].getStatement());
    }

    @Test
    public void getRoomId() {
        User user=new User();
        assertEquals(0,user.getId());
    }

    @Test
    public void chooseProccess() throws IOException {
        User user=new User();
        assertEquals(-1,user.chooseProccess(-1));
    }

    @Test
    public void cancel() throws IOException {
        User user=new User();
        user.setId(3);
        user.setUserType(2);
        user.setName("hasan");
        Hotel hotel=new Hotel(90);
        user.hotel=hotel;
        hotel=user.cancel(true);
        assertEquals('.',hotel.getRooms()[0].getStatement());
    }
}