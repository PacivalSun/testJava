package grammar.exception;
//import yichang.negativeException;

public class testException {
	public static void main(String[] args){
		try {
			System.out.println("异常测试:");
			System.out.println("jisuanjieguo:" + div(10,0));
		}catch(Exception e) {
			System.out.println("异常产生：" + e);
		}
	}
	private static String div(int i, int j) {
		System.out.println("*********ceshikaishi*********");
		int temp = 0;
		try {
			
			if(j==0) {				
				throw new negativeException();
			}
			else {				
				temp = i/j;
			}
		}
		catch(negativeException e0) {
			System.out.println("zidingyiyichang");
			return ("jisuanchucuo");
		}
		catch(Exception e) {
			try {
				throw e;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally {
			System.out.println("*********ceshijieshu*********");
		}
				
		return temp+"";
	}

}
