package sukkiriPractice;

public class StrongBox<E> {
	private E item;
	private KeyType keyType;
	private Long callCount;
	public void put(E item) {
		this.item = item;
	}
	public E get() {
		this.callCount++;
		switch(this.keyType){
			case PADLOCK:
				if (callCount < 1024) {
					return null;
				}
			case BUTTON:
				if (callCount < 10000) {
					return null;
				}
			case DIAL:
				if (callCount < 30000) {
					return null;
				}
			case FINGER:
				if (callCount < 1000000) {
					return null;
				}
		}
		this.callCount = 0L;
		return this.item;
	}
	//デフォルトコンストラクタ
	public StrongBox() {

	}

	public StrongBox(KeyType keyType) {
		this.keyType = keyType;
	}
}

enum KeyType {
	PADLOCK,
	BUTTON,
	DIAL,
	FINGER
}