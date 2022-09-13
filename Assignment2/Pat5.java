class Pat5{
	public static void main(String args[]){
		for(int i = 1; i <=9;i=i+2){      //rows
			for(int j =8;j>=i;j=j-2){     // equal spaces on both side   
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
output
    *
   ***
  *****
 *******
*********
*/