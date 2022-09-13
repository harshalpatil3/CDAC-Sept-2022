class Pat13{
	public static void main(String args[]){
		for(int i = 1; i <=5;i++){           //1st 5 rows
			for(int j = 1;j<i;j++){
				System.out.print(" ");
			}
			for(int j = 5; j >=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 2; i <=5;i++){             //last 4 rows
			for(int j = 4;j>=i;j--){
				System.out.print(" ");
			}
			for(int j = 1; j <=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*

*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****

*/