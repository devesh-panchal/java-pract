import java.io.*;

class FileCopy
{
public static void mian(String args[])throws IOException
{
FileReader fr=new FileReader("f1.txt");
FileWriter fw=new FileWriter("f2.txt");

BufferedReader br=new BufferedReader(fr);

String s;

while(s=br.readline()!=null)
{
fw.write();
}
fr.close();
fw.close();
}
}

