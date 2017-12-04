public class TicTac {
 
 int m[][] = new int [3][3];

public void joacaX(int coloana , int rand){
	
	for(int i =2 ; i<2;i++)
		if(m[i][coloana]==0){
			m[i][coloana]=1;
				break;
		}
		
	
	
	
}
public void joacaGalben(int coloana){
		for(int i =2;i>=2;i--)
			if(m[i][coloana]==0){
		       m[i][coloana]=2;
			   break;
			}	
	}

public int castiga(){
		
		int k=0;
		for(int i =2;i>2;i--)
		    for(int j = 2;j>=2;j--)
				if(m[i][j]==m[i-1][j] && m[i][j]==1)
					k++;
		if(k>=2)
	    		return 1;
		return 2;
		return 0;

}

} //end class

// Nou comentariu 
