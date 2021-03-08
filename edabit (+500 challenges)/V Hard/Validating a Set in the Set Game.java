/*********************************************************************************************************************
 
Validating a Set in the Set Game
In the game Set, three cards form a set if each of the cards are identical or completely different for each of the four properties. All three cards must:

Have the same color or different colors.
Have the same number or different numbers.
Have the same shades or different shades.
Have the same shape or different shapes.
The four properties are:

Colors: red, purple, green
Numbers: 1, 2, 3
Shades: empty, lined, full
Shapes: squiggle, oval, diamond
Here, a set is represented by an array containing three cards. Each card is represented by an object of properties and values. Write a function that determines whether three cards constitute a valid set.

Here is an example of a set:

[
  { color: "red", number: 1, shade: "empty", shape: "squiggle" },
  { color: "red", number: 2, shade: "lined", shape: "diamond" },
  { color: "red", number: 3, shade: "full", shape: "oval" }
]

// "Same" properties: color
// "Different" properties: numbers, shading and shapes
The following is not a set:

[
  { color: "red", number: 1, shade: "empty", shape: "squiggle" },
  { color: "red", number: 2, shade: "lined", shape: "diamond" },
  { color: "purple", number: 3, shade: "full", shape: "oval" }
]

// Colors are not all identical, but not all different.
Examples
isSet([
  { color: "green", number: 1, shade: "empty", shape: "squiggle" },
  { color: "green", number: 2, shade: "empty", shape: "diamond" },
  { color: "green", number: 3, shade: "empty", shape: "oval" }
]) ➞ true

isSet([
  { color: "purple", number: 1, shade: "full", shape: "oval" },
  { color: "green", number: 1, shade: "full", shape: "oval" },
  { color: "red", number: 1, shade: "full", shape: "oval" }
]) ➞ true

isSet([
  { color: "purple", number: 3, shade: "full", shape: "oval" },
  { color: "green", number: 1, shade: "full", shape: "oval" },
  { color: "red", number: 3, shade: "full", shape: "oval" }
]) ➞ false


Notes
A set cannot have 2/3 cards having the same property. Either all must share that property, or none will share that particular property.
You can play Set by checking the Resources tab.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   



function isSet(cards) {
    for (key in cards[0]){
        var arr=[]
        for (j in cards){
            arr.push(cards[j][key]);
        }
        if (new Set(arr).size==2) return false
    }
return true
}







//#############################################################
//#                        MY SOLUTION 2   


const isSet = cards => {
	let color = new Set();
	let number = new Set();
	let shade = new Set();
	let shape = new Set();
	
	cards.forEach(card => { 
				color.add(card.color);
				number.add(card.number);
				shade.add(card.shade);
				shape.add(card.shape);
		});
	
	if(color.size == 2 || number.size == 2 ||  shade.size == 2 ||  shape.size == 2 ) {
		return false;
	} else {
		return true;
	}
	
}





//#############################################################
//#                        MY SOLUTION 3   



function isSet(cards) {
	var colorSet = new Set(cards.map((x) => x.color));
	if(colorSet.size == 2) return false;

	var numSet = new Set(cards.map((x) => x.number));
	if(numSet.size == 2) return false;
	
	var shadeSet = new Set(cards.map((x) => x.shade));
	if(shadeSet.size == 2) return false;
	
	var shapeSet = new Set(cards.map((x) => x.shape));
	if(shapeSet.size == 2) return false;
	
	return true;
}





//#############################################################
//#                        MY SOLUTION 4


const isSet = cards => Object.keys(cards[0]).every(p => [1,3].includes(new Set(cards.map(c => c[p])).size));