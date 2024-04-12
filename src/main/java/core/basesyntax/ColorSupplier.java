package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int indexOfColor = random.nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[indexOfColor]);
    }
}
