package Comp_Decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Compressor {
    public static void method(File file) throws IOException {
        String fileDirectory = file.getParent();

        FileInputStream fis = new FileInputStream(file); //to read the data
        FileOutputStream fos = new FileOutputStream(fileDirectory+"Compressedfile.gz");//to compress the data
        GZIPOutputStream gzip = new GZIPOutputStream(fos);//to writing out the compressed data

        byte [] buffer = new byte[1024];
        int len;
        //run this loop until length < 0;
        //fis.read is used to read the input file bytes into the form of an array
        while((len=fis.read(buffer)) != -1){
            gzip.write(buffer,0,len);//gzip.write will be used to get ll the bytes from the buffer array from starting index 0 to ending length


        }
        gzip.close();
        fis.close();
        fos.close();


    }
    public static void main(String [] args)throws IOException{
        File path = new File("/Users/ShivenduAc/Downloads/Compressor/CompressorDecompressor/Testfile");
        method(path);
    }
}
