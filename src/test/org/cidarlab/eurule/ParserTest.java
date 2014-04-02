package org.cidarlab.eurule;

import java.io.File;

import org.cidarlab.minieugene.util.FileUtil;

/**
 * 
 * @author Ernst Oberortner
 */
public class ParserTest {

	private EuRule er;
	
	public ParserTest() {
		this.er = new EuRule();
	}
	
	public static void main(String[] args) 
			throws Exception {
		ParserTest pt = new ParserTest();
		
//		pt.test(FileUtil.readFile(new File("./tests/basic")));
		pt.test(FileUtil.readFile(new File("./tests/minN")));
//		pt.test(FileUtil.readFile(new File("./tests/oriented")));
	}
	
	/**
	 * 
	 * @param script
	 */
	private void test(String script) {
		try {
			this.er.test(script);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
