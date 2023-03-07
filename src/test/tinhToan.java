package test;

public class tinhToan {
public static float thuong(float x, float y) throws xuLyException {
	if(y==0) {
		throw new xuLyException(x,y);
	}
	return x/y;
}
public static float t(float x, float y) throws Exception {
	
	try {
		return x/y;
	} catch (Exception e) {
if(y==0)throw new Exception("loi chia 0");
	
	} finally {
		System.out.println();
}
	return x/y;
}
}

