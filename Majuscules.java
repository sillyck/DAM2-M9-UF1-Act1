import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Majuscules{

    public static void main(String[] args) {
        String line="";
        try {
<<<<<<< HEAD
        	while(line.compareTo("fin")!=0) {
	            Process son= new ProcessBuilder("java", "-jar", "C:\\Users\\Eloy\\Desktop\\M9\\UF2\\Act1\\DAM2-M9-UF1-Act1\\Main.jar").start();
	            BufferedReader br=new BufferedReader(new InputStreamReader(son.getInputStream()));
	            PrintStream ps=new PrintStream(son.getOutputStream());
	
	            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	            ps.println(line);
	            ps.flush();
	            
	            if((line=br.readLine())!=null) {
	                System.out.println(line);
	
	            }
	            
	            line = in.readLine();
=======
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
>>>>>>> cd5bee325b7445c230d9144ca0613e5be50b7f05
            }

            System.out.println("Ending");

        } catch (IOException e) {
            System.out.println("An error has happened: "+e.getMessage());
        }     
    }

}