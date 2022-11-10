public class Anagram {
    public boolean isAnagram(String ostr1, String ostr2) {

        char[] str1 = ostr1.toCharArray();
        char[] str2 = ostr2.toCharArray();

        if (str1.length != str2.length) {
            return false;
        }
        boolean contains = true;

        for (int i = 0; i < str1.length; i++) {
            boolean ispresent = false;

            for (int j = 0; j < str2.length; j++) {
                if (str1[i] == str2[j]) {
                    ispresent = true;
                    continue;
                }
            }
            if (!ispresent) {
                contains = false;
                break;
            }
        }
        System.out.println(contains);
        return contains;

    }
}
