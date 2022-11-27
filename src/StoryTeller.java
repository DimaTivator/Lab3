import enums.Month;
import enums.WaterColour;
import enums.Weather;
import humans.*;
import locations.*;
import valeObjects.*;

public class StoryTeller {
    /**
     * Method that creates all objects from the task and prints their status.
     */
    public void go() {
        Vale mummiVale = new Vale("Мумми-Дол", Month.JULY, Weather.HOT);
        System.out.println();

        Meadow meadow = new Meadow();
        House mummiHouse = new House("Мумми-Дом");

        Tree tree = new Tree();
        meadow.addValeObject(tree);

        River river = new River(2);
        meadow.addValeObject(river);
        river.water.setWaterColour(WaterColour.GREY);

        Fly fly = new Fly(1, 2, 1);
        meadow.addValeObject(fly);

        WizardsHat hat = new WizardsHat();
        meadow.addValeObject(hat);
        Wizard wizard = new Wizard("Гарри Поттер", hat);
        System.out.println();

        meadow.feelWeather(mummiVale.getWeather());

        mummiVale.addLocation(meadow);
        mummiVale.addLocation(mummiHouse);

        System.out.println();
        System.out.println("на лугу: " + meadow.getValeObjects());
        System.out.println(mummiVale + ": " + mummiVale.getLocations() + "\n");

        hat.makeJuice(river.water);
        hat.makePardoned();
        hat.makeJuice(river.water);

        System.out.println();
        mummiHouse.becomeJungle();

    }
}
