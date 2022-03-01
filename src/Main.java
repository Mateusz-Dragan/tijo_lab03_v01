import java.io.IOException;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    FileGenerator fileGenerator = new CsvGenerator();
    // add lines
    fileGenerator.toCsv(Arrays.asList("first line", "second line", "third line"));
  }
}
