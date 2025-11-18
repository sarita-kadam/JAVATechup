package Threading;

class BookTheaterSeats{

   static int total_seats = 20;

   static synchronized void bookseats(int seats)
    {
       if(total_seats >= seats){

           System.out.println(seats + " Seats booked successfully");

           total_seats = total_seats - seats;

           System.out.println("seats left : " + total_seats);
       }
       else
       {
           System.out.println("Seats can not be booked");

           System.out.println("seats left : " + total_seats);
       }
    }
}

class MyThread1 extends Thread{

    BookTheaterSeats b; // reference of BookTheaterSeats class

    int seats;

    MyThread1(BookTheaterSeats b,int seats)
    {
      this.b = b;
      this.seats = seats;
    }

    @Override
    public void run()
    {
        b.bookseats(seats);
    }
}

class MyThread2 extends Thread{

    BookTheaterSeats b; // reference of BookTheaterSeats class

    int seats;

    MyThread2(BookTheaterSeats b,int seats)
    {
        this.b = b;
        this.seats = seats;
    }

    @Override
    public void run() {
        b.bookseats(seats);
    }
}

public class MovieBookApp {

    public static void main(String[] args) {

        BookTheaterSeats b1 = new BookTheaterSeats();

        MyThread1 t1 = new MyThread1(b1,7);
        t1.start();

        MyThread2 t2 = new MyThread2(b1 ,6);
        t2.start();

        BookTheaterSeats b2 = new BookTheaterSeats();


        MyThread1 t3 = new MyThread1(b1,2);
        t3.start();

        MyThread2 t4 = new MyThread2(b1 ,9);
        t4.start();

    }

}
