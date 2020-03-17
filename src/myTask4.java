import java.util.Arrays;

public class myTask4 {
    public static void main(String[] args) {
        // задание 4 проверить, является ли фраза палиндромом
        //String myStr1 = "вася упал на пол"; // false
        String myStr1 = "а роза упала на лапу азора"; // true

        // в программе не использую, оставил для себя
        /*String[] words = myStr1.split("\\s");
        System.out.println(Arrays.toString(words)); // превратили строку в массив
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(words)); // получили перевернутый массив*/

        // для сравнения строк в исходной строке переворачиваем слова через StringBuffer
        StringBuffer sbf = new StringBuffer(myStr1);
        sbf = sbf.reverse();
        String myStr2 = new String(sbf);
        myStr1 = myStr1.replaceAll("\\s", ""); // убрали пробелы в исходной строке
        myStr2 = myStr2.replaceAll("\\s", ""); // убрали пробелы в перевернутой строке
        System.out.println(myStr1); // исходная строка без пробелов
        System.out.println(myStr2); // перевернутая строка без пробелов
        System.out.println(myStr1.equals(myStr2)); // сравниваем исходную и перевернутую строки
    }
}
