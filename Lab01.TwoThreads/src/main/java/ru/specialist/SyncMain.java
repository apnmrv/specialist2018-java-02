package ru.specialist;

public class SyncMain {

    public static void main(String[] args) throws Exception {
        Data d1 = new Data();
        Data d2 = new Data();
        MyThread t1 = new MyThread(d1);
        MyThread t2 = new MyThread(d2);

        Thread.sleep(3000);
        
        System.out.println("d1.count = " + d1.count);
        System.out.println("d2.count = " + d2.count);
        
        System.out.println("Data static countSt = " + Data.countSt);
    }
}