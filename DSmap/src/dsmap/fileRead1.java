package dsmap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileRead1 {

    graph g = new graph(19);

    public void read() {
        try {
            File file = new File("ViceCityMap.txt");
            Scanner reader = new Scanner(file);
            reader.nextLine();
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] split = data.split(",");
                vertex1 v = new vertex1(split[0], Integer.parseInt(split[1]));
                g.addVertex(v);
                int edge = Integer.parseInt(split[3]);
                double distanceBetweenEdges = Double.parseDouble(split[4]);
                g.addEdge(Integer.parseInt(split[1]), edge, distanceBetweenEdges);
            }
        } catch (FileNotFoundException ex) {

        }
    }
}
