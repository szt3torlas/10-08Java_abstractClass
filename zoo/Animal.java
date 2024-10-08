
/**
 * Animal
 */
public abstract class Animal {

        int age;
        String name;
        boolean gender; // true -> male, false -> female
        boolean isLandAnimal;
        public String getName(){
            return this.name;
        }
        


    abstract String breed();
    abstract void sound();
    abstract boolean isLandAnimal();

    public void setIsLandAnimal(boolean isLandAnimal){
        this.isLandAnimal = isLandAnimal;
    }
        
}
