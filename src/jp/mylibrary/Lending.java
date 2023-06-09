package jp.mylibrary;

/* DBの日付
 * 	rs.getDate()		//java.sql.Date型のオブジェクトが取れる
 * 
 * 	LocalDate型　⇒　java.sql.Date型
 * 	Date date = Date.valueOF(LocalDate型のオブジェクト)
 * 
 * 	java.sql.Date型 ⇒ LocalDate型
 * 	LocalDate.id = rs.getDate().toLocalDate();
 */

import java.sql.Date;

class Lending {
	private int book_id;
	private int user_id;
	private Date untilReturn;
	
	Lending(int book_id, int user_id, Date untilReturn) {
		this.book_id = book_id;
		this.user_id = user_id;
		this.untilReturn = untilReturn;
	}
	Lending(Date untilReturn) {
		this.untilReturn = untilReturn;
	}
	Lending(int book_id) {
		this.book_id = book_id;
	}
	Lending() {
		
	}

	int getBook_id() {
		return book_id;
	}

	void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	int getUser_id() {
		return user_id;
	}

	void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	Date getUntilReturn() {
		return untilReturn;
	}

	void setUntilReturn(Date untilReturn) {
		this.untilReturn = untilReturn;
	}
	void lendingStatus() {
		if(book_id != 0) {
			System.out.printf("貸出中%n");
		} else {
			System.out.printf("在庫あり%n");
		}
	}
}
