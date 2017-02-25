import java.util.*;
import java.io.*;

public class hashcode2017_streaming_videos
{
	public static void main(String [] args) throws IOException
	{
		File zoo = new File("me_at_the_zoo.in");
		Scanner sc = new Scanner(zoo);
		String firstLine[] = sc.nextLine().split(" ");
		String[] sizes = sc.nextLine().split(" ");
		//for(int i = 0; i < sizes.length; i++)
		//	System.out.println(sizes[i]);
		//boolean done = false;
		ArrayList<ArrayList<String>> endpoints = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<ArrayList<String>>> endpointInfo = new ArrayList<ArrayList<ArrayList<String>>>();
		String elements1[];
		for(int i = 0; i < Integer.parseInt(firstLine[1]);i++)
		{
			endpoints.add(new ArrayList<String>());
			endpointInfo.add(new ArrayList<ArrayList<String>>());
			elements1 = sc.nextLine().split(" ");
			for(int x = 0; x <= 1; x++)
				endpoints.get(i).add(elements1[x]);
			for(int j = 0; j < (Integer.parseInt(endpoints.get(i).get(1))); j++)
			{
				endpointInfo.get(i).add(new ArrayList<String>());
				elements1 = sc.nextLine().split(" ");
				for(int y = 0; y <= 1; y++)
					endpointInfo.get(i).get(j).add(elements1[y]);
			}
		}
		/*for(int i = 0; i < endpointInfo.size(); i++)
			for(int j = 0; j < endpointInfo.get(i).size(); j++)
				System.out.println(endpointInfo.get(i).get(j));*/
		ArrayList<ArrayList<String>> requests = new ArrayList<ArrayList<String>>();
		String elements2[];
		for(int i = 0; i < Integer.parseInt(firstLine[2]);i++)
		{
			requests.add(new ArrayList<String>());
			elements2 = sc.nextLine().split(" ");
			for(int x = 0; x <= 2; x++)
				requests.get(i).add(elements2[x]);
		}
		/*for(int i = 0; i < requests.size(); i++)
			System.out.println(requests.get(i));
			//for(int j = 0; j < requests.get(i).size(); j++)
				//System.out.println(endpointInfo.get(i).get(j));*/
		sc.close();
		int [][] cacheAccess = new int [Integer.parseInt(firstLine[3])][Integer.parseInt(firstLine[1])];
		for(int i = 0; i < Integer.parseInt(firstLine[1]); i++)
			for(int j = 0; j < Integer.parseInt(endpoints.get(i).get(1)); j++)
			{
				cacheAccess[Integer.parseInt(endpointInfo.get(i).get(j).get(0))][i]++;
			}
		/*for(int i = 0; i < Integer.parseInt(firstLine[3]); i++)
		{
			for(int j =0; j < Integer.parseInt(firstLine[1]); j++)
				System.out.print(cacheAccess[i][j] + " ");
			System.out.println();
		}*/
		ArrayList<ArrayList<ArrayList<String>>> videos = new ArrayList<ArrayList<ArrayList<String>>>();
		for(int i = 0; i < Integer.parseInt(firstLine[1]);i++)
		{
			videos.add(new ArrayList<ArrayList<String>>());
			videos.get(i).add(new ArrayList<String>());
			videos.get(i).add(new ArrayList<String>());
		}
		int value;
		for(int i = 0; i < requests.size(); i++)
		{
			//if(videos.get((Integer.parseInt(requests.get(i).get(1)))).get(1).contains((requests.get(i).get(0)))
			//{
			//	value = Integer.parseInt(requests.get(i).get(0));
			//	videos.get((Integer.parseInt(requests.get(i).get(1)))).get(1).indexOf((requests.get(i).get(0)))
			//}
			//else
			//{
				videos.get((Integer.parseInt(requests.get(i).get(1)))).get(0).add(requests.get(i).get(2));
				videos.get((Integer.parseInt(requests.get(i).get(1)))).get(1).add(requests.get(i).get(0));
			//}
		}
		for(int i = 0; i < videos.size(); i++)
			for(int j = 0; j < videos.get(i).size(); j++)
				System.out.println(videos.get(i).get(j));
	}
	
}