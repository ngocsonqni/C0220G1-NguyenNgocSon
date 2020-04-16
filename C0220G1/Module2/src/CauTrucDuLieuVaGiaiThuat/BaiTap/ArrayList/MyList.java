package CauTrucDuLieuVaGiaiThuat.BaiTap.ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];
    public MyList(){
        elements=new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements=new Object[capacity];
    }
    private void ensureCapa(int minCapacity){
        int newSize=elements.length+minCapacity;
        elements= Arrays.copyOf(elements,newSize);
    }
    public void add(int index, E e) {
        if (size == elements.length) {
            ensureCapa(1);
        }
        size++;
        for (int i=elements.length-1;i>index;i--){
            elements[i]=elements[i-1];
        }
        elements[index] = e;
    }
    public E remove(int index){
        Object a = elements[index];
        for (int i=index;i<elements.length-1;i++){
            elements[i]=elements[i+1];
        }
        return (E) a;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    public int size(){
        return this.size;
    }
    public E[] clone(){
        return (E[]) elements;
    }
    public boolean contains(E o){
        for (int i=0;i<elements.length;i++){
            if (elements[i]==o){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o){
        for (int i=0;i<elements.length;i++){
            if (elements[i]==o){
                return i;
            }
        }
        return -1;
    }
    public boolean add(E o){
            if (size == elements.length) {
                ensureCapa(1);
            }
            elements[size++] = o;
        return true;
    }
    public void clear(){
        for (int i=0;i<elements.length;i++){
            elements[i]=null;
        }
        size=0;
    }
}
