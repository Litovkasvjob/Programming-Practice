package practic_6;

/**
 * Created by SergLion on 08.02.2017.
 */
public class App_Thread  extends Thread{
    public static void main(String[] args) {
        App_Thread app = new App_Thread();
        app.start();
        Thread thread = new Thread(new App_Runnable());
        thread.start();


    }

    @Override
    public  void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}

class App_Runnable implements Runnable {

    @Override
    public  void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}


