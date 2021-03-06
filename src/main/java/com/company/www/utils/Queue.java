package com.company.www.utils;

import com.company.www.utils.ifaces.QueueInterface;

public class Queue<T> implements QueueInterface<T> {
  LinkedList<T> list = new LinkedList<T>();

  @Override
  public void add(T Object) {
    list.addAtEnd(Object);
  }

  @Override
  public void remove(T Object) {
    list.removeFromFront();
  }

  @Override
  public void printQueue() {
    list.printList();
  }
}
