package seminar1.seminarDj.task1.gb.task4.task2;

public class HolidayReminder {
    public void printHolidays(Month month) {

        switch (month) {

            case JANUARY:
                System.out.println("Новый Год");
                break;
            case FEBRUARY:
                System.out.println("23 февраля");
                break;
            case MARCH:
                System.out.println("8 марта");
                break;
        }
    }
}
