
// Rule.9: A subclass in a different package can only override the non-final methods declared public or protected.

package Polymorphism1;

public class Rule9 {


        void show(){
            System.out.println("Default method");
        }

        public void test(){
            System.out.println("public method");
        }

        private void dummy(){
            System.out.println("private method");

        }

        protected void add(){
            System.out.println("protected method");
        }


}
