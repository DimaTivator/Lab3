package locations;

import enums.Type;

public abstract class Location {

    private final Type type = Type.VALE_LOCATION;

    public Type getType() {
        return type;
    }
}
