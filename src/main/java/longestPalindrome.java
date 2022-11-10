import java.util.*;
import java.util.stream.Collectors;

public class longestPalindrome {

    public static void main(String[] args) {
        longestPalindrome longestPalindrome = new longestPalindrome();
       // String str = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        // boolean fla = longestPalindrome.longPalindrome(str);
        String str = "ababd";
        char a = 's';
        char b = 'd';
        int i = 0;
        longestPalindrome lp = new longestPalindrome();

        System.out.println(lp.longestPalindrome(str));
    }

    public String longestPalindrome(String s) {
        List<String> temp = new ArrayList<>();
        if(s.length() == 1){
            return s;
        }
        int longest=0;

        for (int j = 0; j <= s.length() - 2; j++) {
            for (int k = j; k <= s.length(); k++) {
                String substr = s.substring(j,k);
                if(substr.length() > longest) {
                    System.out.print(substr + " ");
                    if (!temp.contains(substr)) {
                        if (longPalindrome(substr)) {
                            temp.add(substr);
                            longest=substr.length();
                        }
                    }
                }
            }
        }
        String maxtr="";
        for (String st: temp){
            if (st.length() > maxtr.length()){
                maxtr = st;
            }
        }
//        Optional<String> hold = temp.stream().reduce((w1,w2) -> w1.length() > w2.length() ? w1 : w2);
//        if(hold.isPresent()){
//            return hold.get();
//        }
        return maxtr;
    }
    public static boolean longPalindrome(String str) {

        String[] chary = str.split("");

        int i = 0, j = str.length() - 1;

        while (i <= j) {
            if (!chary[i].equals(chary[j])) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


}
