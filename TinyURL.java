import java.util.*;

/*
 * Design the encode and decode methods for the TinyURL service. 
 * 2017.9.26
 * Lee
 * 思路：用62个字符来编码长Url：用随机产生的6位字符代表一个长url
 * 
 */
public class TinyURL {
	String tinyUrlBase = "http://tinyurl.com/";
	String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	Random r = new Random(47);
    Map<String, String> shortToLong = new HashMap<String, String>();
    Map<String, String> longToShort = new HashMap<String, String>();
    
	// Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
    	String shortUrl = null;
    	if(longToShort.get(longUrl) != null){
    		return longToShort.get(longUrl);	//longtoshort已经存在对应的键值对
    	}else{
    		 shortUrl = creatEncode();//建立6位随机数，并存入longToShort Map中
    		while(shortToLong.get(shortUrl)!=null){
    			shortUrl = creatEncode();		//shorttolong已经存在对应的键值对则重新生成
    		}
    	longToShort.put(longUrl, shortUrl);
    	shortToLong.put(shortUrl, longUrl);
    	}
        return shortUrl;
    }
    
    private String creatEncode(){
    	//char[] shortUrlCharArray = new char[6];
    	String shortUrl = "";
		for(int i=0; i<6; i++){
			String s = String.valueOf(characters.charAt(r.nextInt(62)));
			shortUrl += s;
		}
			//建立6位随机数，并存入longToShort Map中
    	
		return tinyUrlBase + shortUrl;  	
    }
    
 // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
    	String decode = null;
    	decode = shortToLong.get(shortUrl);
    	
        return decode == null ? "" : decode;
    }
}

	class TestTinyURL{
		public static void main(String[] args){
			TinyURL tURL = new TinyURL();
			System.out.println(tURL.encode("https://leetcode.com/problems/design-tinyurl"));
			System.out.println(tURL.decode(tURL.encode("https://leetcode.com/problems/design-tinyurl")));
		}
	}


