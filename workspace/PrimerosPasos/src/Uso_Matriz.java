
public class Uso_Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz = new int[4][5];
		
		matriz[0][0]=0;
		matriz[0][1]=1;
		matriz[0][2]=2;
		matriz[0][3]=3;
		matriz[0][4]=4;

		matriz[1][0]=0;
		matriz[1][1]=6;
		matriz[1][2]=7;
		matriz[1][3]=8;
		matriz[1][4]=9;
		
		matriz[2][0]=0;
		matriz[2][1]=11;
		matriz[2][2]=12;
		matriz[2][3]=13;
		matriz[2][4]=14;
		
		matriz[3][0]=0;
		matriz[3][1]=16;
		matriz[3][2]=17;
		matriz[3][3]=18;
		matriz[3][4]=19;
		
		for (int i=0; i<4; i++){
			System.out.println();
			for (int j=0; j<5; j++){
				System.out.println(matriz[i][j]+" ");
			}
		}
	}

}
