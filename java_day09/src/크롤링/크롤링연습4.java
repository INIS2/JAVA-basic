// 증권 크롤링 기본
package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습4 {

	public static void main(String[] args) {
		String[] code = {"005930","006400","010140"};
		String[] company = {"삼성전자","삼성SDI","삼성중공업"};

		try {
			
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code).get();
			System.out.println("회사명 : ");

			
			Elements list = doc.select("td.first").select(".blind"); // 한번 더 셀렉트
			Element tag = list.get(0);
			System.out.println("전일가 " + tag.text());
			String yesterday = tag.text();
			
			Elements list2 = doc.select("div.today").select(".blind");
			Element tag2 = list2.get(0);
			System.out.println("현재가 " + tag2.text());
			String today = tag2.text();
			
			Elements list3 = doc.select("td.first").select(".blind");
			Element tag3 = list3.get(1);
			System.out.println("시가 " + tag3.text());
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
