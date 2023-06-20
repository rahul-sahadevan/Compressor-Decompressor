package Comp_Decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class Decompressor {
    public static void method(File file)throws IOException{
        String fileDirectory = file.getParent();

        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzip = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(fileDirectory+"/Decompressedfile");

        int len;
        byte [] buffer = new byte[1024];
        while((len=gzip.read(buffer))!= -1){
            fos.write(buffer,0,len);
        }
        gzip.close();
        fis.close();
        fos.close();
    }
    public static void main(String [] args)throws IOException{
        File path = new File("/Users/ShivenduAc/Downloads/Compressor/CompressorDecompressor/Compressedfile.gz");
        method(path);
    }
}
