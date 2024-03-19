package module_11.src.esempi.file_dao;

import java.time.LocalDate;

public class User
{
    private int id;
    private String name;
    private String lastName;
    private LocalDate birthday;

    public User(int id, String name, String lastName, LocalDate birthday)
    {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    // TODO decidere se inserire in User o in UserDaoCsv
    //  un metodo per creare la stringa csv e per creare l'utente a partire da essa
    // riga (stringa) --> Utente
    // Utente --> stringa (riga)
    public String getCsv() {
        return id + "," + name + "," + lastName + "," + birthday.toString();
    }

    // TODO
    public static User fromCsv(String csv) {
        // 1. split della stringa csv
        // 2. crea utente e lo ritorna
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public static class Builder
    {
        private int id;
        private String name;
        private String lastName;
        private LocalDate birthday;

        public Builder id(int id)
        {
            this.id = id;
            return this;
        }

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Builder lastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        public Builder birthday(LocalDate birthday)
        {
            this.birthday = birthday;
            return this;
        }

        public User build() { return new User(id, name, lastName, birthday); }

        public int getId() { return id; }

        public String getName() { return name; }

        public String getLastName() { return lastName; }

        public LocalDate getBirthday() { return birthday; }
    }
}
