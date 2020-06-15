import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStream {

	public static void main(String[] args) throws IOException {
		InputStream jay = new FileInputStream("C://users/matthew_hauser/pictures/jay.jpg");
		OutputStream jayMovin = new FileOutputStream("C://users/matthew_hauser/desktop/jayHasMoved.jpg");
		
		
		
		
		jayMovin.write(jay.read());
		jay.close();
		jayMovin.close();
		
	}
}
