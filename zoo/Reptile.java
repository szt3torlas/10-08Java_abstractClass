

public class Reptile extends Animal{
String breed;
String sound;

public Reptile(String name, String breed, int age){
    this.name = name;
    this.breed = breed;
    this.age = age;
}
@Override
    String breed(){
        return this.breed;
    }
    @Override
    void sound(){
        System.out.println(this.sound + " " + this. sound);
    }
    
    @Override
    boolean isLandAnimal(){
        return true;
    }    
    
}
