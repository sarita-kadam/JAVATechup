package String;

class Students{

    int id;
    String name;

    Students(int id , String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return("id : " + id + " , name : " + name);

    }
}



public class ToStringMethodExample {

    public static void main(String[] args) {


        Students obj = new Students(1,"saru");
        System.out.println(obj);

        Students obj1 = new Students(2,"Rushi");
        System.out.println(obj1);
    }
}
