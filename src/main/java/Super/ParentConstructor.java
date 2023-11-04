package Super;

/**
 *  Calling parent class constructor:-
 *  In this example, the Child class extends the Parent class and calls the parent class constructor
 *  using the super keyword. When a new instance of the Child class is created, the parent class
 *  constructor is called with the message "Hello from Parent
 */

class ParentConstructor {

    public ParentConstructor(String message) {
        System.out.println(message);
    }
}

class Child extends ParentConstructor {
    public Child() {
        super("Hello from Parent");
    }
    public static void main (String[]args)
    {
        Child c = new Child();
    }
}


