
public class MEE extends Employee{
	private String po; //직책
	//생성자
	public MEE(String epNum,String name, String depart, String po )
	{
		setEmNum(epNum);
		setName(name);
		setDepart(depart);
		this.po = po;

	}
	public String addStr() {
		String result = "";
		result += "직책 : " + po + "\n";
		return result;
	}

}
