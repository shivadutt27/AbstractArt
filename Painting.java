public class Painting extends Art
{
	private String paintType;
	
	public Painting(String paintType)
	{
		this.paintType = paintType;	
	}

	public void viewArt()
	{
		System.out.println("Its a paintype");
	}
}
