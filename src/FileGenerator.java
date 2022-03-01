import java.io.IOException;
import java.util.List;

public interface FileGenerator {
  void toCsv(List<String> lines) throws IOException;
}