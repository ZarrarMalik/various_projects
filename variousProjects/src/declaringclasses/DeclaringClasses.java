package declaringclasses;

public class DeclaringClasses {
public static void main (String args[]) {
	DeclaringClasses myclass = new DeclaringClasses();
	Class c = myclass.getClass();
	try {
		System.out.println(c.getMethod("getNumber", null).toString());
		System.out.println(c.getDeclaredMethod("setNumber", null).toString());
	}catch (NoSuchMethodException | SecurityException e)
	{}
}
public Integer getNumber() {
	return 2;
}

public void setNumber (Integer n) {
	
}
}

