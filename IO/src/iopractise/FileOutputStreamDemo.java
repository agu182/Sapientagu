package iopractise;

import java.io.*;;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     String source="now is the time for all good men"+"to come to the aid of their country"+"and pay their due taxes";
     byte buf[]=source.getBytes();
     OutputStream fo=new FileOutputStream("D:/workspace/Sapientagu/IO/file1.txt");
     for(int i=0;i<buf.length;i+=2)
     {
    	 fo.write(buf[i]);
    	 
    	 
     }
     fo.close();
     OutputStream f1=new FileOutputStream("file2.txt");
     f1.write(buf);
     f1.close();
     OutputStream f2=new FileOutputStream("file3.txt");
     f2.write(buf,buf.length-buf.length/4,buf.length/4);
     f2.close();
	}

}
