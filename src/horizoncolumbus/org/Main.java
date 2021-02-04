package horizoncolumbus.org;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) {
	String[] stringArray = new String[3];
	stringArray[0] = "https://classroom.google.com/u/0/h";
	stringArray[1] = "https://zoom.us/signin";
	stringArray[2] = "https://www.youtube.com/watch?v=s49CT4DTAkw";

	for(int i = 0; i < stringArray.length; i++){
	    try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI(stringArray[i]);
            ;


        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }
    }
    }

