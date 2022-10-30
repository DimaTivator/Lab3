package mummiValeObjects;

import enums.Type;

public abstract class ValeObject {

    private final Type type = Type.OBJECT;

    public Type getType() {
        return type;
    }
}
