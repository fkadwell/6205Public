import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LookupCSV {

    // Do not instantiate.
    private LookupCSV() { }

    public static void main(String[] args) throws FileNotFoundException {
        //int keyField = Integer.parseInt(args[1]);
        //int valField = Integer.parseInt(args[2]);
        File text = new File("/home/fkadwell/test1.txt");
        // symbol table
        Set<String> set = new HashSet<String>();

        // read in the data from csv file
        Scanner scnr = new Scanner(text);
        while (scnr.hasNextLine()) {
            String line = scnr.nextLine();
            //String[] tokens = line.split(",");
            //String key = tokens[0];
            //String val = tokens[valField];
            set.add(line);
        }
        System.out.println(set);
        //while (!StdIn.isEmpty()) {
        //    String s = StdIn.readString();
        //    if (set.contains(s)) StdOut.println(s);
        //    else                StdOut.println("Not found");
        //}
    }
}
