package Strings;

public class ImmutableStringExample {
    public static void main(String[] args) {
        //string  is a - Immutable
        String str1= "hello"; //str1 is a string literal "hello"
        str1.concat("world");
        System.out.println(str1); // printed hello because it's a immutable
        String b = str1.concat("world");
        System.out.println(b); // printed hello world

        /**
         * In this example, str1 is a string literal "Hello". When we try to concatenate " World" to str1 using the
         * concat() method, a new string object is created with the value "Hello World" and assigned to b.
         * The original string str1 remains unchanged.
         *
         * This behavior showcases the immutability of strings in Java. Instead of modifying the existing string,
         * a new string object is created when you perform string manipulation operations like concatenation.
         * This ensures that the original string is not modified, maintaining its immutability.
         *
         * If strings were mutable, modifying str1 would also change the value of b, leading to unexpected results.
         * Immutability provides predictability and avoids potential bugs that can arise from unintended modifications.
         *
         * By using immutable strings, Java can optimize memory usage and make string manipulation operations more
         * efficient by reusing existing string instances and string pooling techniques.
         */

        //StringBuffer and StringBuilder -Mutable
        StringBuffer str2 = new StringBuffer("hello");
        str2.append("world");
        System.out.println(str2); // printed hello world because it's a mutable
    }
    }
