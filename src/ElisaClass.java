import java.util.*;
import java.util.Random;
public class ElisaClass 
{
	public HashMap<Integer, String> hedgeSet = new HashMap<Integer, String>();
	public HashMap<Integer, String> qualifierSet = new HashMap<Integer, String>();
	public HashMap<String,String> replacementMap = new HashMap<String,String>();
	public HashMap<Integer,String > hedgeVSQual = new HashMap<Integer,String>();


	public void addData(String resp)
	{
		Random rnd = new Random();

		int randomHQ = 1 + rnd.nextInt(2);
		int randomHedge = 1 + rnd.nextInt(3);
		int randomQual = 1 + rnd.nextInt(3);

		hedgeSet.put(1,"Please tell me more");
		hedgeSet.put(2,"Many of my patients tell me the same thing");
		hedgeSet.put(3,"It is getting late, maybe we had better quit");

		qualifierSet.put(1,"Why do you say that");
		qualifierSet.put(2,"You seem to think that");
		qualifierSet.put(3,"So, you are concerned that");


		replacementMap.put("i", "you");
		replacementMap.put("me", "you");
		replacementMap.put("my", "your");
		replacementMap.put("am", "are");
		
		if(randomHQ == 1)
		{
			String myResponse = hedgeSet.get(randomHedge);
			System.out.println(myResponse);
		}
		if(randomHQ == 2)
		{
			String myResponse1 = qualifierSet.get(randomQual);
			String myResponse2 = null;
			System.out.print(myResponse1);
			String delim = " ";
			String[] parts = resp.split(delim);

			for(int i=0;i<parts.length;i++)
			{
				if(replacementMap.containsKey(parts[i]))
				{
				myResponse2 = replacementMap.get(parts[i]);
				System.out.print(" " +myResponse2);
				}
				else
				{
				System.out.print(" " +parts[i]);
				}

			}

		}

	}
}
