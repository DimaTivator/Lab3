import enums.Month;
import enums.WaterColour;
import enums.Weather;
import humans.*;
import locations.*;
import mummiValeObjects.*;

public class Story {
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

        meadow.addMummiValeObject(tree);
        meadow.addMummiValeObject(river);

        mummiVale.addLocation(meadow);
        mummiVale.addLocation(mummiHouse);

        System.out.println();
        System.out.println("на лугу: " + meadow.getMummiValeObjects());
        System.out.println(mummiVale + ": " + mummiVale.getLocations() + "\n");

        System.out.println(river.flow() +  "\n");

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
