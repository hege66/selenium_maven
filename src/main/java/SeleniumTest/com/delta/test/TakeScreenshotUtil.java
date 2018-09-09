package SeleniumTest.com.delta.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshotUtil {
	

	public static void takeScreenShot(WebDriver driver,String classname, String methodname) {
		// 获取截图file
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			// 将图片移动到指定位置
			FileUtils.moveFile(file, new File(getFilePath(classname, methodname)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static String getFilePath(String classname, String methodname) {
		// 创建储存图片的路径，不存在则创建
		File dir = new File("screenshot");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String dateStr = dateFormat.format(new Date());
		// 获取新的文件名，包含时间，类名，方法名
		String fileName = dateStr + "_" + classname + "_" + methodname + ".jpg";
		// 获取文件路径
		String filePath = dir.getAbsolutePath() + "/" + fileName;
		return filePath;

	}
}
