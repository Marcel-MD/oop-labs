package md.utm.marcel.lab6;

public class Address {
    private String city;
    private String sector;
    private String street;

    public Address(String city, String sector, String street) {
        this.city = city;
        this.sector = sector;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", sector='" + sector + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
