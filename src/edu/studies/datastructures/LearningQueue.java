package edu.studies.datastructures;

public class LearningQueue {
    public static class Node {
        private Object object;
        private Node nextNode;

        public Node() {
        }

        public Node(Object object) {
            this.nextNode = null;
            this.object = object;
        }

        public Object getObject() {
            return object;
        }

        public void setObject(Object object) {
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

    public static class Queue {
        private Node refNodeInQueue;

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

        public void enqueue(Node newNode) {
            newNode.setNextNode(refNodeInQueue);
            refNodeInQueue = newNode;
        }

        public Node first() {
            if (!this.isEmpty()) {
                Node firstNode = refNodeInQueue;
                while (true) {
                    if (firstNode.getNextNode() != null) {
                        firstNode = firstNode.getNextNode();
                    } else {
                        break;
                    }
                }
                return firstNode;
            } else {
                return null;
            }
        }

        public Node dequeue() {
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
                return firstNode;
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
        Queue myQueue = new Queue();
        myQueue.enqueue(new Node("first"));
        myQueue.enqueue(new Node("second"));
        myQueue.enqueue(new Node("third"));
        myQueue.enqueue(new Node("fourth"));

        System.out.println(myQueue);

        System.out.println(myQueue.dequeue());

        System.out.println(myQueue);

        System.out.println(myQueue.first());

        myQueue.enqueue(new Node("last"));

        System.out.println(myQueue);
    }
}
