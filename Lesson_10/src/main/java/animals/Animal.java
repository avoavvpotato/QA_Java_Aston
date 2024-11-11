package animals;

abstract class Animal {
    protected final String name;
    protected static int animalsCounter = 0;

    public Animal(String name) {
        this.name = name;
        animalsCounter++;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Distance cannot be negative.");
            return;
        }
        if (distance <= getMaxRunDistance()) {
            System.out.println(name + " ran " + distance + " m.");
        } else {
            System.out.println(name + " cannot run more than " + getMaxRunDistance() + " m.");
        }
    }

    public void swim(int distance) {
        if (distance < 0) {
            System.out.println("Distance cannot be negative.");
            return;
        }
        if (distance <= getMaxRunDistance()) {
            System.out.println(name + " swim " + distance + " m.");
        } else {
            System.out.println(name + " cannot swim more than " + getMaxSwimDistance() + " m.");
        }
    }

    protected abstract int getMaxRunDistance();
    protected abstract int getMaxSwimDistance();

    public static int getNumberOfAnimals() {
        return animalsCounter;
    }
}
