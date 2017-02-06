/**
 * Created by s1581377 on 05/02/17.
 */
public class MusicTrack {
    String a ;
    String b ;


    public MusicTrack(String artist, String title) {
        a = artist;
        b = title;
    }
    public String getArtist(){
        return a;
        }
    public String getTitle(){
        return  b;
        }

    public String toString(){
        String c;
        c = b + " | " + a;
        return c;
        }
}

