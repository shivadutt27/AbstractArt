import java.util.ArrayList;
import java.lang.Math;
class Museum
{
	public static void main(String[] args)
	{
		ArrayList<Art> museum = new ArrayList<>();
		
		Painting p1 = new Painting("Asian");
		Painting p2 = new Painting("Nerolac");
		Painting p3 = new Painting ("Decco");
	
		Sculpture s1 = new Sculpture("Male");
		Sculpture s2 = new Sculpture("Female");
	
		museum.add(p1);
		//museum.add(p2);
		museum.add(p3);
		
		museum.add(s1);
		museum.add(p2);
		museum.add(s2);
		

		int randInt = (int) (Math.random()*10);
		System.out.println(randInt);
		if(randInt<museum.size())
		{
			museum.get(randInt).viewArt();
		}
		else
		{
			System.out.println("Index not added yet");
		}

	
	}

}


