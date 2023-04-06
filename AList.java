// Program: AList
// Written by: Chevis Cardoos
// Program Description: Creates Array list implementing the AListADT ADT. Will Test AListerInteger and AListTesterPerson
// File name:AList.java
// File description:
// Other files in this project:N/A
// Challenge: Implementing both interfaces in the same class, AListADT and DLLADT have some overlapping methods, 
// but they vary slightly in their method signatures. 
//               Revision History
// Date:                   By:                  Action:
// ---------------------------------------------------
// 03/30/23				ccc						Outlined methods from AlistADT
// 03/31/23				ccc						implemented methods
// 04/01/23				ccc						implemented DLLADT methods
// 04/02/23				ccc						tested AListTesterInteger
// 												realized I was missing Person class and Tested AListTesterPerson.


import java.util.ArrayList;
import java.util.NoSuchElementException;

public class AList<E> implements AListADT<E>, DLLADT<E> {

    private ArrayList<E> data;

    public AList() {
        data = new ArrayList<>();
    }

    @Override
    public boolean add(E element) {
        return data.add(element);
    }

    @Override
    public void add(int index, E element) {
        data.add(index, element);
    }

    @Override
    public E get(int index) {
        return data.get(index);
    }

    @Override
    public E remove(int index) {
        return data.remove(index);
    }

    @Override
    public boolean remove(E element) {
        return data.remove(element);
    }

    @Override
    public E set(int index, E element) {
        return data.set(index, element);
    }

    @Override
    public boolean contains(E element) {
        return data.contains(element);
    }

    @Override
    public int indexOf(E element) {
        return data.indexOf(element);
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public int size() {
        return data.size();
    }

    
    public void clear() {
        data.clear();
    }

    
    public E[] toArray() {
        return (E[]) data.toArray();
    }

    @Override
    public String toString() {
        return data.toString();
    }

    @Override
    public void addFirst(E data) {
        this.add(0, data);
    }

    @Override
    public void addLast(E data) {
        this.add(data);
    }

    @Override
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return get(0);
    }

    @Override
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return get(size() - 1);
    }

    @Override
    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        remove(0);
    }

    @Override
    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        remove(size() - 1);
    }
}
