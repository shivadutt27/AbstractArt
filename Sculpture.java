class Sculpture extends Art
{
	private String material;

	public Sculpture(String material)
	{
		this.material = material;
	}

	public void viewArt()
	{
		System.out.println("This is Sculpture");
	}
}
