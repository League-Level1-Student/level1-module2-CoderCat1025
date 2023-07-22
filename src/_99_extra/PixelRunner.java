package _99_extra;

public class PixelRunner {
public static void main(String[] args) {
	PixelParty party = new PixelParty();
	party.setColor(0, 0, 100);
	party.drawTriangle(1, 100, 103, 34, 54, 250);
	party.drawCircle(200, 120, 30);
	party.drawRectangle(170, 153, 50, 143);
	
	party.saveImage();
	party.displayImage();
}
}
