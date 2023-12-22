class InternetCafe {
    private String name;
    private Computer[] computers;

    public InternetCafe(String name, Computer[] computers) {
        this.name = name;
        this.computers = computers;
    }

    public void displayInfo() {
        System.out.println("Welcome to " + name + " Internet Cafe");
        System.out.println("Computers available:");
        for (int i = 0; i < computers.length; i++) {
            System.out.println("  Computer " + (i + 1) + ": " + computers[i].getInfo());
        }
    }
}
