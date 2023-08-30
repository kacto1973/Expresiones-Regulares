import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {
    public static void main(String[] args) {

        //System.out.println("Frase analizada: "+args[0]);

        for (int i = 0; i < args.length; i++) {

            System.out.println("Frase analizada: "+args[i]);

            Pattern pat1 = Pattern.compile("(?)Hola mundo");
            Matcher mat1 = pat1.matcher(args[i]);
            if (mat1.matches()) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            Pattern pat2 = Pattern.compile("(?i)Hola mundo");
            Matcher mat2 = pat2.matcher(args[i]);
            if (mat2.matches()) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            Pattern pat3 = Pattern.compile("\\b(?i:Java|Python|Go|Pascal|Perl)\\b");
            Matcher mat3 = pat3.matcher(args[i]);
            if (mat3.matches()) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            Pattern pat4 = Pattern.compile("(?i)a\\d\\d\\d\\d\\d\\d\\d\\d\\d(?i:@unison.mx|@uson.mx)");
            Matcher mat4 = pat4.matcher(args[i]);
            if (mat4.matches()) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            Pattern pat5 = Pattern.compile("(?)ISI\\d{4}-(1|2)\\.(csv|txt)");
            Matcher mat5 = pat5.matcher(args[i]);
            if (mat5.matches()) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            System.out.println();
        }


    }
}
