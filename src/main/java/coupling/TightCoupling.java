package coupling;

/** it means that the components of a system are closely interconnected and cannot operate independently without
 * affecting other components, making the system more rigid and difficult to maintain or modify.
 * // tight coupling concept
 * class Subject {
 * Topic t = new Topic();
 * public void startReading() {
 * t.understand();
 * }
 * }
 * class Topic {
 * public void understand() {
 * System.out.println("Tight coupling concept");
 * }
 * }
 *
 * Explanation:In the above program the Subject class is dependents on Topic class.In the above program Subject
 * class is tightly coupled with Topic class it means if any change in the Topic class requires Subject class to change.
 * For example,if Topic class understand() method change to gotit()method then you have to change the startReading()method
 * will call gotit()method instead of calling understand()method.
 */

public class TightCoupling {
    // tight coupling concept
        public static void main(String args[])
        {
            Box b = new Box(5,5,5);
            System.out.println(b.volume);
        }
    }
    class Box
    {
        public int volume;
        Box(int length, int width, int height)
        {
            this.volume = length * width * height;
        }
    }
/** Explanation:In the above example, there is a strong inter-dependency between both the classes.
 If there is any change in Box class then they reflects in the result of Class TightCoupling. */


