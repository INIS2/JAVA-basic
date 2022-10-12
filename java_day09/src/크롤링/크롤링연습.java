package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습 {

	public static void main(String[] args) {

		// 1. 사이트에 연결 + html문서를 다 가지고 오자
		// Jsoup.connect(String url).get() + try&catch + Document 타입의 변수에 저장
		try {
			Document doc = Jsoup.connect("http://www.naver.com").get();
			// System.out.println(doc);
			
			// select = 클래스가 nav인 태그를 찾아서 가져와줘
			// Elements = arraylist의 상속을 받은 것
			Elements list = doc.select(".nav"); 
			System.out.println(list.size());
			System.out.println(list.get(0));
			
			for (int i = 0; i < list.size(); i++) {
				// list를 tag로 넣고, 태그에서 text만 프린트
				Element tag = list.get(i);
				System.out.println(i + " : " + tag.text());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
