package src.main.java.lab4;

import src.main.java.lab4.model.Sex;

import java.util.List;

public class Utils {

    public static String listToString(List<?> list, int indent) {
        String tab_indent = resolveIndent(indent);

        StringBuilder result = new StringBuilder("");
        for (Object o : list) {
            result.append("\n").append(tab_indent).append(o);
        }
        return result.toString();
    }

    private static String resolveIndent(int indent) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            result.append("\t");
        }
        return result.toString();
    }

    public static Sex defineSex(String input) {
        Sex sex;

        switch(input) {
            case "male":
            case "m":
                sex = Sex.MALE;
                break;
            case "female":
            case "f":
                sex = Sex.FEMALE;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + input);
        }
        return sex;
    }
}
