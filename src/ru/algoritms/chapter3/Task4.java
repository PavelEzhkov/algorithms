package ru.algoritms.chapter3;


import java.util.Stack;

public class Task4 {
    Stack stackNewest, stackOldest;

    public Task4(){
        stackNewest = new Stack();
        stackOldest = new Stack();
    }

    public int size(){
        return stackNewest.size() + stackOldest.size();
    }

    public void add(Object value){
        stackNewest.push(value);
    }

    public Object peek(){
        shiftStacks();
        return stackOldest.peek();
    }

    public Object remove(){
        shiftStacks();
        return stackOldest.pop();
    }

    private void shiftStacks() {
        if (stackOldest.isEmpty()){
            while (!stackNewest.isEmpty()){
                stackOldest.push(stackNewest.pop());
            }
        }
    }
}
