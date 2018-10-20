import Model.MathValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CSVUtils {
    public static ArrayList<MathValue> ImportCsv(String path)
    {
        ArrayList<MathValue> list = new ArrayList<MathValue>();
        Path pathToFile = Paths.get(path);

        try (BufferedReader reader = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8))
        {
            String line = reader.readLine();
            while (line != null)
            {
                double value = -Double.MAX_VALUE;

                value = Double.parseDouble(line);

                if (value != -Double.MAX_VALUE)
                {
                    MathValue tempVar = new MathValue();
                    tempVar.setValue(value);
                    list.add(tempVar);
                }
                else
                {
                    System.out.println(String.format("value out of integer limit %1$s", line));
                }

                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
