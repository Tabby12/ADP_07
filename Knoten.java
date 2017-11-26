
public class Knoten<T>
{
	T _daten;
	int _key;
	int _linkerSohnIndex;
	int _rechterSohnIndex;
	Knoten<?> _linkerSohn;
	Knoten<?> _rechterSohn;
	public Knoten(T daten)
	{
		_daten = daten;
		_key = daten.hashCode();
		_linkerSohn = null;
		_rechterSohn = null;
	}
	
	public int getKey()
	{
		return _key;
	}
	
	public Knoten<?> getLinkerSohn()
	{
		return _linkerSohn;
	}
	
	public Knoten<?> getRechterSohn()
	{
		return _rechterSohn;
	}
	
	public void setLinkerSohn(Knoten<?> linkerSohn)
	{
		_linkerSohn = linkerSohn;
	}
	
	public void setRechterSohn(Knoten<?> rechterSohn)
	{
		_rechterSohn = rechterSohn;
	}
	
	public int compareTo(Knoten<?> knoten)
	{
		if(this._key > knoten.getKey())
		{
			return 1;
		}
		else if(this._key < knoten.getKey())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	
		
}
