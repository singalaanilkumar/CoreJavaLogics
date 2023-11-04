package abstraction;

abstract class animal {
        // Abstract method - no implementation
        public abstract void makeSound();

    // Concrete method - has an implementation
        public void sleep() {
            System.out.println("zzz");
        }
    }

    class Dog extends animal {
        // Implementation of the abstract method
        public void makeSound() {
            System.out.println("Bark!");
        }
    }

    class Main {
        public static void main(String[] args) {
            Dog myDog = new Dog();
            myDog.makeSound(); // Output: Bark!
            myDog.sleep(); // Output: zzz
        }
    }

