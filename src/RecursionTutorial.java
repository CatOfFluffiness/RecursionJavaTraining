public class RecursionTutorial {

    public static void main(String[] args) {

        SayHi(1);

    }

    private static void SayHi(int count){

        System.out.println("Hi!");

        if (count <=1) {return;}

        SayHi(count - 1);
    }
}