
public class Cat {

    private static int COUNT;
    private static final double MAX_WEIGHT = 9000.0;
    private static final double MIN_WEIGHT = 1000.0;
    private static final int EYES_COUNT = 2;

    private final double originWeight;
    private double weight;
    private double eatenWeight;
    private Color color;

    public enum Color {
        RED,
        WHITE,
        BLACK,
        REDHEAD
    }

    public Cat() {
        this.weight = 1500.0 + 3000.0 * Math.random();
        this.originWeight = weight;
        this.eatenWeight = 0;
        COUNT++;
    }

    public Cat(Double weight) {
        this.weight = weight;
        this.originWeight = weight;
        this.eatenWeight = 0;
        COUNT++;
    }

    public Cat(Cat cat) {
        this.originWeight = cat.originWeight;
        this.weight = cat.weight;
        this.eatenWeight = cat.eatenWeight;
        this.color = cat.color;
    }

    public static int getCount() {
        return COUNT;
    }

    private boolean isDead() {
        String status = getStatus();
        return status.equals("Dead") || status.equals("Exploded");
    }

    private void checkForDeath() {
        if (isDead()) {
            COUNT--;
        }
    }

    public void meow() {
        if (isDead()) {
            return;
        }
        weight = weight - 1;
        System.out.println("Meow");
        checkForDeath();
    }

    public void feed(Double amount) {
        if (isDead()) {
            return;
        }
        weight = weight + amount;
        eatenWeight += amount;
        checkForDeath();
    }

    public void drink(Double amount) {
        if (isDead()) {
            return;
        }
        weight = weight + amount;
        eatenWeight += amount;
        checkForDeath();
    }

    public void pee() {
        if (isDead()) {
            return;
        }
        weight = weight - 1;
        System.out.println("Pee");
        checkForDeath();
    }

    public Double getWeight() {
        return weight;
    }

    public Double getEatenWeight() {
        return eatenWeight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Status should be Enum ofc
     */
    public String getStatus() {
        if (weight < MIN_WEIGHT) {
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}