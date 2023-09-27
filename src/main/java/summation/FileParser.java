package summation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileParser extends Parser{
    private String filename;
    

    public FileParser(String filename)
    {
        this.filename = filename;
    }

    @Override
    public int[] getInts()
    {
        int ints[] = new int[0];
        int index = 0;
        int size = -1; 

        try{
            Scanner scanner = new Scanner(new File(filename));
            size = Integer.parseInt(scanner.nextLine());
            ints = new int[size];

            while(scanner.hasNext()){
                int data = Integer.parseInt(scanner.nextLine());
                ints[index] = data;
                index++;
            }
            scanner.close();
        }catch(FileNotFoundException e)
        {
            System.out.println("filename " + filename + " not found");
            e.printStackTrace();
        }
        
        
        
        /*****USING BUFFER and File Reader approach */
        /*try{
            FileReader reader = new FileReader(this.filename);
            BufferedReader buffer  = new BufferedReader(reader);
            

            while(true)
            {
                String dataString = buffer.readLine();
                if(dataString==null)
                    break;

                int data  = Integer.parseInt(dataString);
                // the first data in the file is the size of the array
                if(size==-1){
                    size = data;
                    ints = new int [data];
                    continue;
                } 

                ints[index] = data;
                index++;
            }

            buffer.close();
        } catch (IOException e) {
            System.out.println("filename " + filename + " not found");
            e.printStackTrace();
        }*/

        return ints;
    }
}
