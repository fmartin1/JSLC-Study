package session03;

class Animal {

    private String _species;
    private String _name;
    private int _age;

    public Animal (String species, String name, int age ) {
        _species = species;
        _name = name;
        _age = age;
    }

    @Override
    public boolean equals(Object o) {
        Animal other;
        try {
            other = (Animal) o;
        } catch (Exception e) { return false; }
        if ( this._species.equals(other._species) && this._name.equals(other._name)) return true;
        return false;
    }

    @Override
    public int hashCode() {
        int hashCode = 0;
        for (char c : this._name.toCharArray()) hashCode += (int) c;
        hashCode += _age;
        return hashCode;
    }
}
