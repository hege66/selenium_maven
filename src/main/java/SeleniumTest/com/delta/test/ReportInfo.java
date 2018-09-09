package SeleniumTest.com.delta.test;

import java.util.List;

/**
 * define ReportInfo class
 * 
 * @author V.Hehe.Deng
 *
 */
public class ReportInfo {
	
	private String name;
	
	private String className;

	private String methodName;
	
	private String description;
	
	private String spendTime;
			
	private String status;
	
	private List<String> log;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getSpendTime() {
		return spendTime;
	}

	public void setSpendTime(String spendTime) {
		this.spendTime = spendTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getLog() {
		return log;
	}

	public void setLog(List<String> log) {
		this.log = log;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
