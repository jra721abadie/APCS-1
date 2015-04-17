
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
		if (a.length % 2 == 0) {
			for (int i = 0; i < a.length; i+=2) {
				if (a[i] >= 0 && a[i] < 10 && a[i+1] >= 0 && a[i+1] < 10) {
					image[a[i]][a[i+1]] = "*";
				}
				else {
					for (int k = 0; k < image.length; k++) {
						for (int l = 0; l < image[k].length; l++) {
							image[k][l] = "-";
						}
					}
				}
			}
		}
		else {
			for (int i = 0; i < image.length; i++) {
				for (int j = 0; j < image[i].length; j++) {
					image[i][j] = "-";
				}
			}
		}
	}
	
	public void flipHorizontal() {
		for (int j = 0; j < image.length; j++)
		{
			for (int i = 0; i < image[j].length / 2; i++)
			{
				String temp = image[j][i];
				image[j][i] = image[j][image.length - i - 1];
				image[j][image.length - i - 1] = temp;
			}
		}
	}
	
	public void flipVertical() {
		for (int i = 0; i < image.length / 2; i++)
		{
		    String[] temp = image[i];
		    image[i] = image[image.length - i - 1];
		    image[image.length - i - 1] = temp;
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
