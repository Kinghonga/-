public class LinkedList<T> {
    /**
     * 单链表
     */

    //结点类
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


    }

    private Node dummyHead;    //定义一个虚拟的结点，其next是指向索引为0的结点，对于用户来说这个结点是不存在的，此结点作用是便于遍历
    int size;           //链表元素个数


    //无参数构造函数
    public LinkedList(){
        dummyHead = new Node(null,null);
        size=0;
    }

    //获取链表中的元素个数
    public int getSize(){
        return  size;
    }

    //返回链表是否为空
    public boolean isEmpty(){
        return size==0;
    }


    //在链表中插入新的元素   这种方法通常不是常用方法，此处用于练习
    //思想：找到要插入位置的前一个结点，先让插入的结点next指向前一个结点的next指向结点，然后让前一个结点next指向要插入的结点
    public void add(int index,T element){
        if (index <0 || index >size)
            throw new IllegalArgumentException("Add fail. Illegal index");


            Node prev = dummyHead;
            for (int i=0;i<index;i++)
                prev = prev.next;

            prev.next = new Node(element,prev.next);
            size++;

    }

    //在链表头添加元素
    public void addFirst(T element){
        add(0,element);

        size++;
    }
    //在链表尾部添加新元素
    public void addLast(T element){
        add(size,element);
    }


    //获取链表中第 index位置的元素(遍历查询)
    public T get(int index){
        if (index<0 || index>=size)
            throw new IllegalArgumentException("Add fail. Illegal index");

        Node cur =dummyHead;
        for (int i=0;i<index;i++)
            cur = cur.next;

        return cur.element;
    }

    //获取链表第一个元素
    public T getFirst(){
        return get(0);
    }

    //获取链表最后一个元素
    public T getLast(){
        return get(size-1);
    }

    //更新链表元素
    public void set(int index,T element){
        if (index<0 || index>=size)
            throw new IllegalArgumentException("Add fail. Illegal index");

        Node cur = dummyHead;
        for (int i=0;i<index;i++)
            cur = cur.next;

        cur.element = element;
    }

    //查询链表是否存在元素element
    public Boolean contains(T element){
        Node cur = dummyHead;
        while (cur !=null){
            if (element.equals(cur.element))
                return true;
                cur =cur.next;
        }
        return false;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("LinkedList:");

        Node cur = dummyHead.next;
        while (cur !=null){
            sb.append(cur.element+"-->");
            cur = cur.next;
        }
        sb.append("NULL");

        return sb.toString();
    }
}
