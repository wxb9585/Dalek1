import java.awt.*;
import

/**
 * Created by s1581377 on 07/02/17.
 */
public class ImageEditor1 {

    public static double luminance(Color color){
        double a = 0.299 * color.getRed() +0.587*color.getGreen() + 0.114*color.getBlue();
        return a;

    }
    public static Color toGrey(Color color){
       int kk = (int) (Math.round(luminance(color)));
       return new Color(kk,kk,kk);

    }
    public static Picture makeGreyscale(Picture pic){

    }
}
