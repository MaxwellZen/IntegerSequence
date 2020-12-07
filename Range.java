import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){
    this.start = start;
    this.end = end;
    this.current = this.start;
  }
  public void reset(){
    current = start;
  }
  public int length(){
    return end - start + 1;
  }
  public boolean hasNext(){
    return current <= end;
  }

  //@throws NoSuchElementException
  public int next() throws NoSuchElementException{
    if (hasNext()) {
      int temp = current;
      current ++;
      return temp;
    } else {
      throw new NoSuchElementException("There is no next element");
    }
  }

}
