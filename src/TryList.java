public class TryList {
    static int sum(IntList l) {
        if (l.isEmpty()) return 0;
        return l.getHead() + sum(l.getTail());
    }

    public static void main(String[] args) {
        IntList myList =  new NonEmptyIntList(3,  new EmptyIntList().cons(2).cons(1));
        IntList myList2 = new NonEmptyIntList(3,  new EmptyIntList().cons(2).cons(1));
        int result = sum(myList);
        System.out.println(result);
        IntList myLongerList = myList.cons(8);
        result = sum(myLongerList);
        System.out.println(result);
        result = myList.sum();
        System.out.println(result);
        System.out.println(myList.equals(myList2));
    }
}
