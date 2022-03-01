import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvGenerator implements FileGenerator {
  @Override
  public void toCsv(List<String> lines)
  {
    String filename = "new.csv";
    try {
      FileWriter csvWriter = new FileWriter(filename);
      // pretty line
      printStars(csvWriter);
      // new line + '\n'
      for (int i = 0; i < lines.size(); i++) {
        csvWriter.append(lines.get(i));
        csvWriter.append("\n");
      }
      // pretty line
      printStars(csvWriter);
      csvWriter.flush();
      csvWriter.close();
    } catch (IOException e){
      e.printStackTrace();
    }
  }

  static void printStars(FileWriter csvWriter) throws IOException {
    csvWriter.append("*************");
    csvWriter.append("\n");
  }
}

