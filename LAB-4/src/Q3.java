public class Q3 {
    public static void main(String[] args) {
        singleLinkedList<Integer>list=new singleLinkedList<>();

        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.rotate();
        while (!list.isEmpty()){
            System.out.print("  "+list.removeFirst()+" ");
        }
    }
}
