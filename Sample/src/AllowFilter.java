/**
 *  The {@code AllowFilter} class provides a client for reading in an <em>allowlist</em>
 *  of words from a file; then, reading in a sequence of words from standard input,
 *  printing out each word that appears in the file.
 *  It is useful as a test client for various symbol-table implementations.
 *  <p>
 *  For additional documentation,
 *  see <a href="https://algs4.cs.princeton.edu/35applications">Section 3.5</a> of
 *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class AllowFilter {

    // Do not instantiate.
    private AllowFilter() { }

    public static void main(String[] args) throws FileNotFoundException{
        Set<String> set = new HashSet<String>();
        File text = new File("/home/fkadwell/test1.txt");

        // read in strings and add to set
        Scanner scnr = new Scanner(text);
        while (!StdIn.isEmpty()) {
            String key = StdIn.readString();
            //if (!set.contains(key)) {
                set.add(key);
                StdOut.println(key);
            //}
        }

        System.out.println(set);
        // read in string from standard input, printing out all exceptions
        //while (!StdIn.isEmpty()) {
        //    String word = StdIn.readString();
         //   if (set.contains(word))
         //       StdOut.println(word);
        //}
    }
}

/******************************************************************************
 *  Copyright 2002-2022, Robert Sedgewick and Kevin Wayne.
 *
 *  This file is part of algs4.jar, which accompanies the textbook
 *
 *      Algorithms, 4th edition by Robert Sedgewick and Kevin Wayne,
 *      Addison-Wesley Professional, 2011, ISBN 0-321-57351-X.
 *      http://algs4.cs.princeton.edu
 *
 *
 *  algs4.jar is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  algs4.jar is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with algs4.jar.  If not, see http://www.gnu.org/licenses.
 ******************************************************************************/