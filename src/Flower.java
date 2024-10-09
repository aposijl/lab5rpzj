// батьківський клас Flower, що представляє загальні властивості квітки
abstract class Flower {
    String name;
    double price;
    int freshnessLevel;
    int length;

    /**
     * конструктор класу Flower, що ініціалізує загальні параметри для квітки.
     * @param name           назва квітки
     * @param price          ціна квітки
     * @param freshnessLevel рівень свіжості квітки
     * @param length         довжина стебла квітки
     * @throws IllegalArgumentException якщо ціна <= 0, рівень свіжості не в діапазоні 1-10, або довжина <= 0
     */
    public Flower(String name, double price, int freshnessLevel, int length) {
        if (price <= 0 || freshnessLevel < 1 || freshnessLevel > 10 || length <= 0) {
            throw new IllegalArgumentException("неправильні параметри для квітки.");
        }
        this.name = name;
        this.price = price;
        this.freshnessLevel = freshnessLevel;
        this.length = length;
    }

    /**
     * метод для отримання інформації про квітку.
     * @return рядок з інформацією про назву, ціну, свіжість та довжину квітки
     */
    public String getInfo() {
        return name + " | ціна: " + price + " | свіжість: " + freshnessLevel + " | довжина: " + length;
    }
}
