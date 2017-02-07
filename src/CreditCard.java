import java.util.Calendar;


/**
 * Created by s1581377 on 06/02/17.
 */
public class CreditCard {
    private int a;
    private int b;
    private String c;
    private String d;
    private String f;
    public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber) {
        this.a=expiryMonth;
        this.b=expiryYear;
        this.c=firstName;
        this.d=lastName;
        this.f=ccNumber;

    }
    public String formatExpiryDate(){
        String SM = String.valueOf(a);
        String SY = String.valueOf(b);
        return SM+"/"+SY.substring(2);
    }
    public String formatFullName(){
        return c + " " + d;
    }
    public String formatCCNumber(){
        String c1 = this.f.substring(0,4);
        String c2 = this.f.substring(4,8);
        String c3 = this.f.substring(8,12);
        String c4 = this.f.substring(12,16);
        return c1+" "+c2+" "+c3+" "+c4;

    }
    public boolean isValid(){
        Calendar now = Calendar.getInstance();
        int ny = now.get(Calendar.YEAR);
        int nm = now.get(Calendar.MONTH)+1;
        boolean ww = false;
        if(ny<b){
            ww = true;
        }else if(ny==b){
            if((nm)<a){
                ww=true;
            }else {
                ww=false;
            }
        }else if(ny>b){
            ww=false;
        }
        return ww;
    }

    public String toString() {
        String result = String.format("Number: %s\nExpiration date: %s\nAccount holder: %s\nIs valid: %s", formatCCNumber(), formatExpiryDate(),
                formatFullName(), isValid());
        return result;
    }

}
