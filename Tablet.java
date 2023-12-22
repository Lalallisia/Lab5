// Клас, який буде позначений як "final"
final class Tablet extends Computer {
    private String operatingSystem;

    public Tablet(int id, String brand, String operatingSystem) {
        super(id, brand);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Operating System: " + operatingSystem;
    }
}
