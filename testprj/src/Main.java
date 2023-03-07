import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            int i1 = random.nextInt();
            arrayList.add(i1);
            linkedList.add(i1);
        }
        timecheck(arrayList, linkedList);
    }

    public static void timecheck(Collection<Integer> a, Collection<Integer> b) {
        // Time check for ArrayList
        long start = System.currentTimeMillis();
        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Remove time for current list1  "+(end-start)/1000.0+" seconds");

        // Time check for LinkedList
        long start1 = System.currentTimeMillis();
        Iterator<Integer> iterator1 = b.iterator();
        while (iterator1.hasNext()) {
            Integer next1 = iterator1.next();
            if (next1 % 2 == 0) {
                iterator1.remove();
            }
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Remove time for current list2  "+(end1-start1)/1000.0+" seconds");
    }

}
