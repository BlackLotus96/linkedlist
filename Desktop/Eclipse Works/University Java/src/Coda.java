
public class Coda {
	public Nodo head;
	public Nodo last;
	public Nodo iter;
	public int listCount;

	public Coda(int listCount) {
		this.listCount = listCount;

	}

	public void inserisci(int elemento) {
		Nodo nodo = new Nodo(elemento);
		last = head;
		nodo.next = null;

		if (head == null) {
			head = nodo;
			nodo.back = null;
			listCount+=1;
		} else 
		{
			while (last.next != null) 
			{
				last = last.next;
			}
			nodo.back = last;
			last.next = nodo;
			listCount+=1;
		

		}
	}

	public void rimuovi() {
		//Nodo iter = new Nodo();
		if(listCount == 1)
		{
			head = null;
			return;
		}
		
		last.next = null;
	    listCount-=1;
		last = last.back;
		

	}

	public boolean isEmpty() {
		return (head == null);
	}
	
	public int length()
	{
		return listCount;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		if (head == null)
		{
			sb.append("[]");
		}
		else{
			
		
			sb.append("[");
			iter = head;
			while (iter.next != null) 
			{
				sb.append(iter.info + ", ");
				iter = iter.next;
			}
		

		sb.append(iter.info + "]");
		}
		return sb.toString();
	}
	

	public static void main(String[] args) {
		Coda c = new Coda(0);
		c.inserisci(1);
		c.inserisci(2);
		c.inserisci(3);
		c.inserisci(4);
		c.rimuovi();
		c.rimuovi();
		c.rimuovi();
		c.inserisci(5);
		c.rimuovi();
		c.rimuovi();
		c.inserisci(100);
		c.inserisci(20);
		c.rimuovi();
		c.rimuovi();
		
		//System.out.println(c.length());
		System.out.println(c.toString());
	}
}
