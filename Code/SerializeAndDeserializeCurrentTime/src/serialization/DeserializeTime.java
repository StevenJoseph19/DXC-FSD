package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class DeserializeTime {

	public static void main(String[] args) {
		String filename = "time.ser";
		if (args.length > 0)
			filename = args[0];

		// Deserialize the object instance and save it in a file.
		PersistentTime time = null;
		FileInputStream fis = null;
		ObjectInputStream in = null;

		try {
			fis = new FileInputStream(filename);
			in = new ObjectInputStream(fis);
			time = (PersistentTime) in.readObject();
			in.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}

		// Print out the restored time
		System.out.println("Previously serialized time is " + time.getTime());

		// Print out the restored time
		System.out.println("Current time is " + Calendar.getInstance().getTime());
	}

}
