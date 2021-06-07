package demo1;

public class SyncDemo1 {
    public synchronized void method(){

    }

    public static synchronized void staticMethod(){

    }
    public void someMethod(){
        Object o=new Object();
        synchronized (o){
        }
    }
}
