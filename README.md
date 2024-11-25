# **Лабораторна робота 5**

<br>

## Авторка: ІО-23 Бадюлько Ірина

Для запуску лабораторної роботи треба створити букет та додати різні екземпляри квітів та аксесуарів у класі `Main`:
```java
  Bouquet bouquet = new Bouquet();
  bouquet.addFlower(rose);
  bouquet.addFlower(tulip);
  bouquet.addFlower(lily);
  bouquet.addAccessory(ribbon);
  bouquet.addAccessory(paper);
```
та визначити діапазон за яким будуть пофільтровані квіти в тому ж класі:

```java
 List<Flower> foundFlowers = bouquet.findFlowersByLength(45, 55);
```
