public class Address {
    private int  number;
    private String street;
    private String city;
    private String country;

    public Address(int  number, String street, String city, String country) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getStreet(){
        return this.street;

    }

    public void setStreet(String street){
        this.street=street;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number=number;
    }
public String getCountry(){
    return this.country;
    
}
}