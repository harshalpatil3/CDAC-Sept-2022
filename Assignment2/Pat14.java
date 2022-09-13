class Pat14{
	public static void main(String args[]){
		
		for(int i = 1; i <=5;i++){      //rows
			for(int j =1;j<i;j++){     //  equal spaces  
				System.out.print(" ");
			}
			for(int k = i;k<=5;k++){    //coloumns
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int i = 4; i >=1;i--){      //rows
			for(int j =1;j<i;j++){     // equal spaces    
				System.out.print(" ");
			}
			for(int k = i;k<=5;k++){    //coloumns
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
/*

* * * * *
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *

*/