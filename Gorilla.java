public class Gorilla extends Mammal {
    public void throwSomething() {
        System.out.println("The gorilla threw something");
        energyLevel -= 5;
    }
    public void eatBananas() {
        System.out.println("The gorilla just ate a banana");
        energyLevel += 10;
    }
    public void climb() {
        System.out.println("The gorilla has climbed up a tree");
        energyLevel -= 10;
    }
}