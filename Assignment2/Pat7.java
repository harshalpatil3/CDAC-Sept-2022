class Pat7{
	public static void main(String args[]){
		for(int i = 1; i <=8;i=i+2){      //rows
			for(int j =7;j>=i;j=j-2){     // equal spaces   
				System.out.print(" ");
			}
			for(int j = 1;j<=i;j=j+1){    //coloumns
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 9; i >=1;i=i-2){      //rows
			for(int j =i;j<=8;j=j+2){     // equal spaces on both side   
				System.out.print(" ");
			}
			for(int j = 1;j<=i;j=j+1){    //coloumns
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/	
	
