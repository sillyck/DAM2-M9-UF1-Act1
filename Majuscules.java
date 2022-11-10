import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Majuscules{

    public static void main(String[] args) {
        String line="";
        try {
            while(line.compareTo("fin")!=0) {
            Process son= new ProcessBuilder("java", "-jar", "C:\\Users\\Jordi\\Desktop\\DAM\\M9\\Exercicis\\Act1\\out\\artifacts\\Act1_jar\\Act1.jar"
                    + "").start();
            BufferedReader br=new BufferedReader(new InputStreamReader(son.getInputStream()));
            PrintStream ps=new PrintStream(son.getOutputStream());

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                ps.println(line);
                ps.flush();
                if((line=br.readLine())!=null) {
                    System.out.println(line);

                }
                line = in.readLine();
            }

            System.out.println("Ending");

        } catch (IOException e) {
            System.out.println("An error has happened: "+e.getMessage());
        }


    }

}