public class Q5 {
    public static void main(String[] args) {
        singleLinkedList<Integer>L=new singleLinkedList<>();
        singleLinkedList<Integer>M=new singleLinkedList<>();
        singleLinkedList<Integer>K=new singleLinkedList<>();
        L.addFirst(1);
        L.addLast(2);

        M.addFirst(6);
        M.addLast(7);

        K.addFirst(1);
        K.addLast(2);

        if (L.equals(L,M))
            System.out.println("list M and list L equals" );
        else
            System.out.println("list M and list L not equals" );

        if (K.equals(L,K))
            System.out.println("list M and list L equals" );
        else
            System.out.println("list K and list L not equals" );
    }
}
