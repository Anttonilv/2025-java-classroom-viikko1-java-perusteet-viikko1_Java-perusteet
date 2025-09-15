package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        if (n == 0){
            return "nolla";
        }
        if (n > 0){
            return (n%2 == 0) "positiivinen parillinen" : "positiivinen pariton";
        } else{
            return (n%2 == 0) "negatiivinen parillinen" : "negatiivinen pariton";
        }
    }
}