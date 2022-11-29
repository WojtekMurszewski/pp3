public class Autor {

    private String name;
    private String surname;
    private int age;
    private boolean isFamous;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isFamous() {
        return isFamous;
    }

    public void setFamous(boolean isFamous) {
        this.isFamous = isFamous;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Autor(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    

}
