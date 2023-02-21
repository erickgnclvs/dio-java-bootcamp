package edu.studies.datastructures;

public class LearningStack {
// LIFO - Last In First Out
    public class Node {

        private int data;
        private Node nextNode = null;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }

    public class Stack {

        private Node refNodeInStack;

        public Stack() {
            this.refNodeInStack = null;
        }

        public boolean isEmpty(){
            if (refNodeInStack == null) {
                return true;
            }
            return false;
        }

        public Node top() {
            return refNodeInStack;
        }

        public void push(Node newNode) {
            Node refTemp = refNodeInStack;
            refNodeInStack = newNode;
            refNodeInStack.setNextNode(refTemp);
        }

        public Node pop() {
            if (!this.isEmpty()) {
                Node popedNode = refNodeInStack;
                refNodeInStack = refNodeInStack.getNextNode();
                return popedNode;
            }
            return null;
        }
    }

    public static void main(String[] args) {

    }
}
