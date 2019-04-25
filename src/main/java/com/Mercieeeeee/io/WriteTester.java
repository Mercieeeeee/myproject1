package com.Mercieeeeee.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
        File jkDir = new File("D:\\");
        jkDir.mkdir();
        FileWriter fw = new FileWriter("D:\\jk\\output.txt");
        fw.write("abc");
        fw.flush();
        fw.close();
    }
}
