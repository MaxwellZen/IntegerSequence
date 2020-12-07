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
    data = ans;
    currentIndex = 0;
  }
  public void reset() {
    currentIndex=0;
  }
  public boolean hasNext() {
    return this.currentIndex < this.data.length;
  }
  public int next() throws NoSuchElementException {
    if (hasNext()) {
      int temp = data[currentIndex];
      currentIndex++;
      return temp;
    } else {
      throw new NoSuchElementException("There is no next element");
    }
  }
  public int length() {
    return data.length;
  }
}
