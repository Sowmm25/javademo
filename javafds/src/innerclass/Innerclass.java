package innerclass;
public class Innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //innerclass-classes within classes
		//static innerclass
		electricdevice.poweron();
		electricdevice e=new electricdevice();
        e.poweroff();
        electricdevice.chip.displayname();
        electricdevice.chip c=new electricdevice.chip();
        c.price();
        electricdevice.processor p=e.new processor();
        p.getvoltage();
        
	}

}
class electricdevice{
	static void poweron() {
		System.out.println("turned on..");
	}
	void poweroff() {
		System.out.println("turned off");
	}
	static class chip{
		static void displayname() {
			System.out.println("sony");
		}
		void price() {
			System.out.println("20000");
		}
	}

	 class processor{
		
		public void getvoltage() {
			System.out.println("processor");
		}
		
	}
}
