package ex_16_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab166_BufferReaderInput {
    public static void main(String[] args) throws IOException {

        //this is another way to take input from console
        //using bufferedreader class
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the value of N");

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println(n);
    }
}
