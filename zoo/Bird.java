

public class Bird extends Animal{
    String breed;
    String sound;

    public Bird(String name, String breed, int age){
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
        System.out.println(this.sound + " " + this.sound);
    }
    
    @Override
    boolean isLandAnimal(){
        return false;
    }    
    @Override
    public String toString(){
        return this.name + " " + " (breed+) sound: " + this.sound;
    }

}