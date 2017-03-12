package practic_6;

import java.io.File;

/**
 * Created by SergLion on 09.02.2017.
 */
public class App_MyShedule {
    public static void main(String[] args) {
        FindFile.findAllFiles("d:\\temp\\qqq", ".txt" , "thread.data");
//        File file = new File("d:\\temp\\qqq\\");
//        File[] files = file.listFiles();
//        for (File file1 : files) {
//            System.out.println(file1.getAbsolutePath());
//        }
//        FindFile.writeLogFile("thread.data", "d:\\temp\\qqq");
//        String s = ".txt";
//        String d = "eee.txt";
//        System.out.println(d.endsWith(s));
//
//        System.out.println(Thread.currentThread().getName());
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                FindFile.findAllFiles("d:\\temp\\qqq", ".txt" , "thread.data");
//
//            }
//        });
//        thread.start();
//        System.out.println("main");
//int[] u = {1,2,3,4,5};
//        for (int i = 0; i < 5; i++) {
//            Thread  thread = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    for (int j = 0; j < 5; j++) {
//                        try {
//                            Thread.sleep(5);
//                            System.out.print("=" + u[j]);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                    System.out.println();
//                }
//            });
//            thread.start();
        }
    }

