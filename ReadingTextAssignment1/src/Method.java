import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Method {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();

        FileReader fr = new FileReader("HistoryProgramming.txt");

        BufferedReader br = new BufferedReader(fr);
        String line;
        String thisLine;
        int position;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        ArrayList<String> locations = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            thisLine = lines.get(i);
            position = thisLine.indexOf("written");

            //System.out.println(i + " " + position);

            if (position > -1){
                int j;
                j = i + 1;
                locations.add("Y position: " + j +  " " + "X position: " + Integer.toString(position));
            }

        }
        System.out.println(locations);
    }
}