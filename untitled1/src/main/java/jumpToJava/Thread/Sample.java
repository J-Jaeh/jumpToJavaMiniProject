package jumpToJava.Thread;

public class Sample extends Thread{
    public void run(){
        System.out.println("thread run.");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.start();
    }
    //Thread Ŭ���� ��ӽ� run�޼ҵ带 �����ؾ��Ѵ� �Ƹ� �߻�޼ҵ��ε�
    //start �޼ҵ带 ���� run�޼ҵ尡 �����ǵ��� ������ִ�
}
