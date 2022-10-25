import java.util.Date;

public class User{
    private Date birthdate;
    private int size;
    private Photo[] photos;
    private Address address ; 



    public int getSize() {
        return this.size;
    }

    public Address getAddress(){
        return this.address;
    }

    public Date getBirthdate(){
       return  this.birthdate;
    }

    public Photo [] getPhotos(){
        return this.photos;
    }


}