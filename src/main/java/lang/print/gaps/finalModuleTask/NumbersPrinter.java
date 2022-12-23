package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public static void main(String[] args) {
        NumbersPrinter np = new NumbersPrinter();
        np.printIsPositive(0);
    }
    public void printIsPositive(int number) {
        boolean result = number > 0;
        System.out.println(result);

    }
}
