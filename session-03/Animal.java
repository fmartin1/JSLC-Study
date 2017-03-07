import java.util.HashSet;
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
    Animal other = (Animal)o;
    if ( this._species.equals(other._species) && this._name.equals(other._name)) {
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    int code = 0;
    for(char c : this._name.toCharArray()) {
      code += (int)c;
    }
    code +=_age;
    return code;
  }

  public static void main(String[] args) {
    Animal fido = new Animal("Perro","Fido",1);
    Animal olderFido = new Animal("Perro", "Fido", 2);

    System.out.println("Is Fido == olderFido? : " + (fido == olderFido));
    System.out.println("Fido.equals(olderFido)? : " + (fido.equals(olderFido)));
    HashSet<Animal> mySet = new HashSet<Animal>();
    System.out.println("Add Fido :" + mySet.add(fido));
    System.out.println("Add olderFido :" + mySet.add(olderFido));
  }
}
