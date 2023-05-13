public class RecursionTutorial {

    public static void main(String[] args) {
        SayHi();
    }

    private static void SayHi(){
        System.out.println("Hi!");

        SayHi();
    }
}