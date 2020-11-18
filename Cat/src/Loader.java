
public class Loader {
    public static void main(String[] args) {
        {
            // lesson 1
            int n = 5;
            Cat[] cats = new Cat[n];
            for (int i = 0; i < n; i++) {
                cats[i] = new Cat();
            }

            for (Cat cat : cats) {
                System.out.println(cat.getWeight());
            }
            System.out.println("------------------");
            cats[0].feed(500d);
            cats[1].feed(1000d);
            System.out.println(cats[0].getWeight());
            System.out.println(cats[1].getWeight());
            System.out.println("------------------");
            while (!cats[0].getStatus().equals("Exploded")) {
                cats[0].feed(6666d);
            }
            System.out.println(cats[0].getStatus());
            System.out.println("------------------");
            while (!cats[1].getStatus().equals("Dead")) {
                cats[1].meow();
            }
            System.out.println(cats[1].getStatus());
            System.out.println("------------------");
        }
        {
            // lesson 2
            Cat cat = new Cat();
            cat.feed(150d);
            for (int i = 0; i < 15; i++) {
                cat.pee();
            }
            System.out.println(cat.getEatenWeight());
            System.out.println("------------------");
        }
        {
            // lesson 3
            for (int i = 0; i < 100; i++) {
                new Cat();
            }
            Cat cat = new Cat();
            System.out.println(Cat.getCount());

            cat.feed(100000d);
            System.out.println(Cat.getCount());
            System.out.println(cat.getWeight());
            cat.pee();
            System.out.println(cat.getWeight());
            System.out.println("------------------");
        }

        {
            // lesson 5
            Cat cat = getKitten();
            System.out.println(cat.getWeight());
            System.out.println("------------------");
        }
        {
            // lesson 6
            Cat cat = getKitten();
            cat.setColor(Cat.Color.REDHEAD);
            System.out.println(cat.getColor());
            System.out.println("------------------");
        }
        {
            // lesson 6
            Cat cat = getKitten();
            cat.setColor(Cat.Color.REDHEAD);

            Cat copy = new Cat(cat);
            System.out.println(copy.getWeight());
            System.out.println(copy.getColor());
        }
    }

    private static Cat getKitten() {
        return new Cat(1100.0);
    }
}