import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;



public class mainTest extends MyHotelObject {


    public void mainTest(String testFileName) throws Exception {
        try {

            System.out.println("GTU - HOTEL MANAGEMENT SYSTEM\n");
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////Polimorfizm örnek çağrı////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            User[] polymorphicCallUser = new User[4];

            Guest guests = new Guest(123, "Kamile Misafir");
            Receptionist receptionist = new Receptionist(112, "Müjgan Çalışan");

            polymorphicCallUser[0] = receptionist;
            polymorphicCallUser[1] = guests;
            polymorphicCallUser[2] = receptionist;
            polymorphicCallUser[3] = guests;


            for (int i = 0; i < polymorphicCallUser.length; i++) {
                System.out.println(polymorphicCallUser[i].toString());
            }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


            getUserData = new BufferedReader(new FileReader(testFileName));

            Hotel myhotel = new Hotel(90);

            int a = 0, userType = 0;
            myhotel.drawHotelRoom();


            a = myhotel.chooseUserType();

            userType = a;
            if (userType == 1) {
                Guest guest = new Guest(myhotel);

                if (guest.login(null, null) == true) {

                    int choose = -1;
                    while (choose != 0) {

                        choose = guest.chooseProccess(0);
                        if (choose == 1) {
                            myhotel = guest.booking(false);
                            myhotel.drawHotelRoom();
                            myhotel.writeToFile();
                        } else if (choose == 2) {
                            myhotel = guest.cancel(false);
                            myhotel.drawHotelRoom();
                            myhotel.writeToFile();
                        }

                    }

                }

            } else if (userType == 2) {
                //receptionist işlemlerini yapacağız
                Receptionist recep = new Receptionist(myhotel);
                if (true == recep.login(null, null)) {

                    int choose = -1;
                    while (choose != 0) {
                        choose = recep.chooseProccess(false);
                        if (choose == 1) {
                            myhotel = recep.booking(false);
                            myhotel.drawHotelRoom();
                            myhotel.writeToFile();

                        } else if (choose == 2) {
                            myhotel = recep.cancel(false);
                            myhotel.drawHotelRoom();
                            myhotel.writeToFile();

                        } else if (choose == 3) {
                            myhotel = recep.checkin(false);
                            myhotel.drawHotelRoom();
                            myhotel.writeToFile();

                        } else if (choose == 4) {
                            myhotel = recep.checkout(false);
                            myhotel.drawHotelRoom();
                            myhotel.writeToFile();
                        }


                    }
                }

            }


        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}
