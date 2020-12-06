package src.main.java.lab4.controller;

import src.main.java.lab4.model.Human;
import src.main.java.lab4.model.Sex;

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
