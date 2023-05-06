package homeWork3;

public class USER {
    USER1("Masha", "Petrova", 27, 'W', new UserAdress("Republic of Belarus", "Minsk")),
    USER2("Ivan", "Sidorov", 47, 'M', new UserAdress("Russia", "Moscow")),
    USER3("Anna", "Ivanova", 36, 'W', new UserAdress("Ukraine", "Kiev"));

    private String name;
    private String lastname;
    private int age;
    private char gender;
    private UserAdress adress;

    USER(String name, String lastname, int age, char gender, UserAdress adress) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.adress = adress;
    }

    public void printNameAndLastname() {
        System.out.println("Полное имя пользователя: " + name + " " + lastname);
    }

    public int upAge(int plusAge) {
        age += plusAge;
        {
            System.out.println("Если увеличить возраст пользователя на " + plusAge + " лет, то он будет равен " + age);
        }
        return age;

    }

    public void printUserIfo() {
        System.out.println("Полная информация о пользователе: " + name + " " + lastname + " "
                + age + " " + gender);
    }

    public static class UserAdress {
        private String country;
        private String city;

        public UserAdress(String country, String city) {
            this.country = country;
            this.city = city;
        }

        public void printAdress() {
            System.out.println("Пользователь живет в " + country + " в городе " + city);
        }


    }
}
