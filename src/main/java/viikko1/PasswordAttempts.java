package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        String correct = "java123";
        int max = Math.min(3, tries.length);

        for (int i = 0; i < max; i++){
            if(tries[i].equals(correct)){
                return "Tervetuloa!";
            }
        }
        return "Liian monta virhettä";
    }
}

