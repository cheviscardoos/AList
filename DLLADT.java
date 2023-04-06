
public interface DLLADT<E> {
	abstract void addFirst(E data);	
	abstract void addLast(E data);
	abstract E first() ;
	abstract E last();
	abstract int size() ;
	abstract void removeFirst() ;	
	abstract void removeLast() ;
	abstract boolean isEmpty() ;
}
