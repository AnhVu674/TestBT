package test;

public class xuLyException extends Exception {
float x;
float y;
public xuLyException(float x, float y) {
	this.x = x;
	this.y = y;
}
 @Override
	public String getMessage() {
		return "Exception by/0" + " " +"("+x+"/"+y+")";
	}
}
