class GamingComputer extends Computer {
    private String gpu;

    public GamingComputer(int id, String brand, String gpu) {
        super(id, brand);
        this.gpu = gpu;
    }

    // Перевизначення методу getInfo() з класу Computer
    @Override
    public String getInfo() {
        return super.getInfo() + ", GPU: " + gpu;
    }
}