package com.LinkedList;

class Solution {
     /**
      * leetcode题目：
      * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
      * 现有一个链表 -- head = [4,5,1,9]
      */

      public class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
             }
      }


      public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
      }
}
