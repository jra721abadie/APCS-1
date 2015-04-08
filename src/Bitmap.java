
public class Bitmap {

	private String image[][] = new String [10] [10];
	
	public Bitmap(int a[]) {
		//Initialize image as all -
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				image[i][j] = "-";
			}
		}
		//Set * at coordinates from a
		for (int i = 0; i < a.length; i+=2) {
			image[a[i]][a[i+1]] = "*";
		}
	}
	
	public void flipHorizontal() {
		String[] temp;
		for (int i = 0; i < image.length; i++) {
			temp = image[i];
			for (int j = 0; j < image[i].length; j++) {
				
			}
		}
	}
	
	public void flipVertical() {
		String[][] temp = image;
		for (int i = 0; i < image.length; i++) {
			image[i] = temp[temp.length-1-i];
		}
	}
	
	public void reverse() {
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				if (image[i][j].equals("-")) {
					image[i][j] = "*";
				}
				else if (image[i][j].equals("*")) {
					image[i][j] = "-";
				}
			}
		}
	}
	
	public String toString() {
		String print = "";
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				print = print + image[i][j];
			}
			print = print + "\n";
		}
		return print;
	}
}
