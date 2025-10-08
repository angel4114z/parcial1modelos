package Punto1;

import Punto1.observer.*;
import Punto1.subject.EducacionContinua;

public class Main {
    public static void main(String[] args) {
        EducacionContinua EDCO = new EducacionContinua();

        Observer andrea = new Webmaster("Andrea Mahecha");
        Observer laura = new CommunityManager("Laura molano");
        Observer luz = new Periodista("Luz Dary Varela");

        EDCO.registerObserver(luz);
        EDCO.registerObserver(laura);
        EDCO.registerObserver(andrea);

        EDCO.addCourse("Inteligencia artificial aplicada a la educacion");
        EDCO.addCourse("Pedagogia decolonial");
        EDCO.addCourse("Ciudades inteligentes");

        EDCO.editCourse("Inteligencia artificial aplicada a la educacion");
        EDCO.editCourse("Pedagogia decolonial");
        EDCO.editCourse("Ciudades inteligentes");

        EDCO.removeObserver(luz);

        EDCO.removeCourse("Inteligencia artificial aplicada a la educacion");
        EDCO.removeCourse("Pedagogia decolonial");
        EDCO.removeCourse("Ciudades inteligentes");
    }
}
