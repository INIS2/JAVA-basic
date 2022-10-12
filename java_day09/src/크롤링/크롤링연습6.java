// 증권 크롤링 기본
package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습6 {

	public String naver (String code) {
		//tag가 try 안에 있어서 return불가, 밖으로 뺴줘서 전역변수 설정
		Element tag = null, tag2 = null, tag3 = null;
		
		try {
			System.out.println("========================");
			
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code).get();
			Elements name = doc.select("h2").select("a"); // 한번 더 셀렉트
			System.out.println("회사명 : " + name.text());

			Elements list = doc.select("td.first").select(".blind"); // 한번 더 셀렉트
			tag = list.get(0);
			System.out.println("전일가 " + tag.text());
			String yesterday = tag.text();
			
			Elements list2 = doc.select("div.today").select(".blind");
			tag2 = list2.get(0);
			System.out.println("현재가 " + tag2.text());
			String today = tag2.text();
			
			Elements list3 = doc.select("td.first").select(".blind");
			tag3 = list3.get(1);
			System.out.println("시가 " + tag3.text());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 	"전일가: " + tag.text() + "\n" +
		"현재가: " + tag2.text() + "\n" +
		"시가: " + tag3.text();
		
		
	}

}
