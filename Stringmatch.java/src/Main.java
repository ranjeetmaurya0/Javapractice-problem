class stringMatching{
    void  Matching(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j <m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.println( "pattern match at index of" + i);
            }
        }
    }
    public static void main(String[] args){
        String pat = "123";
        String text = "541232112345";
        stringMatching sm = new stringMatching();
        sm.Matching(text,pat);

    }
}