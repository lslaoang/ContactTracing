import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class compressInfo{

    private String INFO;
    userInput input = new userInput();


    //Using local method
    private String getPrimeInfo(String name, String address, String birthday)  {

        String compInfo = name  +","+ address +","+ birthday;
        return  compInfo;
    }

    private String getAddInfo(String contactNumber, double temperature){
        String addInfo = contactNumber +","+ temperature;
        return addInfo;
    }

    //Using getter and setter from other class
    private  void setValues(){

        input.setName("Juan");
        input.setContactNumber("63xx");
        input.setAddress("Makati");
        input.setTemperature("36.6");
        input.setBirthdate("08/15/199X");

        INFO = input.getName()+"\n"
                +input.getAddress()+"\n"
                +input.getBirthdate()+"\n"
                +input.getContactNumber()+"\n"
                +input.getTemperature();
    }


    public static void main(String args[])  {
        compressInfo comp = new compressInfo();
        comp.INFO = comp.getPrimeInfo("Lao","Makati","08/15/1993")+","
                        + comp.getAddInfo("094979333",36.6);

        System.out.println(comp.INFO);

        comp.setValues();

        System.out.println(comp.INFO);

    }


}
