package day26;

/*
 情境描述
	你是一家現代化洗衣店的系統設計師。為了提升顧客體驗，店內導入了一套「非同步取衣服務」系統。
	這個系統有三台自動洗衣機（同時最多可處理三位顧客的衣服），顧客送洗衣服後，店員會發給他一張「取衣單」。
	顧客可以不用在現場等候，等系統通知衣服洗好後再回來領取。
	洗衣過程需要一段時間，顧客在等待期間可以去做其他事情。當衣服洗好時，系統會通知顧客回來取衣。
 * */
public class Clothes {
	private boolean isClean; // 衣服是否已經洗乾淨?(預設是 false)
	private String owner; // 衣服的主人
	
	public Clothes(String owner) {
		this.owner = owner;
	}
	
	// 洗衣動作, 將衣服設定為洗乾淨了(true)
	public void wash() {
		isClean = true;
	}
	
	// 查詢衣服是否已經洗乾淨
	public boolean isClean() {
		return isClean;
	}
	
	@Override
	public String toString() {
		return owner + " 的" + (isClean ? "乾淨" : "髒") + "衣服";
	}
}




