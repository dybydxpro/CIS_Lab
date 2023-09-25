package moviemanager;

/**
 * @author TharinduD
 */
public class Customer {
    private String name;
    private String address;
    private String type;

    /**
     * Customer constructor with parameters.
     *
     * @param name
     * @param address
     * @param type
     */
    public Customer(String name, String address, String type) {
        this.name = name;
        this.address = address;
        this.type = type;
    }

    /**
     * Get name from Customer class.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name to Customer class.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get address from Customer class.
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set address to Customer class.
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get type from Customer class.
     *
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Set type to Customer class.
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
