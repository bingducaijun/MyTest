package mytest.eyeah.com.mytest;

import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class Userinfo implements Table{
private String userid;
public static String USERID = "userid";
public String getUserid(){
return userid;
}
public void setUserid(String userid){
this.userid=userid;

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
private String userpwd;
public static String USERPWD = "userpwd";
public String getUserpwd(){
return userpwd;
}
public void setUserpwd(String userpwd){
this.userpwd=userpwd;

}
private String usertouxiang;
public static String USERTOUXIANG = "usertouxiang";
public String getUsertouxiang(){
return usertouxiang;
}
public void setUsertouxiang(String usertouxiang){
this.usertouxiang=usertouxiang;

}
private Integer authorityid;
public static String AUTHORITYID = "authorityid";
public Integer getAuthorityid(){
return authorityid;
}
public void setAuthorityid(Integer authorityid){
this.authorityid=authorityid;

}
public void setAuthorityid(String authorityid){
if(authorityid==null||authorityid.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.authorityid=Integer.parseInt(authorityid);

}
private Integer onlinestateid;
public static String ONLINESTATEID = "onlinestateid";
public Integer getOnlinestateid(){
return onlinestateid;
}
public void setOnlinestateid(Integer onlinestateid){
this.onlinestateid=onlinestateid;

}
public void setOnlinestateid(String onlinestateid){
if(onlinestateid==null||onlinestateid.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.onlinestateid=Integer.parseInt(onlinestateid);

}
private String belongcity;
public static String BELONGCITY = "belongcity";
public String getBelongcity(){
return belongcity;
}
public void setBelongcity(String belongcity){
this.belongcity=belongcity;

}
private String coordinate;
public static String COORDINATE = "coordinate";
public String getCoordinate(){
return coordinate;
}
public void setCoordinate(String coordinate){
this.coordinate=coordinate;

}
private String idcard;
public static String IDCARD = "idcard";
public String getIdcard(){
return idcard;
}
public void setIdcard(String idcard){
this.idcard=idcard;

}
private String wasteid;
public static String WASTEID = "wasteid";
public String getWasteid(){
return wasteid;
}
public void setWasteid(String wasteid){
this.wasteid=wasteid;

}
private Integer qiangshishienable;
public static String QIANGSHISHIENABLE = "qiangshishienable";
public Integer getQiangshishienable(){
return qiangshishienable;
}
public void setQiangshishienable(Integer qiangshishienable){
this.qiangshishienable=qiangshishienable;

}
public void setQiangshishienable(String qiangshishienable){
if(qiangshishienable==null||qiangshishienable.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.qiangshishienable=Integer.parseInt(qiangshishienable);

}
private Integer qingyuyueenable;
public static String QINGYUYUEENABLE = "qingyuyueenable";
public Integer getQingyuyueenable(){
return qingyuyueenable;
}
public void setQingyuyueenable(Integer qingyuyueenable){
this.qingyuyueenable=qingyuyueenable;

}
public void setQingyuyueenable(String qingyuyueenable){
if(qingyuyueenable==null||qingyuyueenable.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.qingyuyueenable=Integer.parseInt(qingyuyueenable);

}
public String giveTableName() {
 return "userinfo";
}
public String givePrimaryColumnName() {
 return "userid";
}
public String[] giveDualPrimaryName() {
 return null;
}
public Userinfo(String userid ,String username ,String usertel ,String userpwd ,String usertouxiang ,Integer authorityid ,Integer onlinestateid ,String belongcity ,String coordinate ,String idcard ,String wasteid ,Integer qiangshishienable ,Integer qingyuyueenable ){
 super();
this.userid = userid;
this.username = username;
this.usertel = usertel;
this.userpwd = userpwd;
this.usertouxiang = usertouxiang;
this.authorityid = authorityid;
this.onlinestateid = onlinestateid;
this.belongcity = belongcity;
this.coordinate = coordinate;
this.idcard = idcard;
this.wasteid = wasteid;
this.qiangshishienable = qiangshishienable;
this.qingyuyueenable = qingyuyueenable;
}
public Userinfo(){}
public String toString(){
 return "{"+"userid:"+ (userid==null?"null":"'"+userid+"'")+","+"username:"+ (username==null?"null":"'"+username+"'")+","+"usertel:"+ (usertel==null?"null":"'"+usertel+"'")+","+"userpwd:"+ (userpwd==null?"null":"'"+userpwd+"'")+","+"usertouxiang:"+ (usertouxiang==null?"null":"'"+usertouxiang+"'")+","+"authorityid:"+ (authorityid==null?"null":"'"+authorityid+"'")+","+"onlinestateid:"+ (onlinestateid==null?"null":"'"+onlinestateid+"'")+","+"belongcity:"+ (belongcity==null?"null":"'"+belongcity+"'")+","+"coordinate:"+ (coordinate==null?"null":"'"+coordinate+"'")+","+"idcard:"+ (idcard==null?"null":"'"+idcard+"'")+","+"wasteid:"+ (wasteid==null?"null":"'"+wasteid+"'")+","+"qiangshishienable:"+ (qiangshishienable==null?"null":"'"+qiangshishienable+"'")+","+"qingyuyueenable:"+ (qingyuyueenable==null?"null":"'"+qingyuyueenable+"'")+"}" ;
}
}
