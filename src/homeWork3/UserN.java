package homeWork3;

public class UserN {
    private String name;
    private String surname;
    private int age;
    private String gender;

    public UserN (String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        System.out.println(name+" "+surname+" "+age+" "+gender);
    }

    public UserN(String name) {
        this();
        this.name = name;
        System.out.println("Constructor with name");
    }
    public UserN() {
        System.out.println("Constructor empty");
    }
}
