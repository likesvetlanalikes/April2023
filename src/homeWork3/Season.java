package homeWork3;


public class Season {
    public void mounth(MONTH_NAME monthName) {
        switch (monthName) {
            case DESEMBER:
            case JUNUARY:
            case FEBRYARY:
                System.out.println("Winter");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("Spring");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("Summer");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("Autumn");


        }

    }
}
