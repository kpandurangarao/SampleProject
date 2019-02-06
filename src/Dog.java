class Animal{
   public void animalSound(){
	System.out.println("Default Sound");
   }
}
public class Dog extends Animal{

   public void animalSound(){
	System.out.println("Woof");
   }
   public static void main(String args[]){
	   Animal animal = new Animal();
	   animal.animalSound();
	   
	   Animal obj = new Dog();
	   obj.animalSound();
	   
	   Dog dog = new Dog();
	   dog.animalSound();
   }
}