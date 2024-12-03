package test;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Vocabulary600 {

    public static void main(String[] args) throws IOException, InterruptedException {
        //1. Init WebDriver session
        WebDriver driver = DriverFactory.getChromeDriver322(); //Select once on 4 ways to initial WebDriver
        driver.manage().window().maximize(); // Mở trình duyệt ở chế độ toàn màn hình

        //2. Open target page
        driver.get("https://600tuvungtoeic.com/index.php?mod=lesson&id=1");
        Thread.sleep(3000);

        //3. Find elements
        List<WebElement> rows = driver.findElements(By.xpath("//div[@class='tuvung' and ./div[@class='stt']]"));

        // Tạo file CSV
        FileWriter writer = new FileWriter("output.csv");

        // Ghi header vào file CSV
        writer.append("No, Image, Vocabulary, Meaning");

        // Ghi dữ liệu từ danh sách vào file CSV
        if(!rows.isEmpty()) {
            for (int i = 0; i < rows.size(); i++) {
                String no = driver.findElements(By.xpath("//div[@class='stt']")).get(i).getText();
                String image = driver.findElements(By.xpath("//div[@class='hinhanh']/img")).get(i).getAttribute("src");
            String voca = driver.findElements(By.xpath("//div[@class='stt']")).get(i).getText();
//            writer.append(String.join(",", no,image));
                System.out.println(no);
                System.out.println(image);
            }
        }
        writer.flush();
        writer.close();
        driver.close();
        driver.quit();
        }

}
