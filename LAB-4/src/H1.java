public class SinglyLinkedList {
    private Node head;

    // other methods in the SinglyLinkedList class

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SinglyLinkedList otherList = (SinglyLinkedList) obj;
        Node current = this.head;
        Node otherCurrent = otherList.head;

        while (current != null && otherCurrent != null) {
            if (current.data != otherCurrent.data) {
                return false;
            }
            current = current.next;
            otherCurrent = otherCurrent.next;
        }

        return current == null && otherCurrent == null;
    }

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}