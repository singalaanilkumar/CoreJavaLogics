package coupling;

/** Loose coupling defination :-  the components of a system are not tightly integrated and can operate independently without
  affecting other components, making the system more flexible and easier to maintain or modify
  Loose coupling is achieved by using interfaces, abstract classes, or dependency injection. */
/**
 * // Java program to illustrate
 * // loose coupling concept
 * public interface Topic
 * {
 * void understand();
 * }
 * class Topic1 implements Topic {
 * public void understand()
 * {
 * System.out.println("Got it");
 * }
 * } class Topic2 implements Topic {
 * public void understand()
 * {
 * System.out.println("understand");
 * }
 * } public class Subject {
 * public static void main(String[] args)
 * {
 * Topic t = new Topic1();
 * t.understand();
 * }
 * }
 * <p>
 * Explanation : In the above example, Topic1 and Topic2 objects are loosely coupled. It means Topic is an interface and we
 * can inject any of the implemented classes at run time and we can provide service to the end user.
 */
public class LooseCoupling {
    // loose coupling concept
    public static void main(String args[]) {
        Box1 b = new Box1(5, 5, 5);
        System.out.println(b.getVolume());
    }
}

final class Box1 {
    private int volume;

    Box1(int length, int width, int height) {
        this.volume = length * width * height;
    }

    public int getVolume() {
        return volume;

    }
}

/**
 Explanation : In the above program, there is no dependency between both the classes. If we change anything in the Box1
 classes then we don't have to change anything in LooseCoupling class.
 */



