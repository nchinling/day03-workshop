package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Data {
    
    public static void main(String[] args) throws IOException{
        Path p = Paths.get("googleplaystore.csv");
        File f =p.toFile();
        InputStream is = new FileInputStream(f);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        int numWords =0;

        System.out.printf("Exists? %b\n", f.exists());

        // while((line=br.readLine()) != null){
        //     System.out.printf("> %s\n", line.toUpperCase());
        //     String[] words = line.split(",");
        //     // numWords += words.length;
        // }

        List<String> lines = Files.readAllLines(f.toPath(), 
        StandardCharsets.UTF_8);

        // String line;
        for (String line : lines) {
        String[] array = line.split(",");
        System.out.println(array[2]);
        }
            // int size = array.length;
            // double [] arr = new double [size];
            //     for(int i=0; i<size; i++) {
            //     arr[i] = Double.parseDouble(array[i]);
            //     System.out.printf("%f",arr[i]);
            //     }
       
        // double[] ratings = Integer.parseInt(array);

        // }

        // Map<String, Integer> wordFreq;

        // //Reading lines

        // FileReader fr = new FileReader(f);
        // BufferedReader br = new BufferedReader(fr);

        // InputStream is = new FileInputStream(f);
        // InputStreamReader isr = new InputStreamReader(is);
        // BufferedReader br = new BufferedReader(isr);
        // String line;
        // int numWords =0;

        // //while not end of line

        // while((line=br.readLine()) != null){
        //     System.out.printf("> %s\n", line.toUpperCase());
        //     String[] ratings = line.split(",");


            // System.out.printf("> %s\n", ratings);
        
        //     String[] words = line.split(" ");
        //     numWords += words.length;

        //     //iterate all the words in the line
        //     for (String w: words){
        //         String t = w.trim().toLowerCase();
        //         if (wordFreq.containsKey(t)){
        //             //If word is not in map, initialise the word with freq 1
        //             wordFreq.put(t, 1);
        //             continue;
        //         }
        //         else {
        //             //if word is in map, increment the count
        //             int c = wordFreq.get(t);
        //             wordFreq.put(t, c+1);
        //         }
        //     }
        // }

        // Set<String> words = wordFreq.keySet();
        // for (String w: words){
        //     int count = wordFreq.get(w);
        //     System.out.printf(": %s = %d\n", w, count);
        // }
        
        // System.out.printf("Number of unique words: %d\n", words.size());
        // System.out.printf("Number of words: %d\n", numWords);
        // // InputStreamReader isr = new InputStreamReader(is);
        // // GZIPInputStream gis = new GZIPInputStream(isr);
        // br.close();
        // isr.close();
        // is.close();

    }
}
