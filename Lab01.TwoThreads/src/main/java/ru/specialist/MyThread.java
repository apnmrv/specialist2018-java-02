package ru.specialist;

class MyThread implements Runnable {

    private Data obj;

    MyThread(Data d){
        obj = d;
        new Thread(this).start();
    }

    void Add(){
        try {
            Thread.sleep(5);
            synchronized (obj){
                int n = obj.count;

                n++;
                Thread.sleep(5);
                obj.count = n;}
        } catch (InterruptedException ex) {       }
    }

    static void AddStatic() {
        try {
            Thread.sleep(5);
            synchronized (Data.class){
                int n=Data.countSt;
                n++;
                Thread.sleep(5);
                Data.countSt=n;}
        } catch (InterruptedException ex) {       }
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++) Add();
        for(int i=0; i<10; i++) AddStatic();
    }
}
