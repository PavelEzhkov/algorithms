package ru.algoritms.chapter4;

public class Node {
    public String name;
    public Node[] children;
    public Task1.State state;

    public Node[] getAdjacent() {
    return children;}
}
