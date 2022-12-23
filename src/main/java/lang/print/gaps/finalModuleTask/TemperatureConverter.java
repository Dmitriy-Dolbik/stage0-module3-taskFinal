package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        tc.toFahrenheit(1);
    }
    public void toFahrenheit(int temperatureCelsius){
        double temperatureFahrenheit = temperatureCelsius*9d/5d + 32;
        System.out.println(temperatureFahrenheit);
    }
}
