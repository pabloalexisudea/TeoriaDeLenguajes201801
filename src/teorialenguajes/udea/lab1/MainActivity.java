package teorialenguajes.udea.lab1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import teorialenguajes.udea.lab1.model.AutomataPila;
import teorialenguajes.udea.lab1.model.ColumsAutoSizer;
import teorialenguajes.udea.lab1.model.Estado;
import teorialenguajes.udea.lab1.model.Transicion;

/**
 *
 * @author edale
 */
public class MainActivity extends JFrame {

    public MainActivity() {
        //headers for the table
        String[] columns = new String[]{
            "Id", "Name", "Hourly Rate", "Part Time"
        };

        //actual data for the table in a 2d array
        Object[][] data = new Object[][]{
            {1, "John", 40.0, false},
            {2, "Rambo", 70.0, false},
            {3, "Zorro", 60.0, true},};
        //create table with data
        JTable table = new JTable(data, columns);
        ColumsAutoSizer.sizeColumnsToFit(table);
        
        //add the table to the frame
        this.add(new JScrollPane(table));

        this.setTitle("Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainActivity();
            }
        });
    }
}
