package Super;

/** Accessing parent class member variables:-
 * In this example, the Child class accesses the value member variable defined in the parent class
 * using the super keyword. When the printValue() method is called on an instance of the Child class
 */
 class AccessingParent {
        protected int value = 15;
    }

    class Child2 extends AccessingParent {
        public void printValue() {
            int b=10;

            System.out.println(super.value  +b); // Access parent class member variable
        }
        public static void main (String[]args)
        {
            Child2 c = new Child2();
            c.printValue();
        }
    }


