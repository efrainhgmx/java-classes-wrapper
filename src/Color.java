public enum Color {
    ROJO("Rojo"),
    VERDE("Verde"),
    AZUL("Azul");

    private final String color;

    public String getColor() {
        return color;
    }

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
