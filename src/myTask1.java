import java.util.Arrays;

public class myTask1 {
    public static void main(String[] args) {
//        задание 1 - даны 2 слова из четн. числа букв...
        String str1 = "roma";
        String str2 = "nikita";
        System.out.println(str1);
        System.out.println(str2);
        char[] str1ToArray = str1.toCharArray();
        //System.out.println(str1ToArray);
        char[] str1NewArr = Arrays.copyOf(str1ToArray, str1ToArray.length/2);
        //System.out.println(str1NewArr);

        char[] str2ToArray = str2.toCharArray();
        //System.out.println(str2ToArray);
        char[] str2NewArr = new char[str2ToArray.length/2];
        System.arraycopy(str2ToArray, 3, str2NewArr, 0, 3);
        //System.out.println(str2NewArr);
        char[] result = new char[str1ToArray.length/2 + str2ToArray.length/2];
        // result = str1NewArr + str2NewArr; - так нельзя
        String a = new String(str1NewArr);
        String b = new String(str2NewArr);
        String c = new String(a + b);
        System.out.println(c);
    }
}
