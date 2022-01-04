package api.bestbuy.model;

public class StorePojo {



    private String name;
    private String type;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private double lat;
    private double lng;
    private String hours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }
    /*{
        "id": 4,
            "name": "Minnetonka",
            "type": "BigBox",
            "address": "13513 Ridgedale Dr",
            "address2": "",
            "city": "Hopkins",
            "state": "MN",
            "zip": "55305",
            "lat": 44.969658,
            "lng": -93.449539,
            "hours": "Mon: 10-9; Tue: 10-9; Wed: 10-9; Thurs: 10-9; Fri: 10-9; Sat: 10-9; Sun: 10-8",
            "createdAt": "2016-11-17T17:57:05.708Z",
            "updatedAt": "2016-11-17T17:57:05.708Z",
            "services": [
        {
            "id": 1,
                "name": "Geek Squad Services",
                "createdAt": "2016-11-17T17:56:35.881Z",
                "updatedAt": "2016-11-17T17:56:35.881Z",
                "storeservices": {
            "createdAt": "2016-11-17T17:57:09.213Z",
                    "updatedAt": "2016-11-17T17:57:09.213Z",
                    "storeId": 4,
                    "serviceId": 1
        }
        }*/

}
