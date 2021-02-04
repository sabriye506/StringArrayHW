package horizoncolumbus.org;


import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class main2 {
    public static void main(String[] args) throws URISyntaxException, IOException {
        String[] array = new String[3];
        array[0] = "https://classroom.google.com/u/0/h";
        array[1] = "https://zoom.us/signin";
        array[2] = "https://www.youtube.com/watch?v=s49CT4DTAkw";

        for(int i = 0; i < array.length; i++){
            Desktop.getDesktop().browse(new URI(array[i]));
        }
    }

}
