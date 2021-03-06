package com.company.www.utils.autoCheck;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MyTrieTest {
  @Test
  public void addDictionary() throws Exception {}

  @Test
  public void addWordToTrie() throws Exception {
    MyTrie myTrie = new MyTrie();
    ArrayList<String> words = new ArrayList<>();
    words.add("abhishek");
    words.add("mongoshake");
    words.add("anjali");
    words.add("mamta");
    myTrie.addDictionary(words);
    myTrie.addWordToTrie("abhay");
    ArrayList<String> result = myTrie.suggestWords("m");
    result.forEach(word -> System.out.println(word));
//    assertFalse(myTrie.isContains("mamta"));
  }


  @Test
  public void isContains() throws Exception {

  }
}