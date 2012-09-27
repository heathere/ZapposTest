/**
 * This program sorts a list alphabetically and then prints them vertically.
 * by Heather Estvold
 */

public class NinjaBooks
{
	public static void main(String[] args)
	{  
		//Array of ninja related book titles		
		String[] titles = { "Ninja Burger", "Secrets of the Ninja", "Ninja for Dummies", "Mystic Arts of the Ninja", "Ninjutsu" }; 
		
		//Calls the array alphabetizing method
		sortStringExchange (titles);

		//Initialize Attributes
		boolean empty = true;
		int longest = 0;
  
		//Determine longest string length in the array
		for (int l = 0; l < titles.length; l++)
    		{
        		if (longest < titles[l].length())
        		{
            			longest = titles[l].length();
        		}
    		}
   
		//Print sorted array
		for (int x = 0; x < longest; x++) //looks at each character in the string
		{
			do //keeps loop running after exception error
			{
				try //checks for string in array at subscript y
				{
					for (int y = 0; y < titles.length; y++) //looks at each string in the array
      					{
						do //keeps loop running after exception error
						{
        						try //checks for character in string at position x
							{
            							char letter = titles[y].charAt(x);
								empty = true;
                    					}
                    					catch(StringIndexOutOfBoundsException e) //catches exception errors for strings 
												 //with character lengths less than the max
							{
								System.out.print("   ");
		                				y++; 
								empty = false;
                					}               
						}while(!empty); 
						char letter = titles[y].charAt(x);          		
						System.out.print(letter + "  ");
					}		
				}	
        			catch(ArrayIndexOutOfBoundsException e) //catches exception error resulting from solution to string exception error
				{
		      			break; //exits loop to restart at next x
                		}               
			}while(!empty); 
			System.out.println();
      		}
	}

 	//Array alphabetizing method
	public static void sortStringExchange(String  z[ ])
   	{
		//Declare variable
            	String temp; 

            	for (int i = 0; i < z.length - 1; i++)
            	{
                	for (int j = i + 1; j < z.length; j++)
                	{  
                         	if (z[i].compareToIgnoreCase(z[j]) > 0) //compares strings
                          	{                                             
                                      temp = z[i];			//changes array subscript of string
                                      z[i] = z [j];    
                                      z[j] = temp;          
                           	} 
                   	} 
             	} 	
	}
}
