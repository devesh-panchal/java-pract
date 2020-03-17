import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.util.Scanner;

public class ARP {
    public static void main(String[] arrstring) {
        ARP arp = new ARP();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String string2 = "ping " + string;
        String string3 = arp.executeCommand(string2);
        String string4 = "arp -a " + string;
        String string5 = arp.executeCommand(string4);
        System.out.println(string5);
    }

    private String executeCommand(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            Process process = Runtime.getRuntime().exec(string);
            process.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String string2 = "";
            while ((string2 = bufferedReader.readLine()) != null) {
                stringBuffer.append(string2 + "\n");
            }
        }
        catch (Exception var4_5) {
            var4_5.printStackTrace();
        }
        return stringBuffer.toString();
    }
}