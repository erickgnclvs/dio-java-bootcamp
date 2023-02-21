package edu.studies.datastructures;

public class LearningQueue {
    public static class Node<T> {
        private T object;
        private Node<T> nextNode;

        public Node() {
        }

        public Node(T object) {
            this.nextNode = null;
            this.object = object;
        }

        public Object getObject() {
            return object;
        }

        public void setObject(T object) {
            this.object = object;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "object=" + object +
                    '}';
        }
    }

    public static class Queue<T> {
        private Node<T> refNodeInQueue;

        public Queue() {
            this.refNodeInQueue = null;
        }

        public boolean isEmpty() {
            if (refNodeInQueue == null) {
                return true;
            } else {
                return false;
            }
        }

        public void enqueue(T obj) {
            Node newNode = new Node(obj);
            newNode.setNextNode(refNodeInQueue);
            refNodeInQueue = newNode;
        }

        public T first() {
            if (!this.isEmpty()) {
                Node firstNode = refNodeInQueue;
                while (true) {
                    if (firstNode.getNextNode() != null) {
                        firstNode = firstNode.getNextNode();
                    } else {
                        break;
                    }
                }
                return (T) firstNode.getObject();
            } else {
                return null;
            }
        }

        public T dequeue() {
            if (!this.isEmpty()) {
                Node firstNode = refNodeInQueue;
                Node tempNode = refNodeInQueue;
                while (true) {
                    if (firstNode.getNextNode() != null) {
                        tempNode = firstNode;
                        firstNode = firstNode.getNextNode();
                    } else {
                        tempNode.setNextNode(null);
                        break;
                    }
                }
                return (T) firstNode.getObject();
            } else {
                return null;
            }
        }

        @Override
        public String toString() {
            String returnString = "";
            Node tempNode = refNodeInQueue;

            if (refNodeInQueue != null){
                while (true) {
                    returnString += "[Node{object="
                            + tempNode.getObject() +
                            "}]--->";
                    if (tempNode.getNextNode() != null) {
                        tempNode =  tempNode.getNextNode();
                    } else {
                        returnString += "null";
                        break;
                    }
                }
            } else {
                returnString = "null";
            }

            return returnString;
        }
    }

    public static void main(String[] args) {
        Queue<String> myQueue = new Queue<>();
        myQueue.enqueue("first");
        myQueue.enqueue("second");
        myQueue.enqueue("third");
        myQueue.enqueue("fourth");

        System.out.println(myQueue);

        System.out.println(myQueue.dequeue());

        System.out.println(myQueue);

        System.out.println(myQueue.first());

        myQueue.enqueue("last");

        System.out.println(myQueue);
    }
}
