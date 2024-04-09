public class Main {
    public static void main(String[] args) {
        Airline[] flights = new Airline[3];
        flights[0] = new Airline();
        flights[0].setAppointment("London");
        flights[0].setFlyNum(123);
        flights[0].setPlane("Boeing 747");
        flights[0].setTimeStart(9.30f);
        flights[0].setDays("Monday");

        flights[1] = new Airline();
        flights[1].setAppointment("Paris");
        flights[1].setFlyNum(456);
        flights[1].setPlane("Airbus A320");
        flights[1].setTimeStart(12.45f);
        flights[1].setDays("Wednesday");

        flights[2] = new Airline();
        flights[2].setAppointment("New York");
        flights[2].setFlyNum(789);
        flights[2].setPlane("Boeing 787");
        flights[2].setTimeStart(18.15f);
        flights[2].setDays("Friday");

        System.out.println("Список рейсів:");
        for (Airline flight : flights) {
            System.out.println("Пункт призначення: " + flight.getAppointment());
            System.out.println("Номер рейсу: " + flight.getFlyNum());
            System.out.println("Тип літака: " + flight.getPlane());
            System.out.println("Час вильоту: " + flight.getTimeStart());
            System.out.println("Дні тижня: " + flight.getDays());
            System.out.println();
        }
    }
}

class Airline {
    private String appointment;
    private int flyNum;
    private String plane;
    private float timeStart;
    private String days;

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public int getFlyNum() {
        return flyNum;
    }

    public void setFlyNum(int flyNum) {
        this.flyNum = flyNum;
    }

    public String getPlane() {
        return plane;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }

    public float getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(float timeStart) {
        this.timeStart = timeStart;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }
}
