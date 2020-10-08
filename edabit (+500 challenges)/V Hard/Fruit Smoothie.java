/*********************************************************************************************************************
 Fruit Smoothie
Create a class Smoothie and do the following:

Create a property called Ingredients.
Create a GetCost method which calculates the total cost of the ingredients used to make the smoothie.
Create a GetPrice method which returns the number from GetCost plus the number from GetCost multiplied by 1.5. Round to two decimal places.
Create a GetName method which gets the ingredients and puts them in alphabetical order into a nice descriptive sentence. If there are multiple ingredients, add the word "Fusion" to the end but otherwise, add "Smoothie". Remember to change "-berries" to "-berry". See the examples below.
Ingredient	Price
Strawberries	$1.50
Banana	$0.50
Mango	$2.50
Blueberries	$1.00
Raspberries	$1.00
Apple	$1.75
Pineapple	$3.50
Examples
s1 = Smoothie(new string[] { "Banana" })

s1.Ingredients ➞ { "Banana" }

s1.GetCost() ➞ "£0.50"

s1.GetPrice() ➞ "£1.25"

s1.GetName() ➞ "Banana Smoothie"
s2 = Smoothie(new string[] { "Raspberries", "Strawberries", "Blueberries" })
s2.ingredients ➞ { "Raspberries", "Strawberries", "Blueberries" }

s2.GetCost() ➞ "£3.50"

s2.GetPrice() ➞ "£8.75"

s2.GetName() ➞ "Blueberry Raspberry Strawberry Fusion"

Notes
Feel free to check out the Resources tab for a refresher on classes.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   




// Its possible to solve using some or all of these librarys.

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Program
{
	public class Smoothies
	{
		static Dictionary<string, string> prices = new Dictionary<string, string>()
		{
			{ "Strawberries", "$1.50" },
			{ "Banana", "$0.50" },
			{ "Mango", "$2.50" },
			{ "Blueberries", "$1.00" },
			{ "Raspberries", "$1.00" },
			{ "Apple", "$1.75" },
			{ "Pineapple", "$3.50" }
		};

		// write your code here!

				public Smoothies(IEnumerable<string> ingredients)
		{
			Ingredients = ingredients.ToArray();
		}

		public string[] Ingredients { get; private set; }

		public string GetCost()
		{
			return $"£{calculateCost():#0.00}";
		}

		public string GetPrice()
		{
			return $"£{calculateCost() * 2.5m:#0.00}";
		}

		public string GetName()
		{
			return string.Join(" ", Ingredients.OrderBy(i => i).Select(ing => ing.EndsWith("ies") ? ing.Substring(0, ing.Length - 3) + "y" : ing))
				+ (Ingredients.Length > 1 ? " Fusion" : " Smoothie");
		}

		private decimal calculateCost()
		{
			return Ingredients.Select(ing => decimal.Parse(prices[ing].Substring(1))).Sum();
		}
	}
}











//#############################################################
//#                        MY SOLUTION 2   




// Its possible to solve using some or all of these librarys.

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using System.Globalization;

namespace Program
{
	public class Smoothies
	{
		static Dictionary<string, string> prices = new Dictionary<string, string>()
		{
			{ "Strawberries", "£1.50" },
			{ "Banana", "£0.50" },
			{ "Mango", "£2.50" },
			{ "Blueberries", "£1.00" },
			{ "Raspberries", "£1.00" },
			{ "Apple", "£1.75" },
			{ "Pineapple", "£3.50" }
		};

		static Dictionary<string, double> pricesDec = new Dictionary<string, double>()
		{
			{ "Strawberries", 1.50 },
			{ "Banana", 0.50 },
			{ "Mango", 2.50 },
			{ "Blueberries", 1.00 },
			{ "Raspberries", 1.00 },
			{ "Apple", 1.75 },
			{ "Pineapple", 3.50 }
		};

		static Dictionary<string, string> names = new Dictionary<string, string>()
		{
			{ "Strawberries", "Strawberry" },
			{ "Banana", "Banana" },
			{ "Mango", "Mango" },
			{ "Blueberries", "Blueberry" },
			{ "Raspberries", "Raspberry" },
			{ "Apple", "Apple" },
			{ "Pineapple", "Pineapple" }
		};

		
		public string[] Ingredients { get; set; }

		public Smoothies(string[] ingredients)
		{
			Ingredients = ingredients;
		}

		public string GetCost()
		{			
			return GetMoneyString(GetDoubleCost());
		}

		private double GetDoubleCost()
		{
			double cost = 0f;

			foreach (string ingredient in Ingredients)
			{
				cost += pricesDec[ingredient];
			}

			return cost;
		}

		public string GetPrice()
		{			
			return GetMoneyString(GetDoublePrice());
		}

		private static string GetMoneyString(double amount)
		{
			string money = amount.ToString("0.00", CultureInfo.InvariantCulture);

			return "£" + money;
		}

		private double GetDoublePrice()
		{
			double cost = GetDoubleCost();

			double price = cost * 2.5;

			return price;
		}

		public string GetName()
		{
			StringBuilder builder = new StringBuilder();

			Array.Sort(Ingredients);

			foreach (string ingredient in Ingredients)
			{
				builder.Append(names[ingredient] + " ");
			}

			if (Ingredients.Length > 1)
			{
				builder.Append("Fusion");
			}
			else
			{
				builder.Append("Smoothie");
			}

			return builder.ToString();			
		}

	}
}



















//#############################################################
//#                        MY SOLUTION 3   




// Its possible to solve using some or all of these librarys.

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Program
{
	public class Smoothies
	{
		static Dictionary<string, string> prices = new Dictionary<string, string>()
		{
			{ "Strawberries", "$1.50" },
			{ "Banana", "$0.50" },
			{ "Mango", "$2.50" },
			{ "Blueberries", "$1.00" },
			{ "Raspberries", "$1.00" },
			{ "Apple", "$1.75" },
			{ "Pineapple", "$3.50" }
		};
    
		public Smoothies(string[] ingin)
		{
			Ingredients = ingin;
		}
		public string cost{get;set;}
		public string price{get;set;}	
		public string name{get;set;}
		public string[] Ingredients{get;set;}	

		public string GetCost()
		{
			double costs = 0;
			foreach(string ing in Ingredients)
			{
				//cost = prices[ing];
				
				char[] chararro = prices[ing].ToCharArray();
				double costd = Convert.ToDouble(chararro[1].ToString())+Convert.ToDouble(chararro[3].ToString())/10+Convert.ToDouble(chararro[4].ToString())/100;
				//Console.Write("bgfgg");
				costs = costs+costd;				
				//chararro[0] = '£';
				//string costo = new string(chararro);
				//cost = cost + costo;
				//char[] chararr = prices[ing].ToCharArray();
				//Console.Write(chararr[3].ToString());
				//Console.Write("bgfgg");
				//double costd = Int16.Parse(chararr[1].ToString())+Int16.Parse(chararr[3].ToString())/10+Int16.Parse(chararr[4].ToString())/100;
				//cost = cost + costd;
				//Console.Write(cost.ToString());
			}
			double costsd = Math.Round(costs,2);
			cost = "£"+costsd.ToString("F2");
			//Console.Write("bgfgg");
			return cost;
		}
		public string GetPrice()
		{
			char[] chararr = cost.ToCharArray();
			double costd = Convert.ToDouble(chararr[1].ToString())+Convert.ToDouble(chararr[3].ToString())/10+Convert.ToDouble(chararr[4].ToString())/100;
			double priced = Math.Round(1.5*costd+costd,2);
			string strout = "£"+priced.ToString("F2");
			//Console.Write(strout);
			return strout;
		}
		public string GetName()
		{
			
			name = "";
			Array.Sort(Ingredients);
			foreach(string ing in Ingredients)
			{
				string sting = ing;
				if(ing == "Strawberries")
				{
					sting = "Strawberry";
				}
				if(ing == "Raspberries")
				{
					sting = "Raspberry";
				}
				if(ing == "Blueberries")
				{
					sting = "Blueberry";
				}
				if(Ingredients.Length>1)
				{
					name = name +sting+ " " ;
				}
				else
					 {
						 name = name + sting+ " " ;
					 }
				
			}
			if(Ingredients.Length>1)
			{
				name = name + "Fusion";
			}
			else
			{
				name = name + "Smoothie";
			}
			return name;	
		}
		// write your code here!

	}
}












//#############################################################
//#                        MY SOLUTION 4


using System;
using System.Collections.Generic;

namespace Program
{
	public class Smoothies
    {
        static Dictionary<string, string> prices = new Dictionary<string, string>()
        {
            { "Strawberries", "$1.50" },
            { "Banana", "$0.50" },
            { "Mango", "$2.50" },
            { "Blueberries", "$1.00" },
            { "Raspberries", "$1.00" },
            { "Apple", "$1.75" },
            { "Pineapple", "$3.50" }
        };

        public string[] Ingredients { get; set; }
        private double Cost { get; set; }
        public Smoothies(string [] ingredients)
        {
            Ingredients = ingredients;
        }
        public string GetCost ()
        {
            double cost = 0;
            foreach (string ingredient in Ingredients)
            {
                if(prices.ContainsKey(ingredient))
                {
                    string a = prices[ingredient].Trim('$');
                    cost += double.Parse(a, System.Globalization.CultureInfo.InvariantCulture);
                }
            }
            Cost = cost;
            string result = ("£" + cost.ToString("0.00")).Replace(',','.');
            return result;
        }
        public string GetPrice()
        {
            double price = Cost + Cost*1.5;
            return "£" + price.ToString("0.00");
        }
        public string GetName()
        {
            string suffix = "ies";
            if (Ingredients.Length == 1)
            {
                if (Ingredients[0].EndsWith(suffix))
                    return Ingredients[0].Substring(0, Ingredients[0].Length - suffix.Length) + "y" + " Smoothie";
                return Ingredients[0] + " Smoothie";
            }
                
            List<string> ingredientsList = new List<string>();
            string name = "";
            foreach (string item in Ingredients)
            {
                if (item.EndsWith(suffix))
                    ingredientsList.Add(item.Substring(0, item.Length - suffix.Length)+"y");
                else
                    ingredientsList.Add(item);

            }
            ingredientsList.Sort();
            name = string.Join(" ", ingredientsList);
            name += " Fusion";
            return name;
        }
    }
}