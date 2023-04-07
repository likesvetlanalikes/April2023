package homeWork3;
            import java.util.Scanner;

    // Создаем перечисление Season, в котором указываем соответствующие поры года
    enum Season {
        WINTER,
        SPRING,
        SUMMER,
        FALL
    }

    public class SeasonEnum {
        public static void test10(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите название месяца: ");
            String monthName = scanner.next().toUpperCase();

            Season season;
            switch (monthName) {
                case "JANUARY":
                case "FEBRUARY":
                case "DECEMBER":
                    season = Season.WINTER;
                    break;
                case "MARCH":
                case "APRIL":
                case "MAY":
                    season = Season.SPRING;
                    break;
                case "JUNE":
                case "JULY":
                case "AUGUST":
                    season = Season.SUMMER;
                    break;
                case "SEPTEMBER":
                case "OCTOBER":
                case "NOVEMBER":
                    season = Season.FALL;
                    break;
                default:
                    System.out.println("Ошибка: некорректное название месяца");
                    return;
            }

            System.out.println("Месяц " + monthName + " относится к поре года: " + season);
        }
    }
```

  //  Здесь мы создаем перечисление Season, которое содержит 4 значения: WINTER, SPRING, SUMMER, FALL. Затем мы используем объект Scanner для считывания ввода пользователя и преобразуем введенное значение в верхний регистр с помощью метода toUpperCase(). Далее мы используем оператор switch для определения поры года в зависимости от введенного месяца. Если введенное значение не соответствует ни одному из месяцев, мы выводим сообщение об ошибке. В конце мы выводим ответ пользователю.
}
