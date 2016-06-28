package mytest.eyeah.com.mytest;

import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class Dealanduser implements Table{
private String userid;
public static String USERID = "userid";
public String getUserid(){
return userid;
}
public void setUserid(String userid){
this.userid=userid;

}
private String dealid;
public static String DEALID = "dealid";
public String getDealid(){
return dealid;
}
public void setDealid(String dealid){
this.dealid=dealid;

}
private String starttime;
public static String STARTTIME = "starttime";
public String getStarttime(){
return starttime;
}
public void setStarttime(String starttime){
this.starttime=starttime;

}
private String endtime;
public static String ENDTIME = "endtime";
public String getEndtime(){
return endtime;
}
public void setEndtime(String endtime){
this.endtime=endtime;

}
private String dealthing;
public static String DEALTHING = "dealthing";
public String getDealthing(){
return dealthing;
}
public void setDealthing(String dealthing){
this.dealthing=dealthing;

}
private Double price;
public static String PRICE = "price";
public Double getPrice(){
return price;
}
public void setPrice(Double price){
this.price=price;

}
public void setPrice(String price){
if(price==null||price.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.price=Double.parseDouble(price);

}
private String unit;
public static String UNIT = "unit";
public String getUnit(){
return unit;
}
public void setUnit(String unit){
this.unit=unit;

}
private Double acount;
public static String ACOUNT = "acount";
public Double getAcount(){
return acount;
}
public void setAcount(Double acount){
this.acount=acount;

}
public void setAcount(String acount){
if(acount==null||acount.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.acount=Double.parseDouble(acount);

}
private String recyclerid;
public static String RECYCLERID = "recyclerid";
public String getRecyclerid(){
return recyclerid;
}
public void setRecyclerid(String recyclerid){
this.recyclerid=recyclerid;

}
private Integer dealstateid;
public static String DEALSTATEID = "dealstateid";
public Integer getDealstateid(){
return dealstateid;
}
public void setDealstateid(Integer dealstateid){
this.dealstateid=dealstateid;

}
public void setDealstateid(String dealstateid){
if(dealstateid==null||dealstateid.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.dealstateid=Integer.parseInt(dealstateid);

}
private Integer wasteid;
public static String WASTEID = "wasteid";
public Integer getWasteid(){
return wasteid;
}
public void setWasteid(Integer wasteid){
this.wasteid=wasteid;

}
public void setWasteid(String wasteid){
if(wasteid==null||wasteid.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.wasteid=Integer.parseInt(wasteid);

}
private Integer belongid;
public static String BELONGID = "belongid";
public Integer getBelongid(){
return belongid;
}
public void setBelongid(Integer belongid){
this.belongid=belongid;

}
public void setBelongid(String belongid){
if(belongid==null||belongid.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.belongid=Integer.parseInt(belongid);

}
private String username;
public static String USERNAME = "username";
public String getUsername(){
return username;
}
public void setUsername(String username){
this.username=username;

}
private String usertel;
public static String USERTEL = "usertel";
public String getUsertel(){
return usertel;
}
public void setUsertel(String usertel){
this.usertel=usertel;

}
private String coordinate;
public static String COORDINATE = "coordinate";
public String getCoordinate(){
return coordinate;
}
public void setCoordinate(String coordinate){
this.coordinate=coordinate;

}
private String belongcity;
public static String BELONGCITY = "belongcity";
public String getBelongcity(){
return belongcity;
}
public void setBelongcity(String belongcity){
this.belongcity=belongcity;

}
private String addressid;
public static String ADDRESSID = "addressid";
public String getAddressid(){
return addressid;
}
public void setAddressid(String addressid){
this.addressid=addressid;

}
private String dealaddress;
public static String DEALADDRESS = "dealaddress";
public String getDealaddress(){
return dealaddress;
}
public void setDealaddress(String dealaddress){
this.dealaddress=dealaddress;

}
private String newname;
public static String NEWNAME = "newname";
public String getNewname(){
return newname;
}
public void setNewname(String newname){
this.newname=newname;

}
private String newtel;
public static String NEWTEL = "newtel";
public String getNewtel(){
return newtel;
}
public void setNewtel(String newtel){
this.newtel=newtel;

}
private Double totalfee;
public static String TOTALFEE = "totalfee";
public Double getTotalfee(){
return totalfee;
}
public void setTotalfee(Double totalfee){
this.totalfee=totalfee;

}
public void setTotalfee(String totalfee){
if(totalfee==null||totalfee.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.totalfee=Double.parseDouble(totalfee);

}
private String alipayid;
public static String ALIPAYID = "alipayid";
public String getAlipayid(){
return alipayid;
}
public void setAlipayid(String alipayid){
this.alipayid=alipayid;

}
private String weixinid;
public static String WEIXINID = "weixinid";
public String getWeixinid(){
return weixinid;
}
public void setWeixinid(String weixinid){
this.weixinid=weixinid;

}
private Integer dealtypeid;
public static String DEALTYPEID = "dealtypeid";
public Integer getDealtypeid(){
return dealtypeid;
}
public void setDealtypeid(Integer dealtypeid){
this.dealtypeid=dealtypeid;

}
public void setDealtypeid(String dealtypeid){
if(dealtypeid==null||dealtypeid.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.dealtypeid=Integer.parseInt(dealtypeid);

}
private Integer paytype;
public static String PAYTYPE = "paytype";
public Integer getPaytype(){
return paytype;
}
public void setPaytype(Integer paytype){
this.paytype=paytype;

}
public void setPaytype(String paytype){
if(paytype==null||paytype.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.paytype=Integer.parseInt(paytype);

}
public String giveTableName() {
 return "dealanduser";
}
public String givePrimaryColumnName() {
 return "dealid";
}
public String[] giveDualPrimaryName() {
 return null;
}
public Dealanduser(String userid ,String dealid ,String starttime ,String endtime ,String dealthing ,Double price ,String unit ,Double acount ,String recyclerid ,Integer dealstateid ,Integer wasteid ,Integer belongid ,String username ,String usertel ,String coordinate ,String belongcity ,String addressid ,String dealaddress ,String newname ,String newtel ,Double totalfee ,String alipayid ,String weixinid ,Integer dealtypeid ,Integer paytype ){
 super();
this.userid = userid;
this.dealid = dealid;
this.starttime = starttime;
this.endtime = endtime;
this.dealthing = dealthing;
this.price = price;
this.unit = unit;
this.acount = acount;
this.recyclerid = recyclerid;
this.dealstateid = dealstateid;
this.wasteid = wasteid;
this.belongid = belongid;
this.username = username;
this.usertel = usertel;
this.coordinate = coordinate;
this.belongcity = belongcity;
this.addressid = addressid;
this.dealaddress = dealaddress;
this.newname = newname;
this.newtel = newtel;
this.totalfee = totalfee;
this.alipayid = alipayid;
this.weixinid = weixinid;
this.dealtypeid = dealtypeid;
this.paytype = paytype;
}
public Dealanduser(){}
public String toString(){
 return "{"+"userid:"+ (userid==null?"null":"'"+userid+"'")+","+"dealid:"+ (dealid==null?"null":"'"+dealid+"'")+","+"starttime:"+ (starttime==null?"null":"'"+starttime+"'")+","+"endtime:"+ (endtime==null?"null":"'"+endtime+"'")+","+"dealthing:"+ (dealthing==null?"null":"'"+dealthing+"'")+","+"price:"+ (price==null?"null":"'"+price+"'")+","+"unit:"+ (unit==null?"null":"'"+unit+"'")+","+"acount:"+ (acount==null?"null":"'"+acount+"'")+","+"recyclerid:"+ (recyclerid==null?"null":"'"+recyclerid+"'")+","+"dealstateid:"+ (dealstateid==null?"null":"'"+dealstateid+"'")+","+"wasteid:"+ (wasteid==null?"null":"'"+wasteid+"'")+","+"belongid:"+ (belongid==null?"null":"'"+belongid+"'")+","+"username:"+ (username==null?"null":"'"+username+"'")+","+"usertel:"+ (usertel==null?"null":"'"+usertel+"'")+","+"coordinate:"+ (coordinate==null?"null":"'"+coordinate+"'")+","+"belongcity:"+ (belongcity==null?"null":"'"+belongcity+"'")+","+"addressid:"+ (addressid==null?"null":"'"+addressid+"'")+","+"dealaddress:"+ (dealaddress==null?"null":"'"+dealaddress+"'")+","+"newname:"+ (newname==null?"null":"'"+newname+"'")+","+"newtel:"+ (newtel==null?"null":"'"+newtel+"'")+","+"totalfee:"+ (totalfee==null?"null":"'"+totalfee+"'")+","+"alipayid:"+ (alipayid==null?"null":"'"+alipayid+"'")+","+"weixinid:"+ (weixinid==null?"null":"'"+weixinid+"'")+","+"dealtypeid:"+ (dealtypeid==null?"null":"'"+dealtypeid+"'")+","+"paytype:"+ (paytype==null?"null":"'"+paytype+"'")+"}" ;
}
}
