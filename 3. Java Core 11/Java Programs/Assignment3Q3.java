import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment3Q3 {
    public static void main(String[] args)
    {
        try
        {
            URL url = new URL("https://httpbin.org/get");

            //open the connection to the above URL.
            HttpURLConnection http = (HttpURLConnection)url.openConnection();
            URLConnection urlcon = url.openConnection();
            Map<String, List<String>> header = urlcon.getHeaderFields();

            //print all the fields along with their value.
            for (Map.Entry<String, List<String>> mp : header.entrySet())
            {
                System.out.print(mp.getKey() + " : ");
                System.out.println(mp.getValue().toString());

            }
            System.out.println("\nGet Response Header By Key ...");
            List<String> contentLength = header.get("Content-Length");
            if (contentLength == null) {
                System.out.println("'Content-Length' doesn't present in Header!");
            } else {
                for (String header1 : contentLength) {
                    System.out.println("Content-Lenght: " + header1);
                }
            }

            int statusCode = http.getResponseCode();
            System.out.println("Status Code: "+statusCode);

            System.out.println();
            System.out.println("Complete source code of the URL is-");
            System.out.println("---------------------------------");

            //get the inputstream of the open connection.
            BufferedReader br = new BufferedReader(new InputStreamReader
                    (urlcon.getInputStream()));
            String i;

            //print the source code line by line.
            while ((i = br.readLine()) != null)
            {
                System.out.println(i);
            }
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
