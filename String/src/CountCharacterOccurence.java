
public class CountCharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String text = "Hello My Name is Ronaldo";
     System.out.print("Length of the String "+text.length());
     System.out.print("\n");
     String c = "o";
     int count = text.length()-text.replace("o", "").length();
     System.out.print("Character "+c+" Occurence in the String "+count);
	}

}
