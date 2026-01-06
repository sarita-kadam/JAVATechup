package Java8;

interface TestLambda{

    void display();

    static void main(){
        System.out.println("static method...");
    }
}

public class LambdaExpressionProgram {

    public static void main(String[] args) {

       /* TestLambda testLambda = new TestLambda() {
            @Override
            public void display() {
                System.out.println("hey saru ...");
            }
        };

        testLambda.display();*/

        TestLambda testLambda = () -> {
            System.out.println("Hello...");
            TestLambda.main();
        };

        testLambda.display();



    }

}
