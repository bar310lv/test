import java.util.Scanner;

class Main{

	public static void main(String args[]){


		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);

		int W = s1.nextInt();
		int H = s2.nextInt();


		int number[][] = new int[W][H];


		for(int i = 0;i < W;i++){
			for(int j = 0;j < H;j++){
				Scanner s3 = new Scanner(System.in);
				    number[i][j] = s3.nextInt();

				if(number[i][j]>=128&&number[i][j]<=255){
					number[i][j] = 1;
				}else if(number[i][j]<=127&&number[i][j]>=0){
					number[i][j] = 0;
				}

				

			}
			System.out.println("");
		}

		for(int a = 0;a < W;a++){
			for(int b = 0;b < H;b++){
				System.out.print(number[a][b]);
			}

			System.out.println("");


		}






	}
	

}
