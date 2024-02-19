public class Q4 {
    public static void main(String[] args) {
        singleLinkedList<Integer>L=new singleLinkedList<>();
        singleLinkedList<Integer>M=new singleLinkedList<>();
        L.addFirst(1);
        L.addLast(2);
        L.addLast(3);
        L.addLast(4);
        L.addLast(5);
        M.addFirst(6);
        M.addLast(7);
        M.addLast(8);
        M.addLast(9);
        M.addLast(10);
        L=L.margin(L,M);
        while (!L.isEmpty()){
            System.out.print("  "+L.removeFirst()+" ");
        }

    }
}
