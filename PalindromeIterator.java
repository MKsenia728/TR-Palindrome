package Lesson221121;

import java.util.*;

public class PalindromeIterator {

    public static List<Character> createList(String s) {
        List<Character> list = new LinkedList<>();
        String str = s.replaceAll ("\\s|,|\\.|!|\\?|:|-", "").toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        System.out.println(list);
        return list;
    }

    public static boolean isPalindrome(String s) {
        List<Character> list = createList(s);
        boolean isP = true;
        if (list.size() > 0) {
            ListIterator<Character> listIterator = list.listIterator();
            ListIterator<Character> listIteratorBack = list.listIterator(list.size());
            int size = list.size() / 2;
            while (listIterator.nextIndex() < size) {
                if (!listIterator.next().equals(listIteratorBack.previous())) isP = false;
            }
        }
        return isP;
    }


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input string : ");
//        String s = scanner.nextLine();
//        scanner.close();

        String s = "А роза упала на лапу Азора";

        long timePStart = System.currentTimeMillis();
        System.out.println("Is string \"" + s + "\" palindrome? " + isPalindrome(s));
        long timePFinish = System.currentTimeMillis();

        System.out.println("palindrome : " + (timePFinish-timePStart));

    }
}

