package JavaBasic;

public class Continue {

    public static void main(String[] args) {

        for(int roll = 1; roll <= 5; roll++) {
            if(roll == 3) {
                continue; // skip roll no 3
            }
            System.out.println("Mark attendance for roll: " + roll);
        }

    }
}
