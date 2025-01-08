//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        MyArrayList<Integer> list = new MyArrayList<Integer>();
        list.addToBack(1);
        list.addToBack(2);
        list.addToBack(3);
        list.addToBack(4);
        list.addToBack(5);
        list.addToBack(6);
        list.addToBack(7);
        list.addToBack(8);
        list.addToBack(9);
        list.addToBack(10);
        list.addToFront(11);
        list.addToFront(11);
        list.addToFront(11);
        list.addToFront(11);
        list.addToFront(11);
        list.addToFront(11);
        list.addToFront(11);
        list.addToBack(12);
        list.addToBack(13);
        System.out.println(list.toString());
//        list.addToFront(3);
//        System.out.println(list.toString());
    }
}