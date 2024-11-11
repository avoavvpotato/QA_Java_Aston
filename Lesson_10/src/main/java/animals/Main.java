package animals;

public class Main {
    public static void main(String[] args) {
        // Проверяем класс Dog
        Dog dogBobik = new Dog("Bobik");
        System.out.println(dogBobik.getName());
        dogBobik.run(200);
        dogBobik.run(600);
        dogBobik.run(-10);
        dogBobik.swim(5);

        // Проверяем класс Cat
        System.out.println();
        Cat catLuna = new Cat("Luna");
        System.out.println(catLuna.getName());
        catLuna.run(100);
        catLuna.run(250);
        catLuna.run(-10);
        catLuna.swim(5);

        // Проверяем дополнительные функции класса Cat
        System.out.println();
        catLuna.addFoodUnits(5);
        catLuna.eatFood(5);
        catLuna.eatFood(6);
        catLuna.addFoodUnits(5);
        catLuna.eatFood(10);


        System.out.println("Total number of animals: " + Animal.getNumberOfAnimals());


        // Кормим котиков
        System.out.println();
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Cat 1");
        cats[1] = new Cat("Cat 2");
        cats[2] = new Cat("Cat 3");
        cats[3] = new Cat("Cat 4");

        int totalFood = 25;
        int unitsForAdd = 10;
        int unitsForEat = 10;

        feedCats(cats, totalFood, unitsForAdd, unitsForEat);
    }

    public static void feedCats(Cat[] cats, int totalFood, int unitsForAdd, int unitsForEat) {
        for (Cat cat : cats) {
            int foodToAdd = Math.min(unitsForAdd, totalFood);
            cat.addFoodUnits(foodToAdd);
            totalFood -= foodToAdd;

            if (totalFood <= 0) {
                break;
            }
        }

        for (Cat cat : cats) {
            cat.eatFood(unitsForEat);
        }

        System.out.println("\nFullness status of each cat:");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " is " + (cat.checkIsFull() ? "full" : "still hungry"));
        }
    }
}
