package enums;

public enum RiverColour {
    GREY("серая"),
    BLUE("голубая"),
    GREEN("зеленая"),
    TRANSPARENT("прозрачная");

    private final String translation;

    RiverColour(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
