package ru.gb;

/**
 * Hello world!
 *
 */
// public class introduction {
//     static int[] AddItemInArray(int[] array, int item) {
//         int length = array.length;
        
//         int[] temp = new int[length + 1];
//         System.arraycopy(array, 0, temp, 0, length);
//         temp[length] = item;
//         return temp;
//     }
//     public static void main( String[] args )
//     {
//         int[] a = new int[] { 0, 9 };
//         for (int i : a) { System.out.printf("%d ", i); }
//         a = AddItemInArray(a, 11);
//         a = AddItemInArray(a, 111);
//         a = AddItemInArray(a, 1111);
//         System.out.println();
//         for (int j : a) { System.out.printf("%d ", j); }
//         System.out.println();
//     }
// }

// Коллекции

import java.util.ArrayList;

// public class introduction {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<Integer>();
//         //ArrayList list = new ArrayList();
//         list.add(2809);


//         for (Object o : list) {
//             System.out.println(o);
//         }
//     }
// }

//

// public class introduction {
//     public static void main(String[] args) {
//         ArrayList<Integer> list1 = new ArrayList<Integer>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         ArrayList<Integer> list3 = new ArrayList<>(10);
//         ArrayList<Integer> list4 = new ArrayList<>(list3);
//         System.out.println(list3);
//         list3.add(123);
//         System.out.println(list4);
//     }
// }

//

// public class introduction {
//     public static void main(String[] args) {
//         int day = 29;
//         int month = 9;
//         int year = 1990;
//         Integer[] date = { day, month, year };
//         List<Integer> d = Arrays.asList(date);
//         System.out.println(d); // [29, 9, 1990]
//     }
// }

//

// public class introduction {
//     public static void main(String[] args) {
//         StringBuilder day = new StringBuilder("28");
//         StringBuilder month = new StringBuilder("9");
//         StringBuilder year = new StringBuilder("1990");
//         List<StringBuilder> d = Arrays.asList(day, month, year);
//         System.out.println(d); // [29, 9, 1990]
//         day = new StringBuilder("09");
//         System.out.println(d); // [29, 09, 1990]
//     }
// }

//

// public class introduction {
//     public static void main(String[] args) {
//         Character value = null;
//         List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
//         System.out.println(list1);
//         // list1.remove(1); // java.lang.UnsupportedOperationException
//         List<Character> list2 = List.copyOf(list1);
        
//     }
// }

//

import java.util.*;

public class introduction {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            col.remove();
            System.out.println(col.next());
            //col.next();
        }

    }
}