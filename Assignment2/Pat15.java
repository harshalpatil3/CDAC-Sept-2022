class Pat15{
	public static void main(String args[]){
		
		for(int i = 1; i <=5;i++){  //rows
			
			for(int j = 1; j <=i;j++){    //coloumns
				if( j == 1 || j == i || i == 5)
                    System.out.print("* ");
                else
                    System.out.print(" ");
				
			}
			System.out.println();
		}
	}
}
/*

*
* *
*  *
*   *
* * * * *

*/