import enums.Month;
import enums.WaterColour;
import enums.Weather;
import humans.*;
import locations.*;
import valeObjects.*;

public class Story {
    /**
     * Method that creates all objects from the task and prints their status.
     */
    public void go() {
        Vale mummiVale = new Vale("Мумми-Дол", Month.JULY, Weather.EXTREMELY_HOT);
        System.out.println();

        Fly fly = new Fly(1, 2, 1);
        fly.setEnergyPoints(20);
        fly.makeSound();
        fly.fly();
        System.out.println();

        House mummiHouse = new House("Мумми-Дом");
        Meadow meadow = new Meadow();
        meadow.printStatus(mummiVale.getWeather());

        Tree tree = new Tree();
        tree.printStatus(mummiVale.getWeather());

        River river = new River(0.5);

        river.water.setWaterColour(WaterColour.GREY);

        meadow.addValeObject(tree);
        meadow.addValeObject(river);

        mummiVale.addLocation(meadow);
        mummiVale.addLocation(mummiHouse);

        System.out.println();
        System.out.println("на лугу: " + meadow.getValeObjects());
        System.out.println(mummiVale + ": " + mummiVale.getLocations() + "\n");

        river.flow();

        WizardsHat hat = new WizardsHat();
        Wizard wizard = new Wizard("Гарри Поттер", hat);
        System.out.println();

        hat.makeJuice(river.water);
        hat.makePardoned();
        hat.makeJuice(river.water);

        System.out.println();
        mummiHouse.becomeJungle();
    }
}
