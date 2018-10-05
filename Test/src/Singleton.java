import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Singleton soleInstance;
	
	private Singleton() {
		if(soleInstance!=null) {
			throw new RuntimeException("Already instantiated");
		}
	}
	
	public static Singleton getInstance() {
		if(soleInstance==null) {
			synchronized (Singleton.class) {
				if(soleInstance==null) {
				soleInstance = new Singleton();
				}
			}
		}
		return soleInstance;
	}
	
	
	public Object readResolve() {
        return Singleton.getInstance();
    }
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
	
	/*public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz = Class.forName("Singleton");
		Constructor<Singleton>[] cons = clazz.getDeclaredConstructors();
		cons[0].setAccessible(true);
		Singleton singleton =cons[0].newInstance();
		Singleton sin = Singleton.getInstance();
		System.out.println(sin.hashCode());
		System.out.println(singleton.hashCode());
		
	}
*/
}
