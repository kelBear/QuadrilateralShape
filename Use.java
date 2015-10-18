import java.io.*;
public class Use {
	
	static int countSq = 1, countRec = 1, countRhom = 1, countPara = 1, countKite = 1, countTrap = 1;
	static Object [] square = new Object [countSq];
	static Object [] rectangle = new Object [countRec];
	static Object [] rhombus = new Object [countRhom];
	static Object [] parallelogram = new Object [countPara];
	static Object [] kite = new Object [countKite];
	static Object [] trapezoid = new Object [countTrap];
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int choice;
		choice = choiceSelection();
		buildShape(choice, countSq, countRec, countRhom, countPara, countKite, countTrap);
	}
	public static int choiceSelection () throws IOException {
		int choice;
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.println ("Welcome to the Quadrilateral program!");
		System.out.println ("You may create your own shape and calculate the area and perimeter of the shape.");
		System.out.println ("Please make your selection from the list below:");
		System.out.println ("1. Square");
		System.out.println ("2. Rectangle");
		System.out.println ("3. Rhombus");
		System.out.println ("4. Parallelogram");
		System.out.println ("5. Kite");
		System.out.println ("6. Trapezoid");
		System.out.println ("7. Output all shapes that were created");
		System.out.println ("8. Exit");
		choice = Integer.parseInt(br.readLine());
		return choice;
	}
	
	public static void buildShape (int choice, int countSq, int countRec, int countRhom, int countPara, int countKite, int countTrap) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		int defaultSelect = 0, changeDim = 0;
		double length = 1, width = 1;
		while (choice != 8){
			switch (choice){
			case 1:
				System.out.println ("Would you like to create a default square?");
				System.out.println ("1. Yes");
				System.out.println ("2. No");
				defaultSelect = Integer.parseInt(br.readLine());
				if (defaultSelect == 1) {
					System.out.println("The length is: "+length);
					System.out.println ("Would you like to change it?");
					System.out.println ("1. Yes");
					System.out.println ("2. No");
					changeDim = Integer.parseInt (br.readLine());
					if (changeDim == 1){
						System.out.println("Please enter the length of your square:");
						length = Double.parseDouble (br.readLine());
						Square Sq = new Square();
						Sq.setLength (length);
						square[countSq-1]=Sq;
						countSq++;
						System.out.println(Sq.toString());
					}
					else if (changeDim == 2){
						Square Sq = new Square(length);
						square[countSq-1]=Sq;
						countSq++;
						System.out.println(Sq.toString());
					}
				}
				else if (defaultSelect == 2){
					System.out.println("Please enter the length of your square:");
					length = Integer.parseInt(br.readLine());
					System.out.println("The length is: "+length);
					System.out.println ("Would you like to change it?");
					System.out.println ("1. Yes");
					System.out.println ("2. No");
					changeDim = Integer.parseInt (br.readLine());
					if (changeDim == 1){
						System.out.println("Please enter the length of your square:");
						length = Double.parseDouble (br.readLine());
						Square Sq = new Square();
						Sq.setLength (length);
						square[countSq-1]=Sq;
						countSq++;
						System.out.println(Sq.toString());
					}
					else if (changeDim == 2){
						Square Sq = new Square(length);
						square[countSq-1]=Sq;
						countSq++;
						System.out.println(Sq.toString());
					}
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				System.out.println("Bye!");
				break;
			}
			System.out.println ();
			choice = choiceSelection();
		}
	}
}
