package itispect.tree;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/24 1:15
 */
public class Node<T> {
    private T data;
    private int parent;

    public Node() {
    }

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, int parent) {
        this.data = data;
        this.parent = parent;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public int getParent() {
        return this.parent;
    }
}