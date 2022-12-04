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
    public void parse(String data) {
        byte[] bdata = data.getBytes();
        int pos =0;
        for (Item item : items) {
            byte[] temp = new byte[item.getLength()];
            System.arraycopy((bdata, pos, temp,0,item.getLength());
            pos += item.getLength();
            item.changeValue(new String(temp) );

        }
    }
    public static void main(String[] args) {
        Packet packet =new Packet();

        Item item1 = Item.create("이름",20,"진재혁");
        Item item2 = Item.create("전화번호",11,"01077771234");



        packet.addItem(item1);
        packet.addItem(item2);

        System.out.println(packet.raw());
    }
}
