import org.w3c.dom.Node;
public class Q1 {
    public static void main(String[] args) {
        singleLinkedList<Integer>list=new singleLinkedList<>();
        list.addFirst(1);
        list.addLast(10);
        list.addLast(35);
        list.addLast(20);
        list.addLast(15);
        singleLinkedList.Node<Integer>i= list.getSecondLast();
        System.out.println(i.getElement());
        System.out.println(i);
    }
}