package ict4315.unit4;

import java.util.ArrayList;
import java.util.List;


public class Node<T> {
    private T data = null;
    private Node<T> parent = null;
    private List<Node<T>> children = new ArrayList<>();

    public Node(T data) {
        this.data = data;
    }
    public void setParent(Node<T> parent) {
     //   parent.addChild(this);
        this.parent = parent;
    }
    public void addChild(T data) {
        Node<T> child = new Node<T>(data);
        child.setParent(this);
        this.children.add(child);

    }
    public List<Node<T>> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return data.toString();
    }


}
