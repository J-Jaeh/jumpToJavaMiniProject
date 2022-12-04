package jumpToJava.Thread;

import java.util.ArrayList;

public class Sample_2 implements Runnable{

    int seq;
        //�̰� �������� ������ Ȯ�� �� �� �ְ� �ϴ� ����
    public Sample_2(int seq) {
        this.seq = seq;
    }
    public void  run(){
        System.out.println(this.seq + "thread start.");
        try {
            Thread.sleep(1000);//1�ʴ���Ѵ�..!?
        }catch (Exception e){
        }
        System.out.println(this.seq + "thread end.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for(int i =0;i<10;i++) {
            Thread t = new Thread(new Sample_2(i));
            //��ü�� �����ϴ°ǰ���!
            //�� ����� Thread�� �����ڷ� Runnable �������̽��� ������ ��ü�� �ѱ� ���ִµ� �̹���� �̿��Ѱ�..
            t.start();
            threads.add(t);
        }
        for (int i = 0 ; i<threads.size();i++) {
            Thread t = threads.get(i);
            try {
                t.join();// t �����尡 ������ ������ ��ٸ���.
            }catch (Exception e){
            }
        }
        System.out.println("main end.");
    }
}
