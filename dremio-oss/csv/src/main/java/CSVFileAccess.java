import java.io.IOException;
import java.security.InvalidParameterException;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

public class CSVFileAccess {
  private CSVReader reader;
  private CSVWriter writer;

  public CSVFileAccess(CSVReader reader) {
    this.reader = reader;
  }

  public CSVFileAccess(CSVWriter writer) {
    this.writer = writer;
  }

  public void writeLine(String[] line) {
    if(line == null) {
      throw new InvalidParameterException();
    }

    writer.writeNext(line);
  }

  public String[] readLine() throws CsvValidationException, IOException {
    return reader.readNext();
  }
}
