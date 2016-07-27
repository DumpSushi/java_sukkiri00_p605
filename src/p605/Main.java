package p605;

import java.io.InputStream;
import java.net.URL;

public class Main {

	public static void main(String[] args) throws Exception {
		URL u = new URL("http://www.impressjapan.jp/");
		InputStream is = u.openStream();
		int count = 0;
		while(true)
		{
			int i = is.read();
			char c = (char)i;
			System.out.print(c);
			++count;
			if (i == -1 || count > 20)
			{
				break;
			}
		}

	}

}
