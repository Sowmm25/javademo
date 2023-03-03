package innerclass;
public class innerclass2 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
  car c=new car("white");
  c.start();
  car.musicsystem c2 = c.new musicsystem(4);
  c2.playmusic();
  
	}

}
class car{
	private static String model="toyoto";
	private String color;
	car(String color){
		this.color=color;
	}
	void start() {
		System.out.println("car is starting");
	}
	class musicsystem{
		private int numchannels;
		musicsystem(int num){
			this.numchannels=num;
		}
		void playmusic() {
			System.out.println("car model is:"+car.model);
			System.out.println("color is"+car.this.color);
			System.out.println("no of channels:"+this.numchannels);
		}
	}
}