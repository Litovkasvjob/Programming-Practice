package practic_6;

import org.openjdk.jmh.util.FileUtils;

import java.io.*;

/**
 * Created by SergLion on 09.02.2017.
 */
public class FindFile extends Thread {


    public static void findAllFiles(String path, String name, String logFile) {
        Thread thread;
        File file = new File(path);
        File[] files = file.listFiles();

        if (file.list() != null) {
            for (File f : files) {

                System.out.println(f.getName());
                System.out.println(f.getAbsolutePath());
                System.out.println(f.getName().endsWith(name));
                if (f.getName().endsWith(name)) {

                    writeLogFile(logFile, f.getAbsolutePath());

                } else if (f.isDirectory()) {

                    System.out.println("folder");
                    String err = f.getAbsolutePath();


                    thread = new Thread(() ->
                            findAllFiles(err, name, logFile));

                    thread.start();
                    continue;
                }
            }
        }

    }


    public static synchronized void writeLogFile(String logFile, String nameFile) {

        File file = new File(logFile);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (BufferedWriter br = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file, true), "utf-8"))) {

                br.write(nameFile + "\n");


        } catch (IOException e) {
            e.printStackTrace();
        }


//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file, true))) {
//
//            oos.writeChars(nameFile + "\n");
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

}
