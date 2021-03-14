/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        //迭代
        // LinkedList<Integer> res = new LinkedList<Integer>();
        // LinkedList<Node> stack = new LinkedList<Node>();

        // if (root == null) {
        //     return res;
        // }
        // stack.add(root);
        // while (!stack.isEmpty()) {
        //     Node node = stack.pollLast();
        //     res.add(node.val);
        //     Collections.reverse(node.children);
        //     for (Node item : node.children) {
        //         stack.add(item);
        //     }
        // }
        // return res;

        //递归
        LinkedList<Integer> res = new LinkedList<Integer>();
        if (root == null) {
            return res;
        }
        res.add(root.val);
        for (Node cur : root.children) {
            res.addAll(preorder(cur));
        }
        return res;
    }
}