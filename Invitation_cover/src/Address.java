/**
 * Created by sanjitd on 07/03/16.
 */
public class Address {
    private final String city;
    private final String state;
    private final String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
    public String getCountry(){
        return country;
    }
}
