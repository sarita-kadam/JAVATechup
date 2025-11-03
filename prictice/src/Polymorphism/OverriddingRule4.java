package Polymorphism;
/*The access level cannot be more restrictive than the parent class method’s access level.
For example: if the super class method is declared public,
then the over-ridding method in the subclass cannot be either private or default or protected*/


class Aa {

    void show(){
        System.out.println("Default");
    }

    public void show(float a) {
        System.out.println("public");
    }

    protected void show(int a){
        System.out.println("protected");
    }

    private void show(double a){
        System.out.println("private");
    }
    private void show(byte a){
        System.out.println("can access only same class even private method can not overide");
    }

}
public class OverriddingRule4 extends Aa {
    @Override
    void show() {
        System.out.println("Default can override default,protected,public");
    }

    @Override
    public void show(float a) {
        System.out.println("public can only override");
    }

    @Override
    protected void show(int a) {
        System.out.println("protected can override protected or public");
    }


}



