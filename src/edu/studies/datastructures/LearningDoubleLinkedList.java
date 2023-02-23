package edu.studies.datastructures;

public class LearningDoubleLinkedList {

    public static class DoubleNode<T> {
        private T object;
        private DoubleNode<T> nextNode;
        private DoubleNode<T> prevNode;

        public DoubleNode(T object) {
            this.object = object;
        }

        public T getObject() {
            return object;
        }

        public void setObject(T object) {
            this.object = object;
        }

        public DoubleNode<T> getNextNode() {
            return nextNode;
        }

        public void setNextNode(DoubleNode<T> nextNode) {
            this.nextNode = nextNode;
        }

        public DoubleNode<T> getPrevNode() {
            return prevNode;
        }

        public void setPrevNode(DoubleNode<T> prevNode) {
            this.prevNode = prevNode;
        }

        @Override
        public String toString() {
            return "DoubleNode{" +
                    "object=" + object +
                    '}';
        }
    }

    public static class DoubleLinkedList<T> {

        private DoubleNode<T> firstNode;
        private DoubleNode<T> lastNode;

        private int sizeOfList;

        public DoubleLinkedList() {
            firstNode = null;
            lastNode = null;
            this.sizeOfList = 0;
        }

        public int size() {
            return this.sizeOfList;
        }

        public T get(int index) {
            T object = this.getNode(index).getObject();
            return object;
        }

        public void add(T object) {
            DoubleNode<T> newNode = new DoubleNode<>(object);
            newNode.setNextNode(null); // adding node in the end of list, as its the first
            newNode.setPrevNode(lastNode);
            if (firstNode == null) {
                firstNode = newNode;
            }
            if (lastNode != null) {
                lastNode.setNextNode(newNode);
            }
            lastNode = newNode;
            sizeOfList++;
        }

        public void add(int index, T object) {
            DoubleNode<T> tempNode = getNode(index);
            DoubleNode<T> newNode = new DoubleNode<>(object);
            newNode.setNextNode(tempNode);
            if (newNode.getNextNode() != null) {
                newNode.setPrevNode(tempNode.getPrevNode());
                newNode.getNextNode().setPrevNode(newNode);
            } else {
                newNode.setPrevNode(lastNode);
                lastNode = newNode;
            }
            if (index == 0) {
                firstNode = newNode;
            } else {
                newNode.getPrevNode().setNextNode(newNode);
            }
            sizeOfList++;
        }

        public void remove(int index) {
            if (index == 0) {
                firstNode = firstNode.getNextNode();
                if (firstNode != null) {
                    firstNode.setNextNode(null);
                }
            } else {
                DoubleNode<T> tempNode = getNode(index);
                tempNode.getPrevNode().setPrevNode(tempNode.getNextNode());
                if (tempNode != lastNode) {
                    tempNode.getPrevNode().setPrevNode(tempNode.getPrevNode());
                } else {
                    lastNode = tempNode;
                }
            }
            this.sizeOfList--;
        }

        @Override
        public String toString() {
            String returnString = "";

            DoubleNode<T> tempNode = firstNode;

            for (int i = 0; i < size(); i++) {
                returnString += "[Node{object=" + tempNode.getObject() + "}]--->";
                tempNode = tempNode.getNextNode();
            }
            returnString += "null";
            return returnString;
        }

        private DoubleNode<T> getNode(int index) {
            DoubleNode<T> tempNode = firstNode;

            for (int i = 0; (i < index) && (tempNode != null); i++) {
                tempNode = tempNode.getNextNode();
            }
            return tempNode;
        }
    }

    public static void main(String[] args) {

        DoubleLinkedList<String> dll = new DoubleLinkedList<>();
        dll.add("object 1");
        dll.add("object 2");
        dll.add("object 3");
        dll.add("object 4");
        dll.add("object 5");
        dll.add("object 6");
        dll.add("object 7");

        System.out.println(dll);

        dll.remove(3);
        System.out.println(dll);
        dll.add(3, "object 99");

        System.out.println(dll);

    }
}
