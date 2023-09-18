package by.aleksandrphilimonov.task3;

public class Starter {
    public static void main(String[] args) {
        String s = "Abra cadabra  boom   ";
        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWordV__2(s));
    }

    public static int lengthOfLastWord(String str) {
        String s = str.trim();
        int counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }

    public static int lengthOfLastWordV__2(String str) {
        String s = str.trim();
        String[] sArray = s.split(" ");
        return sArray[sArray.length - 1].length();
    }
}
