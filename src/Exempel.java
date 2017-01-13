/**
 * Created by olli14 on 2017-01-13.
 */

import java.io.*;

public class Exempel {

    public static void main(String[] args) throws IOException {

        String filnamn = "minfil.txt";

        try {

            FileReader fr = new FileReader(filnamn);

            BufferedReader inFil = new BufferedReader(fr);


            String rad = inFil.readLine();


            while (rad != null) {

                System.out.println(rad);

                rad = inFil.readLine();

            }

            inFil.close();

        }

        catch(FileNotFoundException e1) {

            System.out.println("Filen hittades inte!");

        }

        catch(IOException e2) {

            System.out.println(e2);

        }

    }

}


