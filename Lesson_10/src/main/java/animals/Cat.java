package animals;

public class Cat extends Animal {

    private static final int MAX_RUN_DISTANCE = 200;
    private static final int CAT_NEED_FOOD = 10;
    private int catsCounter = 0;
    private int foodUnits = 0;
    private boolean isFull = false;


    public Cat(String name) {
        super(name);
        catsCounter++;
    }

    @Override
    protected int getMaxRunDistance() {
        return MAX_RUN_DISTANCE;
    }

    @Override
    protected int getMaxSwimDistance() {
        return 0;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats cannot swim.");
    }

    public int getNumberOfCats() {
        return catsCounter;
    }

    public void addFoodUnits(int units) {
        if (units < 0) {
            System.out.println("Food Units cannot be negative.");
            return;
        }
        foodUnits += units;
        System.out.println("You can feed the cat " + foodUnits + " units of food.");
    }

    public void eatFood(int units) {
        if (units < 0) {
            System.out.println("Food Units cannot be negative.");
            return;
        }

        if (units > foodUnits) {
            System.out.println(name + " is trying to eat more than there is in the bowl. Put some more food.");
            return;
        } else if (units < CAT_NEED_FOOD) {
            System.out.println("This is not enough food for the cat, he wants more. " + "Give him " + (CAT_NEED_FOOD - units) + " more units.");
            return;
        }

        foodUnits -= units;
        isFull = true;
        System.out.println(name + " has eaten. He's happy.");
    }

    public int getFoodUnits() {
        return foodUnits;
    }

    public  boolean checkIsFull() {
        return isFull;
    }
}
