package studio8;

public class Date {


    public static void main(String[] args) {

    }
    public interface List<Double> {
    	
    }
    public int hashCode() {
    	   return 0;
    	}
    LinkedList<Date> list = new LinkedList<Date>();
    
    System.out.println(list);
    Date d1 = new Date(...stuff your constructor needs);
    Date d2 = new Date(...same info as above, so these will equal each other);
    list.add(d1);
    list.add(d2);
    list.add(d1);
    System.out.println(list);
    
    HashSet<Date> set = new HashSet<Date>();
    set.add(d1);
    set.add(d2);
    set.add(d1);
    System.out.println(set);

}
