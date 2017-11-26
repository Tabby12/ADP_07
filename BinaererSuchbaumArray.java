
public class BinaererSuchbaumArray implements BinaererSuchbaum{
	Knoten<?>[] baumArray;
	
	public BinaererSuchbaumArray() 
	{
		baumArray = new Knoten[10];
	}
	
	@Override
	public void addKnoten(Knoten<?> knoten) 
	{
		addKnotenRekursiv(1, knoten);
	}
	
	private void addKnotenRekursiv(int index, Knoten<?> knoten)
	{
		if(baumArray[index] == null)
		{
			baumArray[index] = knoten;
			knoten._linkerSohnIndex = index * 2;
			knoten._rechterSohnIndex = (index * 2) + 1;
		}
		// wenn einzufügender knoten groesser als vater ist
		else if(knoten.compareTo(baumArray[index]) == 1)
		{
			if(((index * 2) + 1) > baumArray.length)
			{
				vergroessereArray();
			}
			addKnotenRekursiv((index * 2) + 1, knoten);
		}
		else
		{
			if(index * 2 > baumArray.length)
			{
				vergroessereArray();
			}
			addKnotenRekursiv(index * 2, knoten);
		}
			
		
	}
	
	private void vergroessereArray()
	{
		Knoten<?>[] neuesArray = new Knoten<?>[baumArray.length * 2];
		for (int i = 1; i < baumArray.length; i++) {
			neuesArray[i] = baumArray[i];
		}
		baumArray = neuesArray;
	}
	
	@Override
	public void gebeBaumAus(Reihenfolge reihenfolge) 
	{
		if(reihenfolge == Reihenfolge.HAUPTREIHENFOLGE)
		{
			hauptreihenfolgeRekursiv(1);
		}
		else if(reihenfolge == Reihenfolge.NEBENREIHENFOLGE)
		{
			nebenreihenfolgeRekursiv(1);
		}
		else
		{
			symmetrischRekursiv(1);
		}
	}
	
	private void hauptreihenfolgeRekursiv(int index)
	{
		if(index < baumArray.length && baumArray[index] != null)
		{
			Knoten<?> knoten = baumArray[index];
			System.out.print(knoten.getKey() + " ");
			
			hauptreihenfolgeRekursiv(knoten._linkerSohnIndex);
			hauptreihenfolgeRekursiv(knoten._rechterSohnIndex);
		}
	}
	
	private void nebenreihenfolgeRekursiv(int index)
	{
		if(index < baumArray.length && baumArray[index] != null)
		{
			Knoten<?> knoten = baumArray[index]; 
			nebenreihenfolgeRekursiv(knoten._linkerSohnIndex);
			nebenreihenfolgeRekursiv(knoten._rechterSohnIndex);
			System.out.print(knoten.getKey() + " ");
		}
	}
	
	private void symmetrischRekursiv(int index)
	{
		if(index < baumArray.length && baumArray[index] != null)
		{
			Knoten<?> knoten = baumArray[index];
			symmetrischRekursiv(knoten._linkerSohnIndex);
			System.out.print(knoten.getKey() + " ");
			symmetrischRekursiv(knoten._rechterSohnIndex);
		}
	}
	
}
