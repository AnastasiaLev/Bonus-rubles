public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 1100;
        int amount = balance + replenishment;
        int percent;
        if (replenishment > 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int rub = replenishment / 100 * percent;
        int total = amount + rub;
        System.out.println ("Бонусные рубли: " + rub );
        System.out.println("Баланс: " + total );
}
}