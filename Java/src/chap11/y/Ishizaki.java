package chap11.y;

import chap11.x.Maruyama;

class Ishizaki {

	void func(Maruyama m){
		m.maru1();		// OK!    (publicしか呼べません)
//		m.maru2();		// ERROR! (proteced 呼べない)
//		m.maru3();		// ERROR! (default  呼べない)
//		m.maru4();		// ERROR! (private  呼べない)
	}
}
