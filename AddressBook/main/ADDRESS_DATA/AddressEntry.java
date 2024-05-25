package ADDRESS_DATA;

/**
 * La clase AddressEntry representa una entrada de libreta de direcciones con varios atributos.
 */
public class AddressEntry {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String email;
    private String phone;

    /**
     * Constructor vacío para crear una entrada de libreta de direcciones sin inicializar los atributos.
     */
    public AddressEntry() {}

    /**
     * Constructor para inicializar una entrada de libreta de direcciones con los detalles dados.
     *
     * @param firstName el nombre del contacto
     * @param lastName el apellido del contacto
     * @param street la calle del contacto
     * @param city la ciudad del contacto
     * @param state el estado del contacto
     * @param zip el código postal del contacto
     * @param email el correo electrónico del contacto
     * @param phone el número de teléfono del contacto
     */
    public AddressEntry(String firstName, String lastName, String street, String city, String state, int zip, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.phone = phone;
    }

    /**
     * Obtiene el nombre del contacto.
     *
     * @return el nombre del contacto
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Establece el nombre del contacto.
     *
     * @param firstName el nuevo nombre del contacto
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Obtiene el apellido del contacto.
     *
     * @return el apellido del contacto
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Establece el apellido del contacto.
     *
     * @param lastName el nuevo apellido del contacto
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Obtiene la calle del contacto.
     *
     * @return la calle del contacto
     */
    public String getStreet() {
        return street;
    }

    /**
     * Establece la calle del contacto.
     *
     * @param street la nueva calle del contacto
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Obtiene la ciudad del contacto.
     *
     * @return la ciudad del contacto
     */
    public String getCity() {
        return city;
    }

    /**
     * Establece la ciudad del contacto.
     *
     * @param city la nueva ciudad del contacto
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Obtiene el estado del contacto.
     *
     * @return el estado del contacto
     */
    public String getState() {
        return state;
    }

    /**
     * Establece el estado del contacto.
     *
     * @param state el nuevo estado del contacto
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Obtiene el código postal del contacto.
     *
     * @return el código postal del contacto
     */
    public int getZip() {
        return zip;
    }

    /**
     * Establece el código postal del contacto.
     *
     * @param zip el nuevo código postal del contacto
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * Obtiene el correo electrónico del contacto.
     *
     * @return el correo electrónico del contacto
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electrónico del contacto.
     *
     * @param email el nuevo correo electrónico del contacto
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene el número de teléfono del contacto.
     *
     * @return el número de teléfono del contacto
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Establece el número de teléfono del contacto.
     *
     * @param phone el nuevo número de teléfono del contacto
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Devuelve una representación en cadena de la entrada de la libreta de direcciones.
     *
     * @return una cadena que contiene todos los detalles de la entrada
     */
    @Override
    public String toString() {
        return firstName + " " + lastName + "\n" + street + "\n" + city + ", " + state + " c.p. " + zip + "\n" + email + "\n" + phone + "\n";
    }
}
