package diagonalx;

public class DiagonalX {
	
	public static void main(String[] args) {
		
		char[] resposta = new char[10];
		int x = 0;
		int y = resposta.length-1;
		int n = 0;
	
		y=resposta.length-1;
		x=0;
						
		for(int i = 0;i<resposta.length;i++) {
			for(int j = 0;j<resposta.length;j++) {
				if(j!=y) {
					resposta[x]='-';
					}else{
					resposta[x]='x';
				}
			System.out.print(resposta[i]);	
			}
			x++;
			y--;
			System.out.println();
		}
	}
}

