// Derived class from HotDrink with an additional field temperature
public class HotDrinkWithTemperature extends HotDrink {
    int temperature;

    public HotDrinkWithTemperature(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }
}
