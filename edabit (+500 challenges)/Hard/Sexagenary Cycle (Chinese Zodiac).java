/*********************************************************************************************************************
 
Sexagenary Cycle (Chinese Zodiac)

In early recorded Chinese history, time was reckoned using the sexagenary (60-year) cycle, generated from two subcycles:

Five heavenly stems (elements) in this order: wood, fire, earth, metal, water. The stems change every two years.
Twelve earthly branches (animals) in this order: rat, ox, tiger, rabbit, dragon, snake, horse, sheep, monkey, rooster, dog, pig. The branches change yearly.
The combinations between these two sub-cycles result in a 60-year cycle where no two years are the same — for example, the 5 years of the Rat have 5 different elements: 1924 Wood Rat, 1936 Fire Rat, 1948 Earth Rat, 1960 Metal Rat, 1972 Water Rat.

The first 14 years of the current cycle are shown in the table below:

Gregorian Year	Stem	Branch
1984	Wood	Rat
1985	Wood	Ox
1986	Fire	Tiger
1987	Fire	Rabbit
1988	Earth	Dragon
1989	Earth	Snake
1990	Metal	Horse
1991	Metal	Sheep
1992	Water	Monkey
1993	Water	Rooster
1994	Wood	Dog
1995	Wood	Pig
1996	Fire	Rat
1997	Fire	Ox
These days, the sexagenary cycle is used mainly for historical celebrations and events, and in Chinese astrology. The Gregorian calendar is now the standard means of reckoning time.

Create a function that takes a number representing a year in the Gregorian calendar, and returns a string consisting of the corresponding stem-and-branch combination in the sexagenary cycle.



Examples
sexagenary(1971) ➞ "Metal Pig"

sexagenary(1927) ➞ "Fire Rabbit"

sexagenary(1974) ➞ "Wood Tiger"
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String sexagenary(int year) {
		String[] animals = new String[]{"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
		String[] elements = new String[]{"Metal", "Water", "Wood", "Fire", "Earth"};
		// animal index is year % 12
		// element index is (int) year / 2 % 5
		String animal = animals[year%12];
		String element = elements[(year/2) % 5];
		return element + " " + animal;
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	private static String[] animals = new String[]{"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep", "Monkey", "Rooster", "Dog", "Pig"};
	private static String[] elements = new String[]{"Wood", "Wood", "Fire", "Fire", "Earth", "Earth", "Metal", "Metal", "Water", "Water", "Wood", "Wood"};
	private static int START_YEAR = 1984;
	
	public static String sexagenary(int year) {
		int yearDif = year - START_YEAR;
		int animalNum = yearDif % 12;
		animalNum = (animalNum < 0) ? 12 + animalNum : animalNum;
		int elemNum = yearDif % 10;
		elemNum = (elemNum < 0) ? 10 + elemNum : elemNum;
		return elements[elemNum] + " " + animals[animalNum];
	}
}




//#############################################################
//#                        MY SOLUTION 3   



import java.util.*;
public class Challenge {
	public static String sexagenary(int year) {
	

	ArrayList<String> al1 = new ArrayList<>();
	ArrayList<String> al2 = new ArrayList<>();
	ArrayList<String> al3 = new ArrayList<>();
	

	
	for(int i = 0 ; i < 12 ; i++) {
		al1.add("Wood");
		al1.add("Wood");
		al1.add("Fire");
		al1.add("Fire");
		al1.add("Earth");
		al1.add("Earth");
		al1.add("Metal");
		al1.add("Metal");
		al1.add("Water");
		al1.add("Water");
	}
	
	for(int i = 0 ; i < 10 ; i++) {
		al2.add("Rat");
		al2.add("Ox");
		al2.add("Tiger");
		al2.add("Rabbit");
		al2.add("Dragon");
		al2.add("Snake");
		al2.add("Horse");
		al2.add("Sheep");
		al2.add("Monkey");
		al2.add("Rooster");
		al2.add("Dog");
		al2.add("Pig");
	}
	
	
	
	
	
	System.out.println(al1.size());
	System.out.println(al2.size());
	
	
	for(int i = 0 ; i < al1.size() ; i++) {
		al3.add(al1.get(i) + " " + al2.get(i));
	}
	
	
	return (al3.get(year-1924));
	
	


	}
}



//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String sexagenary(int year) {
		String newyear = String.valueOf(year);
		int animal = year % 12;
		System.out.println(animal);
		String[] animals = new String[]{"Monkey","Rooster","Dog","Pig","Rat","Ox", "Tiger","Rabbit","Dragon", "Snake", "Horse", "Sheep"};
		if(newyear.endsWith("4") || newyear.endsWith("5")){
			return "Wood " + animals[animal];
		}
		else if(newyear.endsWith("6") || newyear.endsWith("7")){
			return "Fire " + animals[animal];
		}
		else if(newyear.endsWith("0") || newyear.endsWith("1")){
			return "Metal " + animals[animal];
		}
		else if(newyear.endsWith("2") || newyear.endsWith("3")){
			return "Water " + animals[animal];
		}
		else if(newyear.endsWith("6") || newyear.endsWith("7")){
			return "Fire " + animals[animal];
		}
		else{
			return "Earth " + animals[animal];
		}
	}
}



//#############################################################
//#                        MY SOLUTION 5



public class Challenge {
	public static String sexagenary(int year) {
		        String animal = "";
        String element = "";

        switch (year % 12) {
            case 1:
                animal = "Rooster";
                break;
            case 2:
                animal = "Dog";
                break;
            case 3:
                animal = "Pig";
                break;
            case 4:
                animal = "Rat";
                break;
            case 5:
                animal = "Ox";
                break;
            case 6:
                animal = "Tiger";
                break;
            case 7:
                animal = "Rabbit";
                break;
            case 8:
                animal = "Dragon";
                break;
            case 9:
                animal = "Snake";
                break;
            case 10:
                animal = "Horse";
                break;
            case 11:
                animal = "Sheep";
                break;
            default:
                animal = "Monkey";
                break;

        }
        switch (year % 10) {
            case 0: case 1:
                element = "Metal";
                break;
            case 2: case 3:
                element = "Water";
                break;
            case 4: case 5:
                element = "Wood";
                break;
            case 6: case 7:
                element = "Fire";
                break;
            default:
                element = "Earth";
                break;
        }

        return element + " " + animal;
	}
}