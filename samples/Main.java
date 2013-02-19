package samples;

import java.io.BufferedReader;
import java.io.PrintStream;

import com.adobe.xmp.XMPException;
import com.adobe.xmp.XMPMeta;
import com.adobe.xmp.XMPMetaFactory;

public class Main {
	private static PrintStream log;

	public static void main(String[] args) {

		String inputString = readFile("/Users/bruce/Desktop/test.xmp");
		
		println(inputString);

		try {
			XMPMeta meta1 = XMPMetaFactory.parseFromString(inputString);
			printXMPMeta(meta1, "this is the title");

		} catch (XMPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static String readFile(String dir) {
		BufferedReader br = null;
		String outputString = "";

		try {
			String sCurrentLine;

			br = new BufferedReader(new java.io.FileReader(dir));

			while ((sCurrentLine = br.readLine()) != null) {
				outputString = outputString + sCurrentLine;
			}

		} catch (java.io.IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (java.io.IOException ex) {
				ex.printStackTrace();
			}
		}

		return outputString;
	}

	/**
	 * Print the content of an XMPMeta object a headline and its name.
	 * 
	 * @param meta
	 *            an <code>XMPMeta</code> object
	 * @param title
	 *            the headline
	 */
	private static void printXMPMeta(XMPMeta meta, String title) {
		String name = meta.getObjectName();
		if (name != null && name.length() > 0) {
			println(title + " (Name: '" + name + "'):");
		} else {
			println(title + ":");
		}
		println(meta.dumpObject());
		println();
	}

	/**
	 * Prints a string message to both log file and system out.
	 * 
	 * @param message
	 *            the message
	 */
	private static void println(String message) {
		System.out.println(message);
		//log.println(message);
	}

	/**
	 * Prints a newline to both log file and system out.
	 */
	private static void println() {
		println("");
	}
}
