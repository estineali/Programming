class HelloWorld {

    public static void main(String[] args) {
        testFunction2();
    }

    private static void testFunction1(String name) {
        System.out.print("This is my first program on Java.");
        System.out.print("\nI am using ThinkJava and this function is the result of chapter 1.\n");
        System.out.println("My name is " + name);
        System.out.print("and this section included basic knowledge about programming and programming in Java.\n");
        System.out.println("Includes making your first program, printing stuff on the screen, and the function making knowledge comes from CPP experience.");
        //Good Book.
    }

    private static void testFunction2() {
        //Chapter 2: Variables and Operators
        int age = 20;
        String FirstName = "Estine";
        String LastName = "Winchester";
        System.out.println(FirstName + " " + LastName);

        double goldenRatio = (1.0 + Math.sqrt(5))/2.0;
        System.out.println(goldenRatio + " is the Golden ratio!");

        System.out.println(0.1 * 10);
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
    }
}
