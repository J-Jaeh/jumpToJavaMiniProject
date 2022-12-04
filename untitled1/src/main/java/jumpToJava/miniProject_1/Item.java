package jumpToJava.miniProject_1;

public class Item {
    private String name;
    private int length;

    private String value;
    //이름은 "이름 " "전화번호"같은거 길이? 왜 몇자리인지 알라고? , value 진재혁 01015165등은 값으로..받음
    // private 의 이유는 직접 접근 못하도록

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void changeLength(int length) {
        this.length = length;
    }

    public String getValue() {
        return value;
    }

    public void changeValue(String value) {
        this.value = value;
    }

    public String raw() {  // +사용해서 공백을 추가 할수도 있다,,
        StringBuffer padded = new StringBuffer(this.value);
        while (padded.toString().getBytes().length < this.length){
            padded.append(' ');
        }
        return padded.toString();
        //문자열 길이말고 바이트의 길이를 체크한것!
        //전문 송수신시 길이체크는 항상 바이트 단위로 하는 것이 안전하다.
    }


    public static void main(String[] args) {
        Item item = new Item();
        item.changeName("이름");
        item.changeLength(20);
        item.changeValue("홍길동");
        System.out.println("["+item.raw()+"]");
    }
}
