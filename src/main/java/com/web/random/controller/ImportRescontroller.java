package com.web.random.controller;


import com.web.random.dto.VocabularyDTO;
import com.web.random.entity.Vocabulary;
import com.web.random.repository.VocabularyRepository;
import com.web.random.service.VocabularyService;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ImportRescontroller {
    private final VocabularyService service;
    @GetMapping("/import")
    public String importData(@RequestParam(name = "url", defaultValue = "") String url){
        System.setProperty("webdriver.chrome.driver", "src/test//chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(url);
        List<WebElement> divs = driver.findElements(By.xpath("//div[contains(@class, 'SetPageTerm-contentWrapper')]"));
        for(WebElement div : divs){
            WebElement vi = div.findElement(By.xpath(".//span[contains(@class, 'lang-vi')]"));
            WebElement jp = div.findElement(By.xpath(".//span[contains(@class, 'lang-ja')]"));
            VocabularyDTO vocabularyDTO = new VocabularyDTO(vi.getText().split("\n")[0],jp.getText().split("\n")[0],2);
            service.add(vocabularyDTO);
        }
        return "success";
    }

}
