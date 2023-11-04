package DataEncapulation;

/** dara encapulation :-
 * Data encapsulation in Java is a mechanism that allows you to hide the implementation details of a class from other classes.
 Encapsulation is achieved by using access modifiers such as private, public, protected, and default,
 which control the level of access to the class's fields and methods.

 For below code example, consider a class called Student with private fields name, rollNumber, and marks. We can provide public getter
 and setter methods for these fields, such as getName(), setName(), getRollNumber(), setRollNumber(), getMarks(), and setMarks().
 These methods can be used by other classes to access or modify the data stored in the Student object.

 By encapsulating the data in this way, we can ensure that the data is accessed and modified only in a controlled manner,
 which helps prevent errors and maintain the integrity of the data.
 */

public class Student {
        private String name;
        private int rollNumber;
        private int marks;



    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public void setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
        }

        public int getMarks() {
            return marks;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }
    }

/** In this above example, the Student class has three private fields, name, rollNumber, and marks, which are only accessible within the class. The constructor initializes these fields with the values passed in as parameters.

 The class also has public getter and setter methods for each field, which allow other classes to access or modify the values stored in the Student object. The getName(), getRollNumber(), and getMarks() methods return the current values of the corresponding fields, while the setName(), setRollNumber(), and setMarks() methods set the values of the corresponding fields to the values passed in as parameters.

 By using private fields and public getter and setter methods, the Student class encapsulates the data it stores and provides controlled ways for other classes to access and modify that data. */
