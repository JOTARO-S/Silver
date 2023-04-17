package jp.ssie.ocjp;

/* 具象クラス
 *  そのクラスを基に具象化(インスタンス化)しオブジェクトを作成できるクラス
 *  　・クラス定義
 *  	オブジェクトを作衛するために、まず最初に設計図となるクラスを定義する
 *  	クラスブロック内には属性を変数で、操作をメソッドで記入する
 *  
 *  　[装飾子] class クラス名 { }		
 *
 * 		public class staff {	//従業員を表現するために作成したStaffクラスの構成
 * 		  	String name;		//この直下にある変数とメソッドを総称してメンバ、それぞれをメンバ変数、メンバメソッドという
 * 			
 * 			String getName() {
 * 				return name;
 * 			} 
 * 		
 * 	インスタンス変数(別の呼び方でフィールドということもある)
 * 　インスタンス変数とはクラスブロックに定義された変数のこと
 * 　そのクラスを基にインスタンス化された各オブジェクトが個々に持つ変数
 * 　インスタンス変数の呼び出しは参照変数名とインスタンス変数名で行う
 * 
 * 		public class test {
 * 		
 * 		}
 * 
 *  static変数(クラス変数)
 *  　インスタンス変数と同じようにクラスブロックに定義されているが、インスタンス化しないでも使用できる
 *  　static変数を他のクラスから呼び出す場合、クラス名.static変数名で行う
 *  　また、static変数はクラスをインスタンス化して複数のオブジェクトを生成しても変数は1つだけしか存在しない
 *  　生成された各オブジェクトはstatic変数を共有することになる
 *  　あるオブジェクトでstatic変数を呼び出し変更を加えた後、他のオブジェクトから
 *  　そのstatic変数へアクセスすると変更後の値を取得することとなる
 *  
 *  	static int test = 100;
 *  
 *  
 *  ローカル変数
 *  　メソッドの引数やメソッド内でのみ定義される変数
 *  　ローカル変数を宣言したメソッド内でのみ確保され、メソッドが終了すると解放される。
 *  
 *  	void method(int test)  {
 *  
 *  	}
 * 
 * 
 * 
 * 
 */



public class Sample5_1 {
	public static void main(String[] args) {
		//int x = 20; // x =インスタンス変数
		
		//static int y = 35; // y = static変数
		
		//void method(int z) { // z = ローカル変数
			//int i = 99; 	// i = ローカル変数
		//}
		

		
		
	}

}