import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

public class Majuscules {
    //C:\Users\Jordi\Desktop\DAM\M9\Exercicis\Act1\out\artifacts\Act1_jar\Act1.jar
    public static void main(String[] args) throws IOException {
        String line;
        Process son= new ProcessBuilder("C:\\Users\\Jordi\\Desktop\\DAM\\M9\\Exercicis\\Act1\\out\\artifacts\\Act1_jar\\Act1.jar").start();
        BufferedReader br=new BufferedReader(new InputStreamReader(son.getInputStream()));
        PrintStream ps=new PrintStream(son.getOutputStream());

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while((in.readLine()).compareTo("fin")!=0) {
            ps.println("");
            ps.flush();
            if((line=br.readLine())!=null) {
                System.out.println(line);
            }
        }

        if(args.length<=0) {
            System.err.println("A program is needed to be executed");
            System.exit(-1);
        }

        try {
            Runtime runtime=Runtime.getRuntime();
            Process process = runtime.exec(args);
            BufferedReader br2 = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            System.out.println("The execution of "+ Arrays.toString(args)+" has errors:");
            while ((line=br2.readLine())!= null) {
                System.out.println(line);
            }
        }catch(IOException ex) {
            System.err.println("E/S exception.");
            System.exit(-1);
        }
    }
}
