package interfaces;

public class InterfaceIndianTeafic implements InterfaceCentralTrafic,InterfaceAnotherTrafic{

	public static void main(String[] args) {
		InterfaceCentralTrafic ct= new InterfaceIndianTeafic();
		ct.Flashstop();
		ct.redstop();
		ct.greengo();
		//ct.indiarule(); //showing because it is not implemented interface class
		System.out.println(a);
		InterfaceAnotherTrafic at = new InterfaceIndianTeafic();
		at.commonrules();
		InterfaceIndianTeafic it = new InterfaceIndianTeafic();
		it.indiarule();
		
		};

	public void indiarule()
	{
		System.out.println("india rule implemnation");
	}

	@Override
	public void greengo() {
		System.out.println("greengo implementation");
		
	}

	@Override
	public void redstop() {
		System.out.println("redgo implementation");
		
	}

	@Override
	public void Flashstop() {
		System.out.println("Flashgo implementation");
	}

	@Override
	public void commonrules() {
		System.out.println("commonrules for in everywhere");// TODO Auto-generated method stub
		
	}

}
