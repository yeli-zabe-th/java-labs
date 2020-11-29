package src.main.java.lab3.controller;

import src.main.java.lab3.model.Human;
import src.main.java.lab3.model.Sex;

/**
 * Created by ominieiev on 25.11.2020.
 */
public class HumanCreator {
   public Human createHuman(String name, String surname, String patronymic, Sex sex) {
        Human human = new Human();
        human.setName(name);
        human.setPatronymic(patronymic);
        human.setSex(sex);
        human.setSurname(surname);
        return human;
    }
    public  Human createTypicalHuman(){
        return createHuman("john","smith","J",Sex.MALE);
    }
}
