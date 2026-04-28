public class DemoMultipleClass {
    static{
        System.out.println("Main loaded");
    }
    public static void main(String[] args) {
        System.out.println("Main method");
        new InnerDemoMultipleClass();
    }
}

class InnerDemoMultipleClass {

    static{
        System.out.println("Inner Demo loaded");
    }
}