import java.util.*;

// клас Bouquet, що представляє букет квітів з можливістю додавання квітів та аксесуарів
class Bouquet {
    List<Flower> flowers = new ArrayList<>();
    List<Accessory> accessories = new ArrayList<>();

    /**
     * додавання квітки до букета.
     * @param flower квітка, яку потрібно додати до букета
     */
    public void addFlower(Flower flower) {
        flowers.add(flower);
    }
    /**
     * додавання аксесуара до букета.
     * @param accessory аксесуар, який потрібно додати до букета
     */
    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }

    /**
     * обчислення загальної вартості букета, враховуючи квіти та аксесуари.
     * @return загальна вартість букета (квіти + аксесуари)
     */
    public double calculatePrice() {
        // Перевірка, чи порожній букет
        if (flowers.isEmpty() && accessories.isEmpty()) {
            System.out.println("букет порожній, немає жодної квітки чи аксесуара.");
            return 0;
        }
        double totalPrice = 0;

        // підрахунок вартості всіх квітів
        for (Flower flower : flowers) {
            totalPrice += flower.price;
        }

        // підрахунок вартості всіх аксесуарів
        for (Accessory accessory : accessories) {
            totalPrice += accessory.price;
        }
        return totalPrice;
    }

    /**
     * сортування квітів у букеті за рівнем свіжості.
     * виводить повідомлення, якщо немає квітів для сортування.
     */
    public void sortByFreshness() {
        if (flowers.isEmpty()) {
            System.out.println("букет порожній, сортування неможливе.");
            return;
        }
        flowers.sort(Comparator.comparingInt(flower -> flower.freshnessLevel));
    }

    /**
     * пошук квітів у букеті за заданим діапазоном довжини стебла.
     * @param minLength мінімальна довжина стебла квітки
     * @param maxLength максимальна довжина стебла квітки
     * @return список квітів, які відповідають вказаному діапазону довжин
     * @throws IllegalArgumentException якщо діапазон довжин некоректний
     */
    public List<Flower> findFlowersByLength(int minLength, int maxLength) {
        // Перевірка діапазону
        if (minLength <= 0 || maxLength <= 0 || minLength > maxLength) {
            throw new IllegalArgumentException("неправильний діапазон довжин.");
        }
        List<Flower> result = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.length >= minLength && flower.length <= maxLength) {
                result.add(flower);
            }
        }
        if (result.isEmpty()) {
            System.out.println("немає квітів у вказаному діапазоні.");
        }
        return result;
    }

    /**
     * виведення інформації про всі квіти та аксесуари у букеті.
     * виводить відповідні повідомлення, якщо букет порожній.
     */
    public void printBouquet() {
        if (flowers.isEmpty() && accessories.isEmpty()) {
            System.out.println("букет порожній, немає квітів чи аксесуарів для виведення.");
            return;
        }

        if (!flowers.isEmpty()) {
            System.out.println("квіти в букеті:");
            for (Flower flower : flowers) {
                System.out.println(flower.getInfo());
            }
        }

        if (!accessories.isEmpty()) {
            System.out.println("аксесуари в букеті:");
            for (Accessory accessory : accessories) {
                System.out.println(accessory.getInfo());
            }
        }
    }
}
