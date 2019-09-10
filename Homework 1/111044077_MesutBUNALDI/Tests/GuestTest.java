import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;


public class GuestTest extends MyHotelObject {

    @Test
    public void getHotel() {
        Hotel hotel=new Hotel();
        Guest guest=new Guest(hotel);
        assertEquals("default",guest.getHotel().getName());
    }

    @Test
    public void getUserTypeName() throws IOException {
        Guest mesut=new Guest();
        assertEquals("Guest",mesut.getUserTypeName());
    }


}