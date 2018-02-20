
public class Nodo 
{
	public int info;
	public Nodo next;
	public Nodo back;
	public int posizione;
	
	public Nodo()
	{
		
	}
	public Nodo(int info)
	{
		this.info = info;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Nodo getNext() {
		return next;
	}

	public void setNext(Nodo next) {
		this.next = next;
	}
	
}
