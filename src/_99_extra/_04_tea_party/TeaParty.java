package _99_extra._04_tea_party;


public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if (isWoman == true) {
			if (isKnighted == true) {
				// knighted woman\
				return ("Hello Lady " + name);
			}
			else {
				//non-knighted woman
return ("Hello Ms. " + name);
			}
		}
		else
			if (isKnighted == true) {
				// Knighted man
				return("Hello Sir " + name);
			}
			else {
				//non-knighted man
				return("Hello Mr. " +name);
			}

	}
}
