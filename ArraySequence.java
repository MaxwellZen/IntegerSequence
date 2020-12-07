import java.util.NoSuchElementException;
import java.util.*;
import java.io.*;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    data = new int[other.length];
    for (int i = 0; i < other.length; i++) {
      data[i]=other[i];
    }
    currentIndex=0;
  }
  public ArraySequence(IntegerSequence otherseq) {
    otherseq.reset();
    int[] ans = new int[otherseq.length()];
    for (int i = 0; otherseq.hasNext(); i++) {
      ans[i]=otherseq.next();
    }
  }
  public void reset() {
    currentIndex=0;
  }
  public boolean hasNext() {
    return currentIndex < data.length;
  }
  public int next() {
    int temp = data[currentIndex];
    currentIndex++;
    return temp;
  }
  public int length() {
    return data.length;
  }
}
