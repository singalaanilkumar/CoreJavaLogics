package polymorphism;

public class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");}}

// Dog.java
 class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");}
    public void fetch() {
        System.out.println("Fetch the ball!");}}

// Cat.java
 class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");}
    public void scratch() {
        System.out.println("Scratch the furniture!");
    }}

// Main.java
class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.makeSound(); // output: Some generic animal sound

        Animal animal2 = new Dog();
        animal2.makeSound(); // output: Woof!
        //animal2.fetch(); // won't compile, Animal type doesn't have fetch() method

        Animal animal3 = new Cat();
        animal3.makeSound(); // output: Meow!
        // animal3.scratch(); // won't compile, Animal type doesn't have scratch() method

        Dog dog = new Dog();
        dog.makeSound(); // output: Woof!
        dog.fetch(); // output: Fetch the ball!

        Cat cat = new Cat();
        cat.makeSound(); // output: Meow!
        cat.scratch(); // output: Scratch the furniture!
    }

    /**
     * In this example, we have an Animal class with a makeSound() method. We also have two subclasses Dog and Cat that override the makeSound() method with their own specific implementation. Additionally, the Dog class has a fetch() method, and the Cat class has a scratch() method.
     *
     * In the Main class, we create objects of type Animal, Dog, and Cat. We demonstrate both static polymorphism and dynamic polymorphism by calling the makeSound() method on each object. When we call animal1.makeSound(), we get the generic animal sound. When we call animal2.makeSound() and animal3.makeSound(), we get the specific sounds of the Dog and Cat objects, respectively.
     *
     * We also demonstrate that objects of the Animal type cannot call the fetch() or scratch() methods, as those methods are not defined in the Animal class. We can only call those methods on objects of the Dog and Cat classes, respectively.
     */
}
