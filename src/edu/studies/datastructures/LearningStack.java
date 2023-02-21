package edu.studies.datastructures;

public class LearningStack {
// LIFO - Last In First Out
    public static class Node {

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

    public static class Stack {
        @Override
        public String toString() {
            String returnString = "--------\n";
            returnString += "  Stack\n";
            returnString += "--------\n";

            Node tempNode = refNodeInStack;

            while (true) {
                if (tempNode != null) {
                    returnString += "[Node{data=" + tempNode.getData() + "}]\n";
                    tempNode = tempNode.getNextNode();
                } else {
                    break;
                }
            }
            returnString += "========\n";

            return returnString;

        }

        private Node refNodeInStack;

        public Stack(Node refNodeInStack) {
            this.refNodeInStack = refNodeInStack;
        }

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
        Stack myStack = new Stack();

        myStack.push(new Node((1)));
        myStack.push(new Node((2)));
        myStack.push(new Node((3)));
        myStack.push(new Node((4)));

        System.out.println(myStack.toString());

        myStack.push(new Node(99));

        System.out.println(myStack.toString());


    }
}
