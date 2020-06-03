public class LinkedList<T> {
    /**
     * 链表
     */


    private class Node{
        public T element;
        public Node next;

        public Node(T element,Node next){
            this.element = element;
            this.next = next;
        }

        public Node(T element){
            this(element,null);
        }

        public Node(){
            this(null,null);
        }

        @Override
        public String toString(){
            return element.toString();
        }
    }

}
