package ncu.cs.agile;

import java.io.IOException;
import java.util.Scanner;

/* ********************************************
 * class UI (user interface) aUI處理使用界面
 * 
 * checkID(ID) 檢查ID是否正確
 * promptCommand() 詢問指令
 * promptID() 詢問ID
 * showFinishMsg()
 * showWelcomeMsg(ID)
 * UI()  建構 aUI  (constructor)
 * 加入 aGradeSystem Object
 * ********************************************/

public class UI {
	// constructor
	public UI() {

	}
	
	/*----------------------------------------------------------------------------------------------------------
	checkID(ID) throws IDExceptions1, IDExceptions2

	exception: IDExceptions1  print “這ID含字母 錯了!”
	           IDExceptions2  print “這ID長度不對 錯了!”
	return: boolean
	
	1.	if a char in ID isLetter then throw an IDExceptions1 object end if
	2.	if length of ID not equal 9 then throw an IDExceptions2 object end if
	3.	return true
	-------------------------------------------------------------------------------------------------------------- */
	public boolean checkID(String ID) throws IDExceptions1, IDExceptions2{
		int len = ID.length();
		for(int i = 0;i < len; i++) {
			if((Character.isLetter(ID.charAt(i)) == true)) {
				throw new IDExceptions1();
			}else if(len != 9) {
				throw new IDExceptions2();
			}
		}
		return true; 
	}
	
	/*-------------------------------------------------------------------------------------------------------------
	promptCommand () 詢問指令
	return: command  G (Grade), R (Rank), W (Weights), or E (Exit)
	
	1.loop 
		prompt user for a command
	  until command is G (Grade),R (Rank), W (Weights), or E (Exit),
	2.return command
	-----------------------------------------------------------------------------------------------------------------*/
	public String promptCommand() {
		while(true) {
			System.out.println("輸入指令:\n" +
		                       "1) G 顯示成績 (Grade)   \n" + 
					           "2) R 顯示排名 (Rank)    \n" + 
		                       "3) W 更新配分 (Weights)  \n" +
					           "4) E 離開選單 (Exit)" );
			
			Scanner sc = new Scanner(System.in);
			String comm = sc.next();
			if(comm.equals("E")) {
				return comm;
			}else if(comm.equals("G")) {
				return comm;
			}else if(comm.equals("R")) {
				return comm;
			}else if(comm.equals("W")) {
				return comm;
			}else {
				promptCommand();
			}
			/* Use the following will cause java.util.NoSuchElementException error
			if(comm.equals("E") || comm.equals("G") || comm.equals("R") || comm.equals("W")) {
				return comm;
			}else {
				promptCommand();
			}
			*/
		}
	}
	
	/*-----------------------------------------------------------------------------------------------------------
	promptID()  詢問ID
	return: ID  
	
	1.	print “輸入ID或 Q (結束使用)？”
	2.	read line, save it as ID return ID
	----------------------------------------------------------------------------------------------------------------*/
	public String promptID() {
		String id = null;
		System.out.println("輸入ID或 Q (結束使用)？");
		Scanner sc = new Scanner(System.in);
		id = sc.next();
		return id;
	}
	
	// written by myself
	/*-----------------------------------------------------------------------------------------------------------
	 * showFinishMsg() 是否有顯示出結束訊息
	 * return boolean
	 * 
	 * 1.print “輸入ID或 Q (結束使用)？”
	 * 2.user 輸入 Q(結束使用)
	 * 3.顯示出結束訊息 
	 -----------------------------------------------------------------------------------------------------------*/
	public boolean showFinishMsg() {
		System.out.println("結束了");
		return true;
	}
	
	// written by myself
	/*-----------------------------------------------------------------------------------------------------------
	 * showWelcomeMsg(String ID) 
	 * call GradeSystems aGS
	 * aGS.getName(ID)
	 * return boolean
	 * 顯示出ID對應的名字和歡迎信息
	-----------------------------------------------------------------------------------------------------------*/
	public boolean showWelcomeMsg(String ID) throws IOException{
		GradeSystems aGS = new GradeSystems();	
		System.out.println("Welcome " + aGS.getName(ID));
		return true;
	}
}
