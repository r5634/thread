package StackQueue;


import java.util.ArrayList;
import java.util.EmptyStackException;


public class MyStack<E> {
private ArrayList<E> al;


public MyStack() {
al = new ArrayList<E>();
}


public void push(E item) {
al.add(item);
}


public E pop() {
if (!isEmpty())
return al.remove(size()-1);
else
throw new EmptyStackException();
}


public boolean isEmpty() {
return (al.size() == 0);
}


public E peek() {
if (!isEmpty())
return al.get(size()-1);
else
throw new EmptyStackException();
}


public int size() {
return al.size();
}


@Override
public String toString() {
return "MyStack [al=" + al.toString() + "]";
}


}
