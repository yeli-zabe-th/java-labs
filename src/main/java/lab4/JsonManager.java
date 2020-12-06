package src.main.java.lab4;

import com.google.gson.Gson;
import src.main.java.lab4.model.University;

import java.io.*;

public class JsonManager {

    public void writeToJson(Object o, String filePath) {
        Gson gson = new Gson();
        String json = gson.toJson(o);
        try {
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write(json);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public Object readFromJson(String filePath) {
        Gson gson = new Gson();
        try {
            return gson.fromJson(new FileReader(filePath), University.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
