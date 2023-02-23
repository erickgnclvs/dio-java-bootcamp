package edu.studies.datastructures;

public class LearningCircledList {

    public static class Node<T> {
        private T object;
        private Node<T> nextNode;

        public Node(T object) {
            this.nextNode = null;
            this.object = object;
        }

        public Node() {
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
    }

    public static class CircledList<T> {

        private Node<T> head;
        private Node<T> tail;
        private int sizeOfList;

        public CircledList() {
            this.tail = null;
            this.head = null;
            this.sizeOfList = 0;
        }

        @Override
        public String toString() {
            String returnString = "";

            Node<T> tempNode = this.tail;

            for (int i = 0; i < this.size(); i++) {
                returnString += "[Node{object=" +
                                tempNode.getObject() +
                                "}]--->";
                tempNode = tempNode.getNextNode();
            }
            returnString += !this.isEmpty() ? "(Return to start)" : "[]";
            return returnString;
        }

        public int size() {
            return this.sizeOfList;
        }

        public boolean isEmpty() {
            if (this.sizeOfList != 0) {
                return false;
            } else {
                return true;
            }
        }

        private Node<T> getNode(int index) {
            if (this.isEmpty()) {
                throw new IndexOutOfBoundsException("List is empty");
            }
            if (index == 0) {
                return this.tail;
            }
            Node<T> tempNode = this.tail;
            for (int i = 0; (i < index) && (tempNode != null); i++) {
                tempNode = tempNode.getNextNode();
            }
            return tempNode;
        }

        public T get(int index) {
            return this.getNode(index).getObject();
        }

        public void remove(int index) {
            if (index >= this.sizeOfList) {
                throw new IndexOutOfBoundsException("Index bigger than size of list");
            }
            Node<T> tempNode = this.tail;
            if (index == 0) {
                this.tail = this.tail.getNextNode();
                this.head.setNextNode(this.tail);
            } else if (index == 1){
                this.tail.setNextNode(this.tail.getNextNode().getNextNode());
            } else {
                for (int i = 0; i < index-1; i++) {
                    tempNode = tempNode.getNextNode();
                }
                tempNode.setNextNode(tempNode.getNextNode().getNextNode());
            }
            this.sizeOfList--;
        }

        public void add(T object) {
            Node<T> newNode = new Node<>(object);

            if (this.isEmpty()) {
                this.head = newNode;
                this.tail = this.head;
                this.head.setNextNode(this.tail);
            } else {
                newNode.setNextNode(this.tail);
                this.head.setNextNode(newNode);
                this.tail = newNode;
            }
            this.sizeOfList++;
        }


    }

    public static void main(String[] args) {
        CircledList<String> cl = new CircledList<>();
        cl.add("obj0");
        System.out.println(cl);

        cl.remove(0);
        System.out.println(cl);

        cl.add("obj1");
        System.out.println(cl);

        cl.add("obj2");
        cl.add("obj3");
        System.out.println(cl.get(0));
        System.out.println(cl.get(12));

        for (int i = 0; i < 20; i++) {
            System.out.println(cl.get(i));
        }
    }
}
