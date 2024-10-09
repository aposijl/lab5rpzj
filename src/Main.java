import java.util.*;

// основний клас для тестування
public class Main {
    public static void main(String[] args) {
        try {
            // створення квітів
            Flower rose = new Rose(70.0, 8, 55);
            Flower tulip = new Tulip(40.0, 7, 35);
            Flower lily = new Lily(105.0, 9, 50);

            // створення букета
            Bouquet bouquet = new Bouquet();
            bouquet.addFlower(rose);
            bouquet.addFlower(tulip);
            bouquet.addFlower(lily);
            bouquet.addFlower(lily);
            bouquet.addFlower(tulip);

            // додавання аксесуарів
            Accessory ribbon = new Accessory("стрічка", 10.0);
            Accessory butterfly = new Accessory("метелик", 10.0);
            Accessory paper = new Accessory("папір для обгортання", 5.0);
            bouquet.addAccessory(ribbon);
            bouquet.addAccessory(paper);

            // виведення початкового складу букета
            System.out.println("початковий букет:");
            bouquet.printBouquet();

            // обчислення вартості букета
            System.out.println("\nвартість букета: " + bouquet.calculatePrice());

            // сортування за рівнем свіжості
            bouquet.sortByFreshness();
            System.out.println("\nбукет після сортування за рівнем свіжості:");
            bouquet.printBouquet();

            // пошук квітки за діапазоном довжини
            System.out.println("\nквіти з довжиною від 35 до 55 см:");
            List<Flower> foundFlowers = bouquet.findFlowersByLength(45, 55);
            for (Flower flower : foundFlowers) {
                System.out.println(flower.getInfo());
            }

        } catch (IllegalArgumentException | NoSuchElementException e) {
            System.out.println("помилка: " + e.getMessage());
        }
    }
}
