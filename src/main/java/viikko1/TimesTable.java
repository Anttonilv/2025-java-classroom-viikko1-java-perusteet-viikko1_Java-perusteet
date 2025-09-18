package viikko1; // uusinta commit


public class TimesTable {
    public static String table(int n) {
        String result = "";
        for(int i = 1; i <= 10; i++){
            result += n + " x " + i + " = " + (n * i) + "\n";
        }
        return result;
    }
}