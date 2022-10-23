package locations;

import enums.Type;
import mummiValeObjects.MummiValeObject;

import java.util.ArrayList;

public abstract class Location {

    private final Type type = Type.LOCATION;

    public Type getType() {
        return type;
    }


    private ArrayList<Location> locations = new ArrayList<>();

    public void addLocation(Location location) {
        locations.add(location);
    }

    /**
     * removes from the list all objects that have simple the same class with the argument
     */
    public void removeLocation(Location object) {
        int i = 0;
        while (i < locations.size()) {
            if (locations.get(i).getClass() == object.getClass()) {
                locations.remove(i);
            } else {
                i++;
            }
        }
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }


    private ArrayList<MummiValeObject> mummiValeObjects = new ArrayList<>();

    public void addMummiValeObject(MummiValeObject object) {
        mummiValeObjects.add(object);
    }

    /**
     * removes from the list all objects that have simple the same class with the argument
     */
    public void removeMummiValeObject(MummiValeObject object) {
        int i = 0;
        while (i < mummiValeObjects.size()) {
            if (mummiValeObjects.get(i).getClass() == object.getClass()) {
                mummiValeObjects.remove(i);
            } else {
                i++;
            }
        }
    }

    public ArrayList<MummiValeObject> getMummiValeObjects() {
        return mummiValeObjects;
    }


    private String name = "локация";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
