/**
 * Created by s1581377 on 05/02/17.
 */
public class Dalek2 {
    public static void main(String[] args) {

        Dalek2 d1 = new Dalek2();
        String[] u1 = { "Exterminate, Exterminate!", "I obey!",
                "Exterminate, annihilate, DESTROY!", "You cannot escape.",
                "Daleks do not feel fear.", "The Daleks must survive!" };
        d1.setSayings(u1);

        System.out.println("\nDalek d1 says: ");
        for (int i = 0; i < 10; i++) {
            d1.speak();
        }

        System.out.println("\nDalek d2 says: ");
        Dalek2 d2 = new Dalek2();
        String[] u2 = { "I obey!" };
        d2.setSayings(u2);

        for (int i = 0; i < 10; i++) {
            d2.speak();
        }

    }
    public String[] say = {};
    public void setSayings(String[] ak) {

        say = ak;
    }

    public void speak() {
        int a = say.length;
        String c ;
        if(a>0){
            c = say[(int) (Math.random() * a)];
        }
        else {
            c = "No utterances installed!";
        }
        System.out.println(c);
    }
}

