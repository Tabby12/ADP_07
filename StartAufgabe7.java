
public class StartAufgabe7
{
	public static void main(String[] args)
	{
		BinaererSuchbaumLinked bsLinked = new BinaererSuchbaumLinked();
		Knoten<Integer> intKnoten1 = new Knoten<Integer>(Integer.valueOf(1));
		Knoten<Integer> intKnoten2 = new Knoten<Integer>(Integer.valueOf(2));
		Knoten<Integer> intKnoten3 = new Knoten<Integer>(Integer.valueOf(3));
		Knoten<Integer> intKnoten5 = new Knoten<Integer>(Integer.valueOf(5));
		Knoten<Integer> intKnoten6 = new Knoten<Integer>(Integer.valueOf(6));
		Knoten<Integer> intKnoten7 = new Knoten<Integer>(Integer.valueOf(7));
		Knoten<Integer> intKnoten8 = new Knoten<Integer>(Integer.valueOf(8));
		bsLinked.addKnoten(intKnoten5);
		bsLinked.addKnoten(intKnoten2);
		bsLinked.addKnoten(intKnoten8);
		bsLinked.addKnoten(intKnoten1);
		bsLinked.addKnoten(intKnoten3);
		bsLinked.addKnoten(intKnoten6);
		bsLinked.addKnoten(intKnoten7);
		System.out.println("Linked: ");
		System.out.print("Hauptreihenfolge: ");
		bsLinked.gebeBaumAus(Reihenfolge.HAUPTREIHENFOLGE);
		System.out.println();
		System.out.print("Nebenreihenfolge: ");
		bsLinked.gebeBaumAus(Reihenfolge.NEBENREIHENFOLGE);
		System.out.println();
		System.out.print("Symmetrisch: ");
		bsLinked.gebeBaumAus(Reihenfolge.SYMMETRISCH);
		System.out.println();
		System.out.println();
		BinaererSuchbaumArray bsArr = new BinaererSuchbaumArray();
		bsArr.addKnoten(intKnoten5);
		bsArr.addKnoten(intKnoten2);
		bsArr.addKnoten(intKnoten8);
		bsArr.addKnoten(intKnoten1);
		bsArr.addKnoten(intKnoten3);
		bsArr.addKnoten(intKnoten6);
		bsArr.addKnoten(intKnoten7);
		System.out.println("Array: ");
		System.out.print("Hauptreihenfolge: ");
		bsArr.gebeBaumAus(Reihenfolge.HAUPTREIHENFOLGE);
		System.out.println();
		System.out.print("Nebenreihenfolge: ");
		bsArr.gebeBaumAus(Reihenfolge.NEBENREIHENFOLGE);
		System.out.println();
		System.out.print("Symmetrisch: ");
		bsArr.gebeBaumAus(Reihenfolge.SYMMETRISCH);
	}
}
