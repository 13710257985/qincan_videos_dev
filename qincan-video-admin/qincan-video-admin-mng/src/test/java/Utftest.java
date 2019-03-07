import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.commons.lang3.StringUtils;

public class Utftest {
	private void mian() throws UnsupportedEncodingException {
		String finalPath = "/bgm/哈哈h.mp3";
		String arrPath[] = finalPath.split("/");
		for (int i = 0; i < arrPath.length; i++) {
			if(StringUtils.isNotBlank(arrPath[i])) {
				finalPath += "/";
				finalPath += URLEncoder.encode(arrPath[i], "UTF-8") ;
				System.out.println(finalPath);
			}
			
		}
	}
}
