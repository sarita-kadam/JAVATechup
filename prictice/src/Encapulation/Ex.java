package Encapulation;

class Accounts{

    private int studroll = 10;
    private String studname = "java";

    public String getStudname() {
        return studname;
    }

    public void setStudname(String studname) {
        this.studname = studname;
    }

    public int getStudroll() {
        return studroll;
    }

    public void setStudroll(int studroll) {
        this.studroll = studroll;
    }

}

public class Ex {

    public static void main(String[] args) {

        Accounts obj = new Accounts();
       obj.setStudname("python");
      //  obj.studname = "python";     only accessible with setter method

        System.out.println(obj.getStudroll());
        System.out.println(obj.getStudname());

    }





}

