class Demo{
	String name;
	String breed;
	public Demo(String name,String breed) {
		this.name=name;
		this.breed=breed;
	}
	
	public String getName() {
		return name;
	}
	public String setName(String name) {
		this.name=name;
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public String setBreed(String breed) {
		this.breed=breed;
		return breed;
	}
}
public class Dog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo dog1 = new Demo("Buddy", "Golden Retriever");
		Demo dog2 = new Demo("Charlie", "Bulldog");

		System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
		System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");

		System.out.println("\nSet the new Breed of dog1 and new name of dog2:");
		dog1.setBreed("Labrador Retriever");
		dog2.setName("Daisy");

		System.out.println(dog1.getName() + " is now a " + dog1.getBreed() + ".");
		System.out.println(dog2.getName() + " is now a " + dog2.getBreed() + ".");
	}

}


