package jumpToJava.miniProject_1;

import java.util.ArrayList;

public class Packet {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item){
        this.items.add(item);
    }
    public Item getItem(int index){
        return this.items.get(index);
    }
    public String raw(){
        StringBuffer result = new StringBuffer();
        for (Item item : items) {
            result.append(item.raw());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Packet packet =new Packet();

        Item item1 = new Item();
        Item item2 = new Item();

        item1.changeName("이름");
        item1.changeLength(20);
        item1.changeValue("진재혁");

        item2.changeName("전화번호");
        item2.changeLength(11);
        item2.changeValue("01022601234");

        packet.addItem(item1);
        packet.addItem(item2);

        System.out.println(packet.raw());
    }
}
