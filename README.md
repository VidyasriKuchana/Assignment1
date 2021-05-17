# java Assignment1 Pattern Program.

 This is a program to print a star pattern as given below..:

 
            *
          *   *
        *       *
      *           *
    * * * * * * * * *

If we look at the entire code we designed to obtain the mentioned pattern, 

      class Pattern{
	        	public static void main(String[] args){
			         	int space1=5,space2=-1;
				            for(int i=0;i<5;i++){
				                    	space1--;
					
				                   	for(int j=0;j<space1;j++) System.out.print("  ");
				                   	System.out.print("*");
					                   for(int j=0;j<space2;j++){
					                         	if(i!=4)	 System.out.print("  ");
					                         	else System.out.print(" *");
				                   	}
				                  	if(i!=0) System.out.print(" *");
			                  		System.out.println();
			                  		space2+=2;
			           	}
				
	        	}
      }
      
      
We have a class Pattern, in which we put main(String[] args). If we look at the output, there are five rows. 

In outer for loop, we have taken a variable in order to get five rows.
i.e.,

         for(int i=0;i<5;i++)
         
We took two variables, space1, space2 inorder to print spaces. In first row, we have 4 spaces. In row 2 , we have 3 spaces... and so on. So, we have written a statement to decrease the space1 value after every i value. And printed the spaces using a for loop.
i.e.,
       
       space1--;
       for(int j=0;j<space1;j++)
             System.out.print("  ");
       
After printing spaces, we have to print one * in every row, we can make it happen by writing a statement as shown :

      System.out.print("*");
      
Again we have spaces to be printed, this time the no. of spaces are increasing by 2 for every row. And this is done by using a variable space2 and a for loop.
But for the last row, we have all stars to be printed, it can be managed with a simple if condition as shown:

       for(int j=0;j<space2;j++){
					                         	if(i!=4)	 System.out.print("  ");
					                         	else System.out.print(" *");
				                   	}
              space2+=2;

And then we have one more star to be printed in the given pattern.. That can be done by the below statement in the code.

        System.out.print("*");
        
If we observe, we arev printing everything in the same line for each row, to change row after printing everything in the row, we have another statement in the end.

     System.out.println();
     
     
 To compile the code we follow the command like... 
        
        javac Pattern.java
        
 To execute and get the output, we use the command :
 
       java Pattern
       
 After executing, we get the output as mentioned pattern.
© 2021 GitHub, Inc.
