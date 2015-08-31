package iopractise;

import java.io.IOException;
import java.io.*;



public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException{
		int size;
		InputStream f=new FileInputStream("D:/workspace/Sapientagu/IO/src/iopractise/FileInputStreamDemo.java");
		System.out.println("total available bytes:"+ (size=f.available()));
		int n=size/40;
		System.out.println("First"+n+"bytes of file one read() at a time");
		for(int i=0;i<n;i++)
		{
			System.out.println(f.read());
			
		}
		System.out.println("still available:"+f.available());
		System.out.println("reading the next"+n+ "with one read(b[])");
		byte b[]=new byte [n];
		if(f.read(b)!=n)
		{
			System.out.println("couldnt read"+n+"bytes");
			
		}
		System.out.println(new String(b,0,n));
		System.out.println("still available:"+ (size=f.available()));
		System.out.println("skipping bytes with skip()");
       f.skip(size/2);
       System.out.println("still availale"+ f.available());
       System.out.println("reading"+n/2+"into end of array");
       if(f.read(b,n/2,n/2)!=n/2){
    	   
    	   System.out.println("couldnt read"+n/2+"bytes");
    	   
       }
		System.out.println(new String(b,0,b.length));
		System.out.println("still available"+f.available());
		f.close();
	}

}
