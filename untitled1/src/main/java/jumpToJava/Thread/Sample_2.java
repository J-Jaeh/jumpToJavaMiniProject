package jumpToJava.Thread;

import java.util.ArrayList;

public class Sample_2 implements Runnable{

    int seq;
        //이건 쓰레드의 동작을 확일 할 수 있게 하는 예제
    public Sample_2(int seq) {
        this.seq = seq;
    }
    public void  run(){
        System.out.println(this.seq + "thread start.");
        try {
            Thread.sleep(1000);//1초대기한다..!?
        }catch (Exception e){
        }
        System.out.println(this.seq + "thread end.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for(int i =0;i<10;i++) {
            Thread t = new Thread(new Sample_2(i));
            //객체를 생성하는건가봄!
            //위 방법은 Thread의 생성자로 Runnable 인터페이스를 구현한 객체를 넘길 수있는데 이방법을 이용한것..
            t.start();
            threads.add(t);
        }
        for (int i = 0 ; i<threads.size();i++) {
            Thread t = threads.get(i);
            try {
                t.join();// t 쓰레드가 종료할 때까지 기다린다.
            }catch (Exception e){
            }
        }
        System.out.println("main end.");
    }
}
