// Class HotDrinkMachine, implementing the VendingMachine interface
public class HotDrinkMachine implements VendingMachine {
    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        return new HotDrinkWithTemperature(name, volume, temperature);
    }
}
