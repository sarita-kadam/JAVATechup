
// only access can same class

package AccessModifer;


public class PrivateAccessModifer {

    private double balance;
    private void show(){

        System.out.println("Private Access Modifer");
    }



    public static void main(String[] args) {
        PrivateAccessModifer obj = new PrivateAccessModifer();
        obj.show();

    }
}

