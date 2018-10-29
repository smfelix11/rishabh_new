package com.nissan.trainingcorejava;

public class LocalInnerClassAssg {
	
	int arr[]= {2,4,1,55,66,3,7,7,8,1,9};

	public void oddEven()
	{
		class OddEven
		{
			int arrEven[]= new int[arr.length];
			int arrOdd[]= new int[arr.length];
			
			public void separate()
			{	int countE=0;
				int countO=0;
				for(int i:arr)
				{
					if(i%2==0)
					{
						arrEven[countE]=i;
						countE++;
					}
					else
					{
						arrOdd[countO]=i;
						countO++;
					}
				}
				
				for(int i:arrEven)
				{
					System.out.print("-"+i);
				}
				System.out.println();
				for(int i:arrOdd)
				{
					System.out.print("-"+i);
				}
				
				
			}
		}
		OddEven o= new OddEven();
		o.separate();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClassAssg l= new LocalInnerClassAssg();
		l.oddEven();
	}

}
