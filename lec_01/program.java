package lec_01;

// public class program {
//     static public void main(String[] args) {
//         System.out.println("hello world");
//     }
// }

// public class program {
//     static public void main(String[] args) {
//         short age = 10;
//         int salary = 123456;
//         System.out.println(age);        // 10
//         System.out.println(salary);     // 123456
//     }
// }

// public class program {
//     static public void main(String[] args) {
//         float e = 1.23f;
//         double pi = 3.1415;
//         System.out.println(e);          // 1.23
//         System.out.println(pi);         // 3.1415
//     }
// }

// public class program {
//     static public void main(String[] args) {
//         char ch = '1';
//         System.out.println(Character.isDigit(ch));          // true
//         ch = 'a';
//         System.out.println(Character.isDigit(ch));          // false
//     }
// }

// public class program {
//     static public void main(String[] args) {
//         boolean flag1 = 123 <= 234;
//         System.out.println(flag1);          // true
//         boolean flag2 = 123 >= 234;
//         System.out.println(flag2);          // false
//         boolean flag3 = flag1 ^ flag2;
//         System.out.println(flag3);          // true
//     }
// }

// public class program {
//     static public void main(String[] args) {
//         var a = 123.123;
//         System.out.println(a);                      // 123.123
//         System.out.println(getType(a));
//     }
//     static String getType(Object o){
//         return o.getClass().getSimpleName();        // Double
//     }
// }

// public class program {
//     static public void main(String[] args) {
//         int a = 123;
//         System.out.println(Integer.MAX_VALUE);          // 2147483647
//     }
// }

// public class program {
//         static public void main(String[] args) {
//             String s = "qwer";
//             s.charAt(2);
//             System.out.println(s.charAt(2));          // e
//         }
//     }

// public class program {
//     static public void main(String[] args) {
//         int a = 123;
//         // a = a-- - --a;
//         // a++;
//         // System.out.println(++a);     // 124
//         // System.out.println(a-- - --a);
//         System.out.println(a = a-- - --a);
//         System.out.println(a);
//         // System.out.println(a++);        // 124
//     }
// }


// public class program {
//         static public void main(String[] args) {
//             int a = 5;
//             int b = 2;
//             System.out.println(a | b);          // 7
//             // 5 -> 101
//             // 2 -> 010
//             // побитово, один или ноль -> 111
//             System.out.println(a & b);          // 0
//             // 5 -> 101
//             // 2 -> 010
//             // 000
//         }
//     }

// public class program {
//     static public void main(String[] args) {
//         boolean a = true;
//         boolean b = true;
//         System.out.println(a && b);          // true
//         System.out.println(a & b);           // true
//     }
// }

// public class program {
//     static public void main(String[] args) {
//        String s = "qwer1";                                              // 4, 0..3
//         // boolean b = s.length() >= 5 && s.charAt(4) == '1';       // true
//         // boolean b = s.length() >= 5 & s.charAt(4) == '1';        // ошибка при строке короче, проверяет обе части условия
//         System.out.println(b);
//     }
// }

// public class program {
//     static public void main(String[] args) {
//        int[] arr = new int[] {1, 2, 13, 45, 55, 6};
//        // arr[3] = 13;
//        System.out.println(arr[3]);              // 45
//     }
// }

// public class program{
//     static public void main(String[] args) {
//         int[] arr[] = new int[3][4];
//         for (int[] line : arr) {
//             for (int item : line) {
//                 System.out.printf("%d", item);
//             }
//             System.out.println();
//         }
//     }
// }

// public class program{
//     static public void main(String[] args) {
//         int[][] arr = new int[3][4];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("%d", arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.Scanner;

// public class program{
//     static public void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Hello, %s!", name);
//         iScanner.close();                               // Hello, Mike!
//         }
//     }

// public class program{
//     static public void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x+y);
//         iScanner.close();                                       //
//         }
//     }