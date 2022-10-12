package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습2 {

	public static void main(String[] args) {

		// 1. 사이트에 연결 + html문서를 다 가지고 오자
		// Jsoup.connect(String url).get() + try&catch + Document 타입의 변수에 저장
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
			// System.out.println(doc);
			
			// select = 클래스가 nav인 태그를 찾아서 가져와줘
			// Elements = arraylist의 상속을 받은 것
			Elements list = doc.select(".blind"); 
//			System.out.println(list.size());
//			System.out.println(list);
			
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				System.out.println(i + " " +tag);
			}
			
			
			//현재가
			Element tag = list.get(16);
			System.out.println("현재가 : " + tag.text());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
