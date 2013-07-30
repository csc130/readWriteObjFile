import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class Receipt implements Serializable {
	private int receiptNum;
	private String serverName;
	private Date receiptDate;
	private int itemQuantity;
	private BigDecimal receiptAmount;
	
	public Receipt(int receiptNum, String serverName, Date receiptDate,
			int itemQuantity, BigDecimal receiptAmount) {
		super();
		this.receiptNum = receiptNum;
		this.serverName = serverName;
		this.receiptDate = receiptDate;
		this.itemQuantity = itemQuantity;
		this.receiptAmount = receiptAmount;
	}

	public int getReceiptNum() {
		return receiptNum;
	}

	public void setReceiptNum(int receiptNum) {
		this.receiptNum = receiptNum;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public Date getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public BigDecimal getReceiptAmount() {
		return receiptAmount;
	}

	public void setReceiptAmount(BigDecimal receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	@Override
	public String toString() {
		return "Receipt [receiptNum=" + receiptNum + ", serverName="
				+ serverName + ", receiptDate=" + receiptDate
				+ ", itemQuantity=" + itemQuantity + ", receiptAmount="
				+ receiptAmount + "]";
	}
	
	
}
