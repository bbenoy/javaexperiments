import java.util.*;
class matrixflatten
{
public static void main(String args[])
{
matrixflatten mf=new matrixflatten();
int[][] orgmatrix={{1,2,3},{4,5,6},{7,8,9}};
//mf.flatten(orgmatrix);
System.out.println(mf.flatten(orgmatrix));
}

public ArrayList flatten(int[][] pmatrix)
{
	System.out.println("ORIGINAL ARRAY");
	System.out.println(Arrays.deepToString(pmatrix));	
    ArrayList list=new ArrayList();
	//System.out.println("Modified ARRAY");
		for(int m=0;m<pmatrix.length;m++)
		{
			for(int j=0;j<pmatrix[m].length;j++)
			{
			list.add(pmatrix[m][j]);
		    }
		}
     System.out.println("NEW ARRAY");

     //System.out.println(Arrays.deepToString(list.toArray()));	
		return list;
			
}

}