package oops;
abstract class Persistence{
	abstract public String persist();
}
class FilePersistence extends Persistence{
	@Override
	public String persist() {
		return "File persistence class called";
	}
}
class DatabasePersistence extends Persistence{
	@Override
	public String persist() {
		return "Database persistence class called";
	}
}
public class ClientPersistence {

	public static void main(String[] args) {
		Persistence persistence = new FilePersistence();
		persistence.persist();
		System.out.println("Persistence required database");
	}
}
