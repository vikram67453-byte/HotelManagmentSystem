public class Customer {
    private final String name;
    private final String cnic;

    public Customer(String name, String cnic) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (cnic == null || cnic.isBlank()) {
            throw new IllegalArgumentException("CNIC cannot be empty");
        }

        this.name = name;
        this.cnic = cnic;
    }

    public String getName() {
        return name;
    }

    public String getCnic() {
        return cnic;
    }
}
