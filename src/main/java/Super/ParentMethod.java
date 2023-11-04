package Super;

/** Calling parent class method:-
 * In this example, the Child class overrides the doSomething() method defined in the parent class,
 * but still calls the parent class implementation of the method using the super keyword. When the
 * doSomething() method is called on an instance of the Child class
 */
 class ParentMethod {
        public void doSomething() {
            System.out.println("Parent is doing something");
        }
    }

    class Child1 extends ParentMethod {
        public void doSomething() {
            super.doSomething(); // Call parent class method
            System.out.println("Child is doing something");
        }

        public static void main (String[]args)
        {
            Child1 c = new Child1();
            c.doSomething();
        }
    }


