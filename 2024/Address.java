public class Address {
    private String city;
    private String region;
    private String district;
    private String country;

    public Address(String city, String region, String district, String country) {
        this.city = city;
        this.region = region;
        this.district = district;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    

    

}
