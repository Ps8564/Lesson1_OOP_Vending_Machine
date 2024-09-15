public class Main {
    public static void main(String[] args) {
        HotDrinkMachine machine = new HotDrinkMachine();
        HotDrink drink1 = machine.getProduct("Tea", 250, 80);
        HotDrink drink2 = machine.getProduct("Coffee", 200, 90);

        System.out.println("Drink 1: " + drink1.name + ", Volume: " + drink1.volume + "ml, Temperature: " + ((HotDrinkWithTemperature) drink1).temperature + "°C");
        System.out.println("Drink 2: " + drink2.name + ", Volume: " + drink2.volume + "ml, Temperature: " + ((HotDrinkWithTemperature) drink2).temperature + "°C");
    }
}