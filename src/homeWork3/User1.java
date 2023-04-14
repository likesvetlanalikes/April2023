package homeWork3;

public class User1 {
    public enum USER {
        USER1 ("Slava", "Ivanov", 25, "M"),
        USER2 ("Volha", "Krautsova", 41, "W"),
        USER3 ("Misha", "Popov", 38, "M"),
        USER4 ("Oksana", "Minina", 31, "W");

        private String name;
        private String surname;
        private int age;
        private String gender;

        USER(String name, String surname, int age, String gender) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.gender = gender;
        }
        public void println(){
            System.out.println(name +" "+ surname);
        }
        public void addAge(int addAge){
            age += addAge;
            System.out.println(age);
        }
        public void printUser() {
            System.out.println("имя: " +name +", фамилия: "+ surname +", возраст: "+ age +",  пол: "+ gender);
        }

    }
}
