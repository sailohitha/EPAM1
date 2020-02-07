package EPAM2.TASK;

public class Sweet extends Abstract{
	public int total_weight(int[] sweet,int n)
	{
		int tot=0;
		for(int i=0;i<n;i++)
		{
			tot+=sweet[i];
		}
		return tot;
	}
	public int num_of_candy(int low,int high,int[] sweet,int c)
	{
		int count=0;
		for(int i=0;i<c;i++)
		{
			if(sweet[i]>=low && sweet[i]<=high)
				count++;
		}
		return count;
	}

}