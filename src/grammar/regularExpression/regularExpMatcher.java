package grammar.regularExpression;
import java.util.regex.*;
import static net.mindview.util.Print.*;

/**
 * 测试正则表达式
 * @param tar--short of target (the String you are going to use to compare with others)
 * @param str--short of String[] (Strings you are going to compare with the target String)
 * @author yichi.sun
 *
 */
public class regularExpMatcher {
	public static void main(String[] args) {
		String tar = "abcabcabcdefabc";
		String[] strs = new String[] {"abc+","(abc)+","(abc){2,}"};
		isExpression(tar,strs);
	}
	public static void isExpression(String tar,String[] strs) {
		System.out.println(strs.length);
		if (strs.length < 2) {
			print("Usage:\njava TestRegularExpression " + "characterSequence regularExpression+");
			System.exit(0);
		}
		print("Input:\"" + tar + "\"");
		for (String arg : strs) {
			print("Regulat Expression \"" + tar + "\"");
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(tar);
			while(m.find()) {
				print("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1));
			}
		}
	}

}
