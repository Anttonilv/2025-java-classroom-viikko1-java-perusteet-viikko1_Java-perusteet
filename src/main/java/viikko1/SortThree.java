package viikko1; // uusinta commit


public class SortThree {
    public static String ascending(int a, int b, int c) {
        if(a > b) {int tmp = a; a = b; b = tmp;}
        if(b > c) {int tmp = b; b = c; c = tmp;}
        if(a > b) {int tmp = a; a = b; b = tmp;}
        return a + "," + b + "," + c;
    }
}
