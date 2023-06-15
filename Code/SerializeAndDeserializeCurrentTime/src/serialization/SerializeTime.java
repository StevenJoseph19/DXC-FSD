package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTime {

	public static void main(String[] args) {
		String filename = "time.ser";
		if (args.length > 0)
			filename = args[0];

		// Create an object
		PersistentTime time = new PersistentTime();

		// Serialize the object instance and save it in a file.
		FileOutputStream fos = null;
		ObjectOutputStream out = null;

		try {
			fos = new FileOutputStream(filename);
			out = new ObjectOutputStream(fos);
			out.writeObject(time);
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Current time is save into " + filename);
	}

}
