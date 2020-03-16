public class myTask2 {
    public static void main(String[] args) {
//        задание 2 - найдите самое длинное слово в предложении
        int a = 0;
        int b = 0;
        String str1 = "На части строку разбить";
        String str2 = "";
        String[] words = str1.split("\\s");
        for (String subStr:words) {
            char[] myChar = subStr.toCharArray();
            a = myChar.length;
            if (a > b) {
                b = a;
                str2 = subStr;
            }
            //System.out.println(subStr);
        }
        System.out.println(b);
        System.out.println(str2);
    }
}
