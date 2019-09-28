import com.wipro.utils.FileReadWriteUtils;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReadWriteUtils fileReadWriteUtils = new FileReadWriteUtils();
        Date today = Calendar.getInstance().getTime();
        fileReadWriteUtils.writeToFile(today,12.2D,123l);
        fileReadWriteUtils.readFromFile();
    }
}
