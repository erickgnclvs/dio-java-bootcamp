package edu.studies.datastructures;

public class LearningNode {

    private String content;
    private LearningNode nextNode;

    public LearningNode(String content) {
        this.content = content;
        this.nextNode = null;
    }

//    @Override
//    public String toString() {
//        return "LearningNode{" +
//                "content='" + content + '\'' +
//                ", nextNode=" + nextNode +
//                '}';
//    }


    @Override
    public String toString() {
        return "LearningNode{" +
                "content='" + content + '\'' +
                '}';
    }

    public LearningNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(LearningNode nextNode) {
        this.nextNode = nextNode;
    }

    public static void main(String[] args) {
        LearningNode node1 = new LearningNode("node 1 content");

        LearningNode node2 = new LearningNode("node 2 content");
        node1.setNextNode(node2);

        LearningNode node3 = new LearningNode("node 3 content");
        node2.setNextNode(node3);

        LearningNode node4 = new LearningNode("node 4 content");
        node3.setNextNode(node4);

        System.out.println(node1);
        System.out.println(node1.getNextNode());

        System.out.println("-------------------");

        System.out.println(node1);
        System.out.println(node1.getNextNode());
        System.out.println(node1.getNextNode().getNextNode());
        System.out.println(node1.getNextNode().getNextNode().getNextNode());
        System.out.println(node1.getNextNode().getNextNode().getNextNode().getNextNode());

//        Null pointer exception
//        System.out.println(node1.getNextNode().getNextNode().getNextNode().getNextNode().getNextNode());
    }
}
