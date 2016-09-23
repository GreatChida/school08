package chap12;

public class TimeAccount {
	/** 口座名義 */
	private String name;
	/** 口座番号 */
	private String no;
	/** 預金残高 */
	private long balance;
	/** 定期の預金残高 */
	private long timeBalance;

	TimeAccount(String name, String no, long balance, long timeBalance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.timeBalance = timeBalance;
	}

	String getName() {
		return name;
	}

	String getNo() {
		return no;
	}

	long getBalance() {
		return balance;
	}

	long getTimeBalance() {
		return timeBalance;
	}

	/** k円預ける */
	void deposit(long k){
		balance += k;
	}

	/** k円おろす */
	void withDraw(long k){
		balance -= k;
	}

	/** 定期預金を解約して普通預金に移す */
	void cansel(){
		balance += timeBalance;
		timeBalance = 0;
	}
}
