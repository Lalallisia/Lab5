class Laptop extends Computer {
    private String screenSize;

    public Laptop(int id, String brand, String screenSize) {
        super(id, brand);
        this.screenSize = screenSize;
    }

    // Перевизначення методу getInfo() з класу Computer
    @Override
    public String getInfo() {
        return super.getInfo() + ", Screen Size: " + screenSize;
    }
}