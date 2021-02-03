public class userInput {

    private String nameUser;
    private String contactNumber;
    private String address;
    private String temperature;
    private String birthdate;


    public String getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getTemperature() {
        return temperature;
    }
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getContactNumber() {
        return contactNumber;
    }

    public void setName(String name){
        this.nameUser = name;
    }
    public String getName(){
        return nameUser;
    }

}
