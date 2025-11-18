package Threading;

public class TypingEffectSimulation extends Thread {

    private String massage;

    TypingEffectSimulation(String massage){

        this.massage = massage;
    }

    @Override
    public void run() {

        try{

            for (char c : massage.toCharArray()){
                System.out.print(c);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        TypingEffectSimulation obj = new TypingEffectSimulation("Hello, Welcome to java Threads ! " );
        obj.start();
    }
}
