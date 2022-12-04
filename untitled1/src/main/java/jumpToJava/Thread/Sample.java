package jumpToJava.Thread;

public class Sample extends Thread{
    public void run(){
        System.out.println("thread run.");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.start();
    }
    //Thread 클래스 상속시 run메소드를 구현해야한다 아마 추상메소드인듯
    //start 메소드를 통해 run메소드가 구현되도록 설계되있다
}
