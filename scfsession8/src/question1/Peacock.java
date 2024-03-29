package question1;

/**
 * class Peacock inheriting Birds
 * @author Anmol
 */
public class Peacock extends Birds {
	

	@SuppressWarnings("static-access")
	Peacock(String name,int age,float weight){
		this.aid = ++(super.id);
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	/**
	 * method to return the sound of animals
	 * @return the sound of given animal
	 */
	public String getSound(){
		
		return "peaaaauuuu";
	}

}
