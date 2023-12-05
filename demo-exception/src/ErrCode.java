public enum ErrCode {

   //10001-20000
   NAME_TOO_LONG_EXCEPTION(10001, "Name is too Long."),//
   SERVER_TIMEOUT(10002,"Server Connection Time Out."),

   ARITHEMATIC_EXCEPTION(20001,"Arithematic Exception."),
   ;

   private int code;
   private String errMsg;

   private ErrCode(int code, String errMsg){
    this.code = code;
    this.errMsg = errMsg;
   }

   public int getCode(){
    return this.code;
   }

   public String getErrMsg(){
    return this.errMsg;
   }

   //"10002 - Server Connection Time Out."
   
}
