public class Main {
    public static void main(String[] args) {
        // Стоимость билета в копейках
        int ticket_cost = 7900_00;
        int bonus_miles = (int) (ticket_cost*0.05/100);
        System.out.println(bonus_miles);
    }
}