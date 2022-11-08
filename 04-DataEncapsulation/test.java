public class test {
    
    public static void main(String[] args) {
        DrivingLicense d1 = new DrivingLicense();
        d1.driversName="Jan";
        d1.driversSurname="Kowalski";
        d1.city="Warsaw";
        d1.postalCode="00-222";
        d1.licenseNumber=123456;
        d1.yearOfIssue=2003;
        d1.licenseCategory="B2";
        
        public toString(){
            System.out.println(d1.getName());
            System.out.println(d1.getSurname());
            System.out.println(d1.getCity());
        }

        d1.display();
    }
}
