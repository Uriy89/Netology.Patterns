package homeworks.homework1_1;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    private boolean flagAdrress;
    private boolean flagAge;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public PersonBuilder setFlagAdrress(boolean flagAdrress) {
        this.flagAdrress = flagAdrress;
        return this;
    }

    public PersonBuilder setFlagAge(boolean flagAge) {
        this.flagAge = flagAge;
        return this;
    }

    public boolean isFlagAdrress() {
        return flagAdrress;
    }

    public Person build() {
        Person person = null;
        if (name == null || surname == null) {
            throw new IllegalStateException("Не указано имя или фамилия");
        } else if (age < 0) {
            throw new IllegalStateException("Возраст не может быть меньше 0");
        } else {
            person = new Person(name, surname, age);
            person.setAddress(address);
        }
        return person;
    }

}
