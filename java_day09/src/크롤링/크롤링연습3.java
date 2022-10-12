// 로또 크롤링
package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습3 {

	public static void main(String[] args) {

		// 1. 사이트에 연결 + html문서를 다 가지고 오자
		// Jsoup.connect(String url).get() + try&catch + Document 타입의 변수에 저장
		try {
			Document doc = Jsoup.connect("https://dhlottery.co.kr/gameResult.do?method=byWin").get();
			 System.out.println(doc);
			
			Elements list = doc.select("num win"); 
			System.out.println(list.size());
			System.out.println(list);
			

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
