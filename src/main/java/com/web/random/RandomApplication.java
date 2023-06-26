package com.web.random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.IOException;
import java.net.URL;
import java.util.List;

@SpringBootApplication
public class RandomApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(RandomApplication.class, args);
//		final WebClient webClient = new WebClient();
//		URL link=new URL("https://quizlet.com/vn/698599311/n5-bai-2-flash-cards/");
//		WebRequest request=new WebRequest(link);
//		request.setAdditionalHeader("Cookie","qi5=wlza6hmsc33i%3AWpKnYZ2eA9tK7Wh7SeLe; fs=rwlw61; _pbjs_userid_consent_data=3524755945110770; _lr_env_src_ats=false; pbjs-unifiedid=%7B%22TDID%22%3A%22540243aa-ddff-4a73-859c-276b2c038b9f%22%2C%22TDID_LOOKUP%22%3A%22TRUE%22%2C%22TDID_CREATED_AT%22%3A%222023-05-21T13%3A58%3A54%22%7D; g_state={\"i_p\":1687363172840,\"i_l\":1}; _gcl_au=1.1.448581154.1687356041; afUserId=c78b547b-f4cb-4be0-b388-5e22a0847469-p; AF_SYNC=1687356043335; qlts=1_FooU2o2xL4i7pR3R3O8IRX86VOKmjtxHjY5CkiZqVzgy57ckbULI0l2A0tmMUoqoG-0O7fcZjb34cw; __qca=P0-14536505-1687356065313; _fbp=fb.1.1687356065686.1461883236; _tt_enable_cookie=1; _ttp=pDyGFEHpJuktYKWFM5HsryvvBoi; AMZN-Token=v2FweIBoYzN6enQ3R1pWb0RMUWJ6TmdNd2hqdERXRVR0NkphVkg0NzVCQWlHbG1lemtrRXdEYThpVlp2bmQ4WnY5UUFEMW9jNXZ6ZmxtcXp5aXluK1JWZXY5eEhaUVliSzc1KzlNcnNtOFUxaStFS29BeWxJdnl1SjBSaHYxQWNZU3BZSmJrdgFiaXZ4GEtnZFBEM1JNNzcrOTc3KzlYVEFER1E9Pf8=; _delighted_web={%22Nk3AkgdeccgO4tql%22:{%22_delighted_fst%22:{%22t%22:%221687356123994%22}}}; _cc_id=d1ac9dfa2774f12591246937c8d20389; panoramaId_expiry=1687961101498; panoramaId=ad162c4b0acfa72770245e4dc90e16d53938d5b90a75e5e421a99e2024e639fb; panoramaIdType=panoIndiv; __gads=ID=2cac1e6376a8114a:T=1687600602:RT=1687600602:S=ALNI_MYScm8nJX3GToWlAgOWf5ClNKMo4w; __gpi=UID=00000c17df32e69a:T=1687600602:RT=1687600602:S=ALNI_MbARQg_LzHP5_rdDgBCv4ltttjkOQ; akv=%7B%7D; qtkn=darnvWk4z4KWYuVp83Sr4Y; days_since_last_visit=2; __cfruid=43d72991d3780975170df70fe7433c8507e83ea5-1687788029; _cfuvid=mciK5LWv7N.s6LEvsj8TYGbtBYnMkHJuZ5q9R9WRTJM-1687788029018-0-604800000; session_landing_page=Sets%2Fshow; tsp=set_page; ab.storage.deviceId.6f8c2b67-8bd5-42f6-9c5f-571d9701f693=%7B%22g%22%3A%22df715ec2-4a94-7001-476c-8da52aef524e%22%2C%22c%22%3A1687356065174%2C%22l%22%3A1687788069184%7D; ab.storage.userId.6f8c2b67-8bd5-42f6-9c5f-571d9701f693=%7B%22g%22%3A%22313496833%22%2C%22c%22%3A1687356065172%2C%22l%22%3A1687788069185%7D; qmeasure__persistence=%7B%2253%22%3A%2200100000%22%7D; _gid=GA1.2.1732237013.1687788069; _lr_geo_location=VN; app_session_id=a3f2a215-1941-4a9b-882a-ed534998c434; _lr_retry_request=true; search_session=%7B%22search_session_id%22%3A%223134968336499b181c3d48%22%2C%22query%22%3A%22N5%2520-%2520B%25C3%2580I%25204%22%2C%22version%22%3A%221.1.1%22%2C%22platform%22%3A%22WEB%22%2C%22depth%22%3A1%2C%22target_object_id%22%3A698601839%2C%22target_object_type%22%3A%22QSet%22%2C%22source_model_id%22%3A698601839%2C%22source_model_type%22%3A%22QSet%22%7D; __cf_bm=7xsL9V4A0q.kyPImbteqYY7egMBYiOZUoxrnm8.Q07I-1687794681-0-ASjDElDLnnb/jxRM/lHuCzUEGHbw0zwD9PnQniu+4nkREvSCBzZCnS1eBXE5T2GOrlrsecNG6KHMtjaPaaEt1d13Vv/8iYfK8W7mtzgC34DS; _ga_BGGDEZ0S21=GS1.1.1687792742.9.1.1687794837.0.0.0; _ga=GA1.1.834014744.1687355964; ab.storage.sessionId.6f8c2b67-8bd5-42f6-9c5f-571d9701f693=%7B%22g%22%3A%22bc04e597-4a61-c38f-9eac-f0d1bd8378d2%22%2C%22e%22%3A1687796638237%2C%22c%22%3A1687792738156%2C%22l%22%3A1687794838237%7D; cto_bundle=GBlwKV9IOEVKQSUyQjBrbGpoM3hEV05UWWJMVnFtdTNwM3JacyUyRkdzc3NQcE1obnZGRlRuYTloRGRzcnM1dmZNY2paTllHajVVdiUyQnpFRWhvWU5ERHRWOHMwb01CSWp5ck1ONWRwR2wwSmwxWnJhdk1ucTNWZzFUdUNBcFZPeGlLd0Q0ZTlRTlVyZGM2aG1PdVdWV2dKZExXY2Z6JTJGdyUzRCUzRA; cto_bidid=tKWu_F9HUUMzVHEyVUlhSFJtSXlDTWlsd3NGdmpmZ3ZJS2VkZkElMkIxMW5vc0J0dGhCalZ3NGFyNFJLSHZHYmFycFhuelJEQkNSbHBmcVdPN2VNOHRVSDNjWm4wam5nZ1cyaGlMU1AycFh0JTJCRGE0eWclM0Q\n");
//		request.setAdditionalHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36");
//		webClient.getOptions().setJavaScriptEnabled(false);
//		webClient.getOptions().setCssEnabled(false);
//		webClient.getCurrentWindow().setInnerHeight(10000000);
//		final HtmlPage page = webClient.getPage(request);
//		List<HtmlElement> elements = page.getByXPath("//div[contains(@class, 'SetPageTerms-term')]");
//		HtmlElement ten = elements.get(9);
//		HtmlElement vi = (HtmlElement)ten.getByXPath("//span[contains(@class, 'lang-vi')]").get(0);
//		System.out.println("aaaa: "+vi.getTextContent());
//		HtmlElement ja = (HtmlElement)ten.getByXPath("//span[contains(@class, 'lang-ja')]").get(0);
//		System.out.println("bbbb: "+ja.getTextContent());
//		System.out.println("aaa");

//		System.setProperty("webdriver.chrome.driver", "src/test//chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.get("https://quizlet.com/vn/698599311/n5-bai-2-flash-cards/");
//		List<WebElement> divs = driver.findElements(By.xpath("//div[contains(@class, 'SetPageTerm-contentWrapper')]"));
//		for(WebElement div : divs){
//			WebElement vi = div.findElement(By.xpath(".//span[contains(@class, 'lang-vi')]"));
//			WebElement jp = div.findElement(By.xpath(".//span[contains(@class, 'lang-ja')]"));
//			System.out.println("----"+jp.getText().split("\n")[0]+"-----"+vi.getText().split("\n")[0]);
//		}


	}

}
