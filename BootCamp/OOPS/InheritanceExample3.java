package BootCamp.OOPS;

class SomeName {
	int cid;
	String name;
	String addr;
	int num;
	
	public SomeName(int cid, String name, String addr, int num) {
		this.cid = cid;
		this.name = name;
		this.addr = addr;
		this.num = num;
	}
}

class RegularCustomer extends SomeName {
	float discount;
	public RegularCustomer(int cid, String name, String addr, int num, float discount) {
		super(cid,name,addr,num);
		this.discount = discount;
	}
}

public class InheritanceExample3 {

}
