/**
 * Created by s1581377 on 05/02/17.
 */
public class Dalek1 {
    private double batteryCharge = 5.0; // instance variable

    public void batteryReCharge(double c) {
        // ADD CODE HERE
        batteryCharge += c;
        System.out.println("Battery charge is: " + batteryCharge);

    }

    public void move(int distance) {
        // ADD CODE HERE
        int i =1;
        int c = distance;
        while(batteryCharge>=0.5&&c>0){
            System.out.print("["+i+"] ");
            i++;
            batteryCharge -= 0.5;
            if(batteryCharge == 0){
                System.out.print("Out of power!");
            }
            c -= 1;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Dalek1 d = new Dalek1(); // start off with a well-charged battery
        d.move(11);              // move around and use up the charge
        d.batteryReCharge(2.5);  // get a new charge
        d.batteryReCharge(0.5);  // add a bit more
        d.move(5);               // move some more
    }


}
