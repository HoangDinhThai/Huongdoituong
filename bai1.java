import java.io.*;
import java.util.*;

public class bai1 {

    public static void main(String[] args) throws IOException {
        try {
            File infile = new File("C:\\Users\\SV\\Desktop\\thuchanh4\\dayso.txt");
            InputStream inputStream = new FileInputStream(infile);
            File outfile = new File("C:\\Users\\SV\\Desktop\\thuchanh4\\sapxep.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            OutputStream outputStream = new FileOutputStream(outfile);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

            String line = "";
            Vector<Double> dayso = new Vector<Double>();
            while ((line = reader.readLine()) != null) {
                dayso.add(Double.parseDouble(line));
            }
            Collections.sort(dayso);
            for (double x : dayso) {
                outputStreamWriter.write(Double.toString(x));
                outputStreamWriter.write("\n");
            }
            inputStreamReader.close();
            outputStreamWriter.flush();
        } catch (Exception e) {
        }
    }
}
