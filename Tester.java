public class Tester {
  public static void main(String[] args) {
    IntegerSequence r = new Range(10,20);
    IntegerSequence as = new ArraySequence(r);
    while(r.hasNext()){
      System.out.print(r.next()+", ");
    }
    System.out.println();
    System.out.println("ArraySequence(seq):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    System.out.println();
  }
}
