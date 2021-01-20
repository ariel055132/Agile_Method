package ncu.cs.agile;

import java.io.IOException;
import java.util.Scanner;

/* main()  pseudo-code
 * aUI 不斷prompt 使用者 ID. (這表示promptID屬於aUI所屬的UI class, 見下面的架構設計)
    aUI 做checkID(ID) 看 ID 是否有2種異常 (異常1：ID含字母, 異常2：ID長度不對)
	aGradeSystem 做containID(ID) 看 ID 是否含在內 (異常3：無此ID)
	aGradeSystem 做getName(ID)
	aUI 做showWelcomeMsg, 

	aUI 不斷prompt 使用者 command. 
      aGradeSystem 做下列command
        showGrade, 
        showRank, 
        updateWeights 
		   每個aGrade 依照新的weights做 calculateTotalGrade 
        exit
        直到使用者exit
     直到使用者 quit.
  
     最後 aUI 做showFinishMsg.
     
     1.call UI() 建構 aUI
	 2.call GradeSystems() 建構 aGradeSystem
	 3.loop1 until Q (Quit)
		try
			1.	aUI call promptID() to get user ID  輸入ID或 Q (結束使用)?
			2.	aUI call checkID(ID) 看 ID是否有2種異常 (異常1：ID含字母，異常2：ID長度不對)
			3.	aGradeSystem call containID(ID) 看 ID 是否在內(異常3：無此ID)
			4.	aUI call showWelcomeMsg (ID)  ex. Welcome李威廷
			5.	loop2 until E (Exit)
			1.aUI call promptCommand() to prompt user for a command 
 			2.if command is E (Exit) then break
				else: G aGradeSystem call showGrade(ID), R showRank(ID), W updateWeights() 
			  end if
    	end loop2
	end try
	catch (IDExceptions1 e1) {print “這ID含字母 錯了!”}
	catch (IDExceptions2 e2) {print “這ID長度不對 錯了!”}
	catch (IDExceptions3 e3) {print “無這ID 錯了!”}
 	end loop1

4. aUI call showFinishMsg()  結束了
end main()
 */
public class Main extends Object{
	public static void main(String args[]) throws IOException {		
		UI aUI = new UI();	
		GradeSystems aGS = new GradeSystems();	
		while(true) {	
			String ID = aUI.promptID();
			// command equals to check two string are same or not
			if(ID.equals("Q")) {
				aUI.showFinishMsg();
				break;
			}else {
				try {	
					boolean b = aUI.checkID(ID);
					boolean c = aGS.containID(ID);	
					aUI.showWelcomeMsg(ID);
					while(true) {
						String command = aUI.promptCommand();
						if(command.equals("E")){
							break;
						}else if(command.equals("G")) {
							aGS.showGrade(ID);
						}else if(command.equals("W")) {
							aGS.updateWeights();
						}else if(command.equals("R")){
							aGS.showRank(ID);
						}else {
							//command = aUI.promptCommand();
						}
					}
				}catch(IDExceptions1 e1) {
					System.out.println("這ID含字母 錯了!");
				}catch(IDExceptions2 e2) {
					System.out.println("這ID長度不對 錯了!");
				}catch(IDExceptions3 e3) {
					System.out.println("無這ID 錯了!");
				}
			}
		}
	}
}
