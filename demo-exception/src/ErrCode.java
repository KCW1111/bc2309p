public enum ErrCode {

   //10001-20000
   NAME_TOO_LONG_EXCEPTION(10001, " Name is too Long"),//
   ;

   private int code;
   private String errMsg;

   private ErrCode(int code, String errMsg){
    this.code = code;
    this.errMsg = errMsg;
   }
}
