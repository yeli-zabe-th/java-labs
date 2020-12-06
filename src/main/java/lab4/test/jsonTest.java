package src.main.java.lab4.test;

import src.main.java.lab4.controller.UniversityCreator;
import src.main.java.lab4.model.University;
import src.main.java.lab4.JsonManager;

import org.junit.Assert;
import org.junit.Test;


public class jsonTest {
    @Test
    public void testFileWriteJsonToFile() {

        String filePath = "./src/main/java/lab4/myJSON.json";
        JsonManager jsonManager = new JsonManager();
        UniversityCreator universityCreator = new UniversityCreator();
        University oldUniversity = universityCreator.createTypicalUniversity();

        jsonManager.writeToJson(oldUniversity, filePath);
        University newUniversity = (University) jsonManager.readFromJson(filePath);

        Assert.assertEquals(newUniversity, oldUniversity);
    }
}

