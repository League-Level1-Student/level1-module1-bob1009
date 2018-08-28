/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3&4 see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private String name;

	Smurf(String string) {
		this.name = string;
	}

	public String getName() {
		return name;
		
	
	}

	public void eat() {
		System.out.println(name + " Smurf is eating the insides of a cow.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		if (name.equals("drugdealer")) {
			return "drugdealer smurf";
		}else {
			return "white hat";
		}
	
		 
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
	if (name.equals("grandmas freind's brother's magic pony knows a hilbilly who grows human babys has a great aunt who knows this smurf named female smurf")) {
		return "grandmas freind's brother's magic pony knows a hilbilly who grows human babys has a great aunt who knows this smurf named female smurf";
	}else {
		return "dude smurf";
	}
		
		
		
	}

}



