// клас Accessory, що представляє аксесуар для букета
class Accessory {
    String type;
    double price;
    /**
     * конструктор класу Accessory, що ініціалізує тип та ціну аксесуара.
     * @param type  тип аксесуара
     * @param price ціна аксесуара
     * @throws IllegalArgumentException якщо ціна аксесуара менше або дорівнює 0
     */
    public Accessory(String type, double price) {
        if (price <= 0) {
            // Якщо ціна менше або дорівнює 0, генеруємо виключення
            throw new IllegalArgumentException("Неправильна ціна аксесуара.");
        }
        this.type = type;
        this.price = price;
    }

    /**
     * метод для отримання інформації про аксесуар.
     * @return рядок з інформацією про тип аксесуара та його ціну
     */
    public String getInfo() {
        return type + " | ціна: " + price;
    }
}
