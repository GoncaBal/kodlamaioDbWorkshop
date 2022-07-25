public class Address {
    private int id;
    private Customer customer;
    private String addressDetail;
    private String countryName;
    private String districtName;
    private String cityName;

    public Address() {
    }

    public Address(int id, Customer customer, String addressDetail, String countryName, String districtName, String cityName) {
        this.id = id;
        this.customer = customer;
        this.addressDetail = addressDetail;
        this.countryName = countryName;
        this.districtName = districtName;
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
