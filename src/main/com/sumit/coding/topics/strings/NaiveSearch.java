package main.com.sumit.coding.topics.strings;

public class NaiveSearch {

    public static void main(String[] args) {

        final String txt = "lkjsdfhaiuehaoewiuraoikdehjakdsfhlsjdkihalieushralkehfailuewhfaklfjsdhfliuewahf";
        final String pat = "ahf";

        System.out.print("Pattern found at index -> ");
        NaiveSearch.search(txt, pat);
    }

    private static void search(String txt, String pat) {

        int n = txt.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {

            int j;
            for (j = 0; j < m; j++)
                if (txt.charAt(i + j) != pat.charAt(j))
                    break;

            if (j == m)
                System.out.print(i + ", ");
        }
    }
}
