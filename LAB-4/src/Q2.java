public class Q2 {
    public static void main(String[] args) {
        singleLinkedList<Integer>list=new singleLinkedList<>();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        System.out.println("Size of list: "+list.methodSize(list));
        System.out.println("Size of list: "+list.size());

    }
}
