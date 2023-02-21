package edu.studies.datastructures;

public class LearningLinkedList
{
    public static class Node<T> {

        private T object;
        private Node<T> nextNode;

        public Node() {
            this.nextNode = null;
        }

        public Node(T object) {
            this.object = object;
            this.nextNode = null;
        }

        public Node(T object, Node<T> nextNode) {
            this.object = object;
            this.nextNode = nextNode;
        }

        public T getObject() {
            return object;
        }

        public void setObject(T object) {
            this.object = object;
        }

        public Node<T> getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node<T> nextNode) {
            this.nextNode = nextNode;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "object=" + object +
                    '}';
        }

        public String toStringLinked() {
            String str = "Node{" +
                    "object=" + object +
                    '}';
            if (nextNode != null) {
                str += "->" + nextNode.toString();
            } else {
                str += "->null";
            }
            return str;
        }
    }

    public static class LinkedList<T> {

        Node<T> referenceIn;

        public LinkedList() {
            this.referenceIn = null;
        }

        public boolean isEmpty() {
            if (referenceIn == null) {
                return true;
            } else {
                return false;
            }
        }

        public int size() {
            int sizeOfList = 0;
            Node<T> tempReference = referenceIn;
            while (true) {
                if (tempReference != null) {
                    sizeOfList++;
                    if (tempReference.getNextNode() != null) {
                        tempReference = tempReference.getNextNode();
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }

            return sizeOfList;
        }

        public void add(T object) {
            Node<T> newNode = new Node<>(object);
            if (this.isEmpty()) {
                referenceIn = newNode;
                return;
            }

            Node<T> tempNode = referenceIn;
            for (int i = 0; i < this.size()-1; i++) {
                tempNode = tempNode.getNextNode();
            }

            tempNode.setNextNode(newNode);
        }

        public T remove(int index) {
            Node<T> nodeToRemove = this.getNode(index);
            if (index == 0) {
                referenceIn = nodeToRemove.getNextNode();
                return nodeToRemove.getObject();
            }

            Node<T> nodeBefore = getNode(index - 1);
            nodeBefore.setNextNode(nodeToRemove.getNextNode());
            return nodeToRemove.getObject();
        }

        public T get(int index) {
            return getNode(index).getObject();
        }

        @Override
        public String toString() {
            String returnString = "";

            Node<T> tempNode = referenceIn;
            for (int i=0; i<this.size(); i++) {
                returnString += "Node{object=" + tempNode.getObject()
                                +   "}--->";
                tempNode = tempNode.getNextNode();
            }

            returnString += "null";
            return returnString;
        }

        private void indexValidator(int index) {
            if (index >= size()) {
                int lastIndex = size()-1;
                throw new IndexOutOfBoundsException("No context on index " + index +
                        ".\nThis list has " + lastIndex + " indexes.");
            }
        }

        private Node<T> getNode(int index) {

            indexValidator(index);

            Node<T> tempNode = referenceIn;
            Node<T> returnNode = null;

            for (int i = 0; i <= index; i++) {
                returnNode = tempNode;
                tempNode = tempNode.getNextNode();
            }
            return returnNode;
        }
    }

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("test1");
        ll.add("test2");
        ll.add("test3");
        ll.add("test4");

        System.out.println(ll.get(0));
        System.out.println(ll.get(1));
        System.out.println(ll.get(2));
        System.out.println(ll.get(3));

        System.out.println(ll);

        System.out.println(ll.remove(3));
        System.out.println(ll);

    }
}
