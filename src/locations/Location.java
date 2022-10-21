package locations;

import enums.Type;
import mummiValeObjects.MummiValeObject;

import java.util.ArrayList;

public abstract class Location {

    private final Type type = Type.VALE_LOCATION;

    public Type getType() {
        return type;
    }


    private ArrayList<Location> locations = new ArrayList<>();

    public void addLocation(Location location) {
        locations.add(location);
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }


    private ArrayList<MummiValeObject> mummiValeObjects = new ArrayList<>();

    public void addMummiValeObject(MummiValeObject object) {
        mummiValeObjects.add(object);
    }

    public ArrayList<MummiValeObject> getMummiValeObjects() {
        return mummiValeObjects;
    }
}
