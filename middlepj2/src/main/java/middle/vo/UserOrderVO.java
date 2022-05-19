package middle.vo;

public class UserOrderVO {
private String uorderCode;
private String uorderDate;
private String uorderAddress;
private String uorderName;
private String uorderTel;


public UserOrderVO() {
   
}

public UserOrderVO(String uorderCode, String uorderDate, String uorderAddress, String uorderName, String uorderTel) {
   super();
   this.uorderCode = uorderCode;
   this.uorderDate = uorderDate;
   this.uorderAddress = uorderAddress;
   this.uorderName = uorderName;
   this.uorderTel = uorderTel;
}
public String getUorderCode() {
   return uorderCode;
}
public void setUorderCode(String uorderCode) {
   this.uorderCode = uorderCode;
}
public String getUorderDate() {
   return uorderDate;
}
public void setUorderDate(String uorderDate) {
   this.uorderDate = uorderDate;
}
public String getUorderAddress() {
   return uorderAddress;
}
public void setUorderAddress(String uorderAddress) {
   this.uorderAddress = uorderAddress;
}
public String getUorderName() {
   return uorderName;
}
public void setUorderName(String uorderName) {
   this.uorderName = uorderName;
}
public String getUorderTel() {
   return uorderTel;
}
public void setUorderTel(String uorderTel) {
   this.uorderTel = uorderTel;
}

@Override
public String toString() {
   return "UserOrderVO [uorderCode=" + uorderCode + ", uorderDate=" + uorderDate + ", uorderAddress=" + uorderAddress
         + ", uorderName=" + uorderName + ", uorderTel=" + uorderTel + "]";
}





}