
public class BinaererSuchbaumLinked implements BinaererSuchbaum
{
	Knoten<?> _wurzel;

	public BinaererSuchbaumLinked()
	{
		_wurzel = null;
	}

	// hauptreihenfolge = pre-order
	// nebenreihenfolge = post-order
	// symmetrisch = in-order
	@Override
	public void gebeBaumAus(Reihenfolge reihenfolge)
	{
		if (reihenfolge == Reihenfolge.HAUPTREIHENFOLGE)
		{
			haupreihenfolgeRekursiv(_wurzel);
		}
		else if (reihenfolge == Reihenfolge.NEBENREIHENFOLGE)
		{
			nebenreihenfolgeRekursiv(_wurzel);
		}
		else
		{
			symmetrischRekursiv(_wurzel);
		}

	}

	private void haupreihenfolgeRekursiv(Knoten<?> knoten)
	{
		if (knoten != null)
		{
			System.out.print(knoten.getKey() + " ");

			haupreihenfolgeRekursiv(knoten._linkerSohn);
			haupreihenfolgeRekursiv(knoten._rechterSohn);
		}

	}


	private void nebenreihenfolgeRekursiv(Knoten<?> knoten)
	{
		if(knoten != null)
		{
			nebenreihenfolgeRekursiv(knoten.getLinkerSohn());
			nebenreihenfolgeRekursiv(knoten.getRechterSohn());
		
			System.out.print(knoten.getKey() + " ");
		}
	}


	private void symmetrischRekursiv(Knoten<?> knoten)
	{
		if (knoten != null)
		{
			symmetrischRekursiv(knoten.getLinkerSohn());

			System.out.print(knoten.getKey() + " ");
			
			symmetrischRekursiv(knoten.getRechterSohn());
		}
	}

	@Override
	public void addKnoten(Knoten<?> knoten)
	{
		if (_wurzel == null)
		{
			_wurzel = knoten;
		}
		else
		{
			addKnotenRekursiv(_wurzel, knoten);
		}

	}

	private void addKnotenRekursiv(Knoten<?> wurzel, Knoten<?> knoten)
	{
	
		//wenn der einzufuegende Knoten groesser ist als die Wurzel fuege auf rechter Seite ein
		if (knoten.compareTo(wurzel) == 1)
		{
			if (wurzel.getRechterSohn() == null)
			{
				wurzel.setRechterSohn(knoten);
			}
			else
			{
				addKnotenRekursiv(wurzel.getRechterSohn(), knoten);
			}
		}
		else
		{
			if (wurzel.getLinkerSohn() == null)
			{
				wurzel.setLinkerSohn(knoten);
			}
			else
			{
				addKnotenRekursiv(wurzel.getLinkerSohn(), knoten);
			}
		}
	}

}
