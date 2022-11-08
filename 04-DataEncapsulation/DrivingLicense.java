public class DrivingLicense {
    
    private String driversName;
    private String driversSurname;
    private String city;
    private String postalCode;
    private int licenseNumber;
    private int yearOfIssue;
    private String licenseCategory;

    public void display(){
        System.out.println(driversName);
    }

    //name
    public String getName(){
        return driversName;
    }

    public void setName(String driversName){
        driversName = driversName.substring(beginIndex:0, endIndex:1).toUpperCase()+driversName.substring(beginIndex:1).toLowerCase();
        this.driversName=driversName;
    }

    //surname
    public String getSurname(){
        return driversName;
    }

    public void setSurname(String surname){
        this.driversSurname=surname;
    }

    //city
    public String getCity(){
        return city;
    }

    public void setCity(String cityName){
        this.city=cityName;
    }

    //year of issue
    public int getYearOfIssue(){
        return yearOfIssue;
    }

    public void setYearOfIssue(int year){
        this.yearOfIssue=year;
    }


    
}
