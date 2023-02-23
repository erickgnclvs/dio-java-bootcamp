package edu.studies.datastructures;

import java.util.Objects;

public class LearningBinaryTree {

    public static class BinNode<T extends Comparable<T>> {
        private BinNode<T> leftNode;
        private BinNode<T> rightNode;
        private T object;

        public BinNode() {
        }

        public BinNode(T object) {
            this.object = object;
            this.leftNode = null;
            this.rightNode = null;
        }

        public BinNode<T> getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(BinNode<T> leftNode) {
            this.leftNode = leftNode;
        }

        public BinNode<T> getRightNode() {
            return rightNode;
        }

        public void setRightNode(BinNode<T> rightNode) {
            this.rightNode = rightNode;
        }

        public T getObject() {
            return object;
        }

        public void setObject(T object) {
            this.object = object;
        }

        @Override
        public String toString() {
            return "BinNode{" +
                    "object=" + object +
                    '}';
        }
    }

    public static class BinaryTree<T extends Comparable<T>> {

        private BinNode<T> rootNode;

        public BinaryTree() {
            this.rootNode = null;
        }

        private BinNode<T> insert(BinNode<T> currentNode, BinNode<T> newNode) {
            if (currentNode == null) {
                return newNode;
            } else if (newNode.getObject().compareTo(currentNode.getObject()) < 0) {
                currentNode.setLeftNode(insert(currentNode.getLeftNode(), newNode));
            } else {
                currentNode.setRightNode(insert(currentNode.getRightNode(), newNode));
            }
            return currentNode;
        }

        public void insert(T object) {
            BinNode<T> newNode = new BinNode<>(object);
            this.rootNode = insert(rootNode, newNode);
        }

        private void showInOrder(BinNode<T> currentNode) {
            if (currentNode != null) {
                showInOrder(currentNode.getLeftNode());
                System.out.print(currentNode.getObject() + ", ");
                showInOrder(currentNode.getRightNode());
            }
        }

        public void showInOrder() {
            System.out.println("\n Showing in order");
            showInOrder(this.rootNode);
        }

        private void showPostOrder(BinNode<T> currentNode) {
            if (currentNode != null) {
                showPostOrder(currentNode.getLeftNode());
                showPostOrder(currentNode.getRightNode());
                System.out.print(currentNode.getObject() + ", ");
            }
        }

        public void showPostOrder() {
            System.out.println("\n Showing post order");
            showPostOrder(this.rootNode);
        }

        private void showPreOrder(BinNode<T> currentNode) {
            if (currentNode != null) {
                System.out.print(currentNode.getObject() + ", ");
                showPreOrder(currentNode.getLeftNode());
                showPreOrder(currentNode.getRightNode());
            }
        }

        public void showPreOrder() {
            System.out.println("\n Showing pre order");
            showPreOrder(this.rootNode);
        }

        public void remove(T object) {
            try {
                BinNode<T> currentNode = this.rootNode;
                BinNode<T> parentNode = null;
                BinNode<T> sonNode = null;
                BinNode<T> tempNode = null;

                while (currentNode != null && !currentNode.getObject().equals(object)){
                    parentNode = currentNode;
                    if (object.compareTo(currentNode.getObject()) < 0) {
                        currentNode = currentNode.getLeftNode();
                    } else {
                        currentNode = currentNode.getRightNode();
                    }
                }

                if (currentNode == null) {
                    System.out.println("Object not found - try block");
                }
                
                if (parentNode == null) {
                    if (currentNode.getRightNode() == null) {
                        this.rootNode = currentNode.getLeftNode();
                    } else if (currentNode.getLeftNode() == null) {
                        this.rootNode = currentNode.getRightNode();
                    } else {
                        for (tempNode = currentNode, sonNode = currentNode.getLeftNode();
                             sonNode.getRightNode() != null;
                             tempNode = sonNode, sonNode = sonNode.getLeftNode()) {
                            if (sonNode != currentNode.getLeftNode()) {
                                tempNode.setRightNode(sonNode.getLeftNode());
                                sonNode.setLeftNode(rootNode.getLeftNode());
                            }
                        }
                        sonNode.setRightNode(rootNode.getRightNode());
                        rootNode = sonNode;
                    }
                } else if (currentNode.getRightNode() == null) {
                    if (parentNode.getLeftNode() == currentNode) {
                        parentNode.setLeftNode(currentNode.getLeftNode());
                    } else {
                        parentNode.setRightNode(currentNode.getLeftNode());
                    }
                } else if (currentNode.getLeftNode() == null) {
                    if (parentNode.getLeftNode() == currentNode) {
                        parentNode.setLeftNode(currentNode.getRightNode());
                    } else {
                        parentNode.setRightNode(currentNode.getRightNode());
                    }
                } else {
                    for (
                            tempNode = currentNode, sonNode = currentNode.getLeftNode();
                            sonNode.getRightNode() != null;
                            tempNode = sonNode, sonNode = sonNode.getRightNode()
                    ) {
                        if (sonNode != currentNode.getLeftNode()) {
                            tempNode.setRightNode(sonNode.getLeftNode());
                            sonNode.setLeftNode(currentNode.getLeftNode());
                        }
                        sonNode.setRightNode(currentNode.getRightNode());
                        if (parentNode.getLeftNode() == currentNode) {
                            parentNode.setLeftNode(sonNode);
                        } else {
                            parentNode.setRightNode(sonNode);
                        }
                    }
                }

            } catch (NullPointerException error) {
                System.out.println("Object not found - catch block");
            }
        }
    }

    public abstract class TreeObject<T> implements Comparable<T> {

        public abstract boolean equals(Object o);
        public abstract int hashCode();
        public abstract int compareTo(T other);
        public abstract String toString();

    }

    public static class Obj extends TreeObject<Obj> {

        Integer myValue;

        public Obj(Integer myValue) {
            this.myValue = myValue;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Obj obj = (Obj) o;
            return Objects.equals(myValue, obj.myValue);
        }

        @Override
        public int hashCode() {
            return Objects.hash(myValue);
        }

        @Override
        public int compareTo(Obj other) {
            int i = 0;
            if (this.myValue > other.myValue) {
                i = 1;
            } else if (this.myValue < other.myValue) {
                i = -1;
            }
            return i;
        }

        @Override
        public String toString() {
            return myValue.toString();
        }
    }

    public static void main(String[] args) {
        BinaryTree<Obj> br = new BinaryTree<>();

        br.insert(new Obj(13));
        br.insert(new Obj(10));
        br.insert(new Obj(25));
        br.insert(new Obj(2));
        br.insert(new Obj(12));
        br.insert(new Obj(20));
        br.insert(new Obj(31));
        br.insert(new Obj(29));

        br.showInOrder();
        br.showPreOrder();
        br.showPostOrder();
    }
}
