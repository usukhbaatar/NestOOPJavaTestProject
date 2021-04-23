/*
1. input and output
    - stdin, stdout    []
    - file
    - Network, serial
    - input stream, output stream
    - GUI
2. Exception
3. Array
    array
    ArrayList
 */
package mn.nest.oop.lesson1;

import java.util.ArrayList;
import java.util.Scanner; // Scanner class-ийг import-лох

public class Main {

    public static int foo(int x) throws Exception { // алдаа үүсэх боломжтой функц
        if (x < 0) {
            // x сөрөн утгатай бол алдаа үүсгэнэ
            throw new Exception("0-ees baga baina!");
        } else {
            return x + 1;
        }
    }

    public static void main(String[] args) {
        // System.out stdout - тай ажилладаг объект
        // System.err stderr - алдааны мэдэгдэл гаргадаг гаралтын урсгал
        // System.in  stdin  - оролтын урсгал, System.util.Scanner - урсгалтай ажиллагад

        // Output
        System.out.println("This is output text!");
        System.out.print(10 + 12);    // cout << 10 + 12;
        System.out.println(10 + 12);  // cout << 10 + 12 << endl;

        // Input
        Scanner sc = new Scanner(System.in);  // stdin-ээс мэдээлэ уншиж авах объект

        // String s = sc.next(); // String унших
        // String line = sc.nextLine(); // мөр уншиж авах

        int x = sc.nextInt(); // бүхэл тоо унших x = 0

        // Exception буюу алдаа
        try {
            int y = 10 / x; // x = 0 бол алдаа гарна.
        } catch (Exception e) {
            System.out.println("Aldaatai!");
            System.out.println(e.getMessage());
        }

        try {
            int z = foo(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Array
        int[] arr = new int[20]; // 20 урттай [0..19] int төрлийн array
        double[] doubleArray = new double[30];

        ArrayList<Integer> arrayList = new ArrayList<>(); // c++ ийн вектор



    }
}

/*
1. Өгсөн дарааллаас хамгийн их анхны тоог олно.
2. ArrayList ийг ашиглаад туршиж үзэх
3. Өгсөн бүхэл тооны бүхэл язгуурыг олдог функц бичээрэй. Хэрэв сөрөг утга орж ирвэл алдаа үүсгээрэй.
 */