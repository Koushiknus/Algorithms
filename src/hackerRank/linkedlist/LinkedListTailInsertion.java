package hackerRank.linkedlist;

public class LinkedListTailInsertion {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }


    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        // If no node is available , create the first node and insert it
        if(head == null){
            head = new SinglyLinkedListNode(data);
            head.data = data;
        }else{
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            newNode.data = data;
            SinglyLinkedListNode currentNode = head;
            //Move to the end of Linked List through traversal
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        return head;

    }
}
