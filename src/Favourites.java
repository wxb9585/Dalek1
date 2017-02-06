/**
 * Created by s1581377 on 05/02/17.
 */
public class Favourites {
    MusicTrack[] a = new MusicTrack[5];
    String b;
    String c;
    int count = 0;
    public void addTrack(String artist, String title){
        b = artist;
        c = title;
        MusicTrack g = new MusicTrack(b,c);
        if(count<=4){
            a[count]=g;
            count++;
        }
        else {
            System.out.println("Sorry, can't add: " + g.toString());
        }
        System.out.println();

    }
    public static void main(String[] args){
        Favourites k = new Favourites();
        System.out.print(k.a.length);
    }

    public void showFavourites() {
        for(int i=0;i<count;i++)
            if(a[i] != null){
        System.out.println(a[i].toString());

    }
}
}
