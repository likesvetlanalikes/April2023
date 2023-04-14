package homeWork3;

public class SeasonM {
    public void NewSeason(Month month) {

        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println("зима");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("весна");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("лето");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("осень");
                break;
        }
    }
}
